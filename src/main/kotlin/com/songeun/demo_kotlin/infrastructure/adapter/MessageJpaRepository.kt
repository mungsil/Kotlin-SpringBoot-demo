package com.songeun.demo_kotlin.infrastructure.adapter

import com.songeun.demo_kotlin.infrastructure.entity.MessageEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MessageJpaRepository : JpaRepository<MessageEntity, String> {
}