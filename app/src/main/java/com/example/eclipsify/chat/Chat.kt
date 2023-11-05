import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.gson.JsonObject
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.*
import java.io.IOException
import com.google.gson.Gson
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody  // Added this import

@Composable
fun ChatbotScreen() {
    val (messages, setMessages) = remember { mutableStateOf(emptyList<Message>()) }
    val inputText = remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        ChatMessages(messages)
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            TextField(
                value = inputText.value,
                onValueChange = { inputText.value = it },
                modifier = Modifier.weight(1f)
            )
            Button(onClick = {
                sendMessage(inputText.value) { message ->
                    setMessages(messages + message)
                    inputText.value = ""
                }
            }) {
                Text("Send")
            }
        }
    }
}

@Composable
fun ChatMessages(messages: List<Message>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        messages.forEach { message ->
            ChatMessage(message)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun ChatMessage(message: Message) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        if (message.isFromUser) {
            Spacer(modifier = Modifier.weight(1f))
            ChatMessageBubble(message)
        } else {
            ChatMessageBubble(message)
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun ChatMessageBubble(message: Message) {

        Card(modifier = Modifier
            .padding(vertical = 8.dp)
            .wrapContentWidth(), shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = message.content,Modifier.padding(8.dp))
        }
    }


data class Message(val content: String, val isFromUser: Boolean)

fun sendMessage(inputText: String, callback: (Message) -> Unit) {
    val client = OkHttpClient()

    val requestContent = """
        {
          "prompt": "The user says: $inputText",
          "temperature": 0.7,
          "max_tokens": 100
        }
    """.trimIndent()

    val mediaType = "application/json; charset=utf-8".toMediaTypeOrNull()
    val requestBody = requestContent.toRequestBody(mediaType)

    val request = Request.Builder()
        .url("https://api.openai.com/v1/engines/davinci-codex/completions")
        .addHeader("Authorization", "Bearer YOUR_OPENAI_API_KEY")
        .post(requestBody)
        .build()

    val coroutineScope = CoroutineScope(Dispatchers.IO)
    coroutineScope.launch {
        try {
            val response = client.newCall(request).execute()
            if (response.isSuccessful) {
                val jsonObject = Gson().fromJson(response.body!!.string(), JsonObject::class.java)
                val completion = jsonObject.getAsJsonArray("choices").first().asJsonObject.get("text").asString
                callback(Message(completion, false))
            } else {
                callback(Message("Error: ${response.code}", false))
            }
        } catch (e: IOException) {
            callback(Message("Error: ${e.message}", false))
        }
    }
}

@Preview
@Composable
fun ChatbotScreenPreview() {
    ChatbotScreen()
}
