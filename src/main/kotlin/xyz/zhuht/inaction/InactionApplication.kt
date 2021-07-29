package xyz.zhuht.inaction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * The DemoApplication class is not declared as open, since the kotlin-spring plugin does that automatically.
 * */
@SpringBootApplication
class InactionApplication

fun main(args: Array<String>) {
    runApplication<InactionApplication>(*args)
}


data class Message(val id: String?, val text: String)

@RestController
class MessageResource {
    @GetMapping
    fun index(): List<Message> = listOf(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!"),
    )
}