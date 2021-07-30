package xyz.zhuht.inaction.dao

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import xyz.zhuht.inaction.entity.Message

/**
 * @author zhuht
 * @date 2021/7/29 15:55
 */
interface MessageRepository : CrudRepository<Message, String> {

    @Query("select * from messages")
    fun findMessages(): List<Message>
}