package com.songeun.demo_kotlin.application.service

import com.songeun.demo_kotlin.application.port.`in`.SaveCommand
import com.songeun.demo_kotlin.application.port.`in`.SaveMessageUsecase
import com.songeun.demo_kotlin.application.port.out.MessageRepositoryPort
import com.songeun.demo_kotlin.application.port.out.SavedMessage
import com.songeun.demo_kotlin.infrastructure.entity.MessageEntity
import org.springframework.stereotype.Service

@Service
class MessageService(private val repository: MessageRepositoryPort) : SaveMessageUsecase {

    override fun saveMessage(command: SaveCommand): SavedMessage {
        val entity = mapToEntity(command)
        return repository.save(entity)
    }

    private fun mapToEntity(command: SaveCommand): MessageEntity {
        if (command.text == null){
            return MessageEntity(command.id, "기본 메시지입니다.")
        }
        return MessageEntity(command.id, command.text)
    }

}