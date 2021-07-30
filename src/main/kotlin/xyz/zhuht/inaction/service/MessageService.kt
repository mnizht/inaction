package xyz.zhuht.inaction.service

import org.springframework.stereotype.Service
import xyz.zhuht.inaction.dao.MessageRepository
import xyz.zhuht.inaction.entity.Message

/**
 * @author zhuht
 * @date 2021/7/29 15:57
 */
@Service
class MessageService(val db: MessageRepository) {

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message) {
        db.save(message)
    }

}