package com.example.ktor_chatappclient.presentation.chat

import com.example.ktor_chatappclient.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
) {
}