package com.songeun.demo_kotlin.bootstrap

import com.songeun.demo_kotlin.application.port.`in`.SaveCommand
import com.songeun.demo_kotlin.application.port.`in`.SaveMessageUsecase
import com.songeun.demo_kotlin.application.port.out.SavedMessage
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RestController
@RequestMapping("/api")
class MessageController (
    /**
     * Demonstrates Kotlin features:
     * - Primary constructor as part of the class header,
     *   placed after the class name and optional type parameters
     */
    private val saveMessageUsecase : SaveMessageUsecase
) {

    /**
     * Demonstrates Kotlin features:
     *  - Single-expression functions: index()
     *  - Type inference for function return types (via '=')
     *  - String templates: `$name`
     */
    @GetMapping("/v1/messages")
    fun index(@RequestParam("name") name : String) = "Hello, $name !"

    /**
     * Demonstrates Kotlin features:
     * - listOf() creates a read-only (immutable) collection
     * - Trailing commas: A comma after the last item is allowed and helps with version control diffs
     */
    @GetMapping("/v2/messages")
    fun listMessages() = listOf(
        CreateMessageRequest("1", "Hello!"),
        CreateMessageRequest("2", "Bonjour!"),
        CreateMessageRequest("3", "Privet!"),
        CreateMessageRequest("4", "안녕하세요!"),
    )


    @GetMapping("/v3/messages")
    fun findMessages(@RequestParam id : String) = "sdfdf"

    @PostMapping("/v3/messages")
    fun save(@RequestBody req: CreateMessageRequest) : ResponseEntity<SavedMessage> {
        val savedMessage = saveMessageUsecase.saveMessage(
            SaveCommand(req.id, req.text)
        )
        return ResponseEntity
            .created(URI("/${savedMessage.id}"))
            .body(savedMessage)
    }

}