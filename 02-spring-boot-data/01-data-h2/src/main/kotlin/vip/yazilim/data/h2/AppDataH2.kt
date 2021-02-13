package vip.yazilim.data.h2

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import vip.yazilim.data.h2.entity.Note
import vip.yazilim.data.h2.service.INoteService
import java.time.LocalDateTime

val logger: Logger = LoggerFactory.getLogger(AppDataH2::class.java)

@SpringBootApplication
class AppDataH2(private val noteService: INoteService) : CommandLineRunner {
    override fun run(vararg args: String?) {

        logger.info("==== Create Data ====")
        noteService.save(
            Note(
                title = "My First Note",
                text = "Note text",
                creationDate = LocalDateTime.now()
            )
        )
        noteService.save(
            Note(
                title = "My First Note 2",
                text = "Note text 2",
                creationDate = LocalDateTime.now()
            )
        )

        logger.info("==== GetAll ====")
        noteService.getAll().forEach { note ->
            logger.info(note.toString())
            note.text = "updated text"
            noteService.save(note)
        }

        logger.info("==== After Update ====")
        noteService.getAll().forEach { note ->
            logger.info(note.toString())
        }
    }
}

fun main(args: Array<String>) {
    runApplication<AppDataH2>(*args)
}
