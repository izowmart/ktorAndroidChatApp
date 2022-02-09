package com.example.ktor_chatappclient.domain.model

data class Message(
    val text: String,
    val formattedTime: String,
    val username: String
)
