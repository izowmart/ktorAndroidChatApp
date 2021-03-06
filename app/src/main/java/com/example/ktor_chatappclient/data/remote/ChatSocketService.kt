package com.example.ktor_chatappclient.data.remote

import com.example.ktor_chatappclient.domain.model.Message
import com.example.ktor_chatappclient.util.Resource
import kotlinx.coroutines.flow.Flow

interface ChatSocketService {

    suspend fun initSession(username: String): Resource<Unit>

    suspend fun sendMessage(message: String)

    fun observeMessages(): Flow<Message>

    suspend fun closeSession()

    companion object {
        const val BASE_URL = "ws://b92f-105-163-1-48.ngrok.io"

    }

    sealed class Endpoints(val url: String) {
        object ChatSocket : Endpoints("$BASE_URL/chat-socket")
    }
}