package com.songeun.demo_kotlin.bootstrap

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MessageController {

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
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!"),
        Message("4", "안녕하세요!"),
    )

}