package com.songeun.demo_kotlin.infrastructure.entity

import jakarta.persistence.*

@Entity
@Table(name = "message")
class MessageEntity (
    @Id
    var id: String = "",
    @Column(nullable = false)
    var text: String = ""
)