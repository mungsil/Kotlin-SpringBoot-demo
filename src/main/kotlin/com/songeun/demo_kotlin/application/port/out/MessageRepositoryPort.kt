package com.songeun.demo_kotlin.application.port.out

import com.songeun.demo_kotlin.infrastructure.entity.MessageEntity

interface MessageRepositoryPort {

    fun save(entity: MessageEntity) : SavedMessage

}