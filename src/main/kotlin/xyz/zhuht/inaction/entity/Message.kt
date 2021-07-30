package xyz.zhuht.inaction.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

/**
 * @author zhuht
 * @date 2021/7/29 16:03
 */
@Table("MESSAGES")
data class Message(@Id val id: String?, val text: String)