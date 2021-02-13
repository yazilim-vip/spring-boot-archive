package vip.yazilim.data.h2

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import vip.yazilim.data.h2.entity.Note
import vip.yazilim.data.h2.service.INoteService
import java.time.LocalDate

val logger: Logger = LoggerFactory.getLogger(AppDataH2::class.java)

@SpringBootApplication
class AppDataH2(private val noteService: INoteService) : CommandLineRunner {
    override fun run(vararg args: String?) {
        noteService.save(
            Note(
                title = "My First Note",
                text = "Note text",
                creationDate = LocalDate.now()
            )
        )
        noteService.save(
            Note(
                title = "My First Note 2",
                text = "Note text 2",
                creationDate = LocalDate.now()
            )
        )
        noteService.getAll().forEach {
            logger.info(it.toString())
        }
    }
}

fun main(args: Array<String>) {

    // Context 1
    val ctx = runApplication<AppDataH2>(*args)
    try {
//        logger.info("Context1: ${ctx.getBean(Pojo::class.java)}")
    } catch (exception: Exception) {
//        logger.error("Context 1 Could not get Bean :: ${exception.message}", exception)
    }

}
