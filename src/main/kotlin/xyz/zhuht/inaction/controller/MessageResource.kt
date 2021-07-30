package xyz.zhuht.inaction.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import xyz.zhuht.inaction.entity.Message
import xyz.zhuht.inaction.service.MessageService

/**
 * @author zhuht
 * @date 2021/7/29 16:00
 */
@RestController
class MessageResource(val service: MessageService) {

    @GetMapping
    fun index(): List<Message> = service.findMessages()

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }
}