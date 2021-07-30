package xyz.zhuht.inaction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
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

