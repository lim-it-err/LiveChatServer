package com.chatroom.handler
import com.chatroom.model.Request
import com.chatroom.model.Response


interface RequestHandler {
    fun handleRequest(request: Request): Response
}