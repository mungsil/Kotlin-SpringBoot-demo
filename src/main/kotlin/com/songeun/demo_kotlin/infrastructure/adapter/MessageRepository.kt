package com.songeun.demo_kotlin.infrastructure.adapter

import com.songeun.demo_kotlin.application.port.out.MessageRepositoryPort
import com.songeun.demo_kotlin.application.port.out.SavedMessage
import com.songeun.demo_kotlin.infrastructure.entity.MessageEntity
import org.springframework.stereotype.Repository

@Repository
class MessageRepository(private val repository: MessageJpaRepository)
    : MessageRepositoryPort {

    override fun save(entity: MessageEntity): SavedMessage {
        val saved = repository.save(entity)
        return SavedMessage(saved.id, saved.text)
    }

}