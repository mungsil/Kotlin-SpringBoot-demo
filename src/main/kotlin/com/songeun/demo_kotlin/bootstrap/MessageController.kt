package com.songeun.demo_kotlin.bootstrap

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {

    /**
     * Demonstrates Kotlin features:
     *  * - Single-expression functions: index()
     *  * - Type inference for function return types (via '=')
     *  * - String templates: `$name`
     */
    @GetMapping("/")
    fun index(@RequestParam("name") name : String) = "Hello, $name !"

}