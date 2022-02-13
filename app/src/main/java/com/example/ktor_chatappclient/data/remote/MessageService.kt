package com.example.ktor_chatappclient.data.remote

import com.example.ktor_chatappclient.domain.model.Message

interface MessageService {
    suspend fun getAllMessages(): List<Message>

    companion object{
        const val BASE_URL = "https://b92f-105-163-1-48.ngrok.io"
    }

    sealed class Endpoints(val url: String){
        object GetAllMessages: Endpoints("$BASE_URL/messages")
    }

}