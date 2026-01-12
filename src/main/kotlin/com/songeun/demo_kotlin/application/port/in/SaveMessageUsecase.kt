package com.songeun.demo_kotlin.application.port.`in`

import com.songeun.demo_kotlin.application.port.out.SavedMessage

interface SaveMessageUsecase {

    fun saveMessage(command : SaveCommand) : SavedMessage

}