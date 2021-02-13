package vip.yazilim.data.h2

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppDataH2


val logger: Logger = LoggerFactory.getLogger(AppDataH2::class.java)

fun main(args: Array<String>) {

    // Context 1
    val ctx = runApplication<AppDataH2>(*args)
    try {
//        logger.info("Context1: ${ctx.getBean(Pojo::class.java)}")
    } catch (exception: Exception) {
//        logger.error("Context 1 Could not get Bean :: ${exception.message}", exception)
    }

}
