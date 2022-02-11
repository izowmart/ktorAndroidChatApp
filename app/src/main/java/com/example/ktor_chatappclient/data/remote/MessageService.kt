package com.example.ktor_chatappclient.data.remote

import com.example.ktor_chatappclient.domain.model.Message

interface MessageService {
    suspend fun getAllMessages(): List<Message>

    companion object{
        const val BASE_URL = "http://192.168.0.2:8080"
    }

    sealed class Endpoints(val url: String){
        object GetAllMessages: Endpoints("$BASE_URL/messages")
    }
}