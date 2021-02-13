package vip.yazilim.thymeleaf.crud

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import vip.yazilim.thymeleaf.crud.entity.Note
import vip.yazilim.thymeleaf.crud.service.INoteService
import java.time.LocalDateTime

val logger: Logger = LoggerFactory.getLogger(AppThymeleafCrud::class.java)

@SpringBootApplication
class AppThymeleafCrud(private val noteService: INoteService) : CommandLineRunner {
    override fun run(vararg args: String?) {
        logger.info("==== Create Data ====")
        create(title = "My First Note", text = "Note text")
        create(title = "My First Note 2", text = "Note text 2")
    }

    fun create(title: String, text: String) {
        val note = Note()
        note.title = title
        note.text = text
        note.creationDate = LocalDateTime.now()
        noteService.save(note)
    }
}

fun main(args: Array<String>) {
    runApplication<AppThymeleafCrud>(*args)
}
