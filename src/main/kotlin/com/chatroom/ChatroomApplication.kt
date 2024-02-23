package com.chatroom

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
//import com.chatroom.database.DatabaseManager
//import com.chatroom.database.MySQLDatabaseManager
import com.chatroom.server.ServerManager
import com.chatroom.server.ChatServerManager

@SpringBootApplication
class ChatroomApplication

fun main(args: Array<String>) {
//	val dbManager: DatabaseManager = MySQLDatabaseManager()
	val serverManager: ServerManager = ChatServerManager()
	serverManager.startServer()
}
