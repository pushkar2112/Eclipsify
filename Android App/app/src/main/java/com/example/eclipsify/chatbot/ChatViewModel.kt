package com.example.eclipsify.chatbot

import androidx.lifecycle.ViewModel

class ChatViewModel: ViewModel() {
    val chatMessages = mutableListOf<ChatMessage>()
}
data class ChatMessage(val text: String, val isUser: Boolean)
