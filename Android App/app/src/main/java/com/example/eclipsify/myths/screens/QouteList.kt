package com.example.eclipsify.myths.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.eclipsify.myths.models.Quote

@Composable
fun QuoteList(data:Array<Quote>) {

    Column(
        modifier = Modifier.background(Color.Transparent)
    ) {
        data.forEach { quote ->
            QuoteListItem(quote = quote)
        }
    }

}