package vip.yazilim.thymeleaf.crud.controller

import javassist.NotFoundException
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import vip.yazilim.thymeleaf.crud.entity.Note
import vip.yazilim.thymeleaf.crud.service.INoteService
import vip.yazilim.thymeleaf.crud.service.impl.NoteServiceImpl
import java.time.LocalDateTime
import java.util.*

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
@Controller
@RequestMapping("/note")
class NoteController(private val noteService: INoteService) {

    private val logger = LoggerFactory.getLogger(NoteController::class.java)

    @GetMapping
    fun listNotePage(model: Model): String {
        model.addAttribute("noteList", noteService.getAll())
        return "note-list"
    }

    @GetMapping("/edit")
    fun createNotePage(model: Model): String {
        model.addAttribute("note", Note())
        return "note-edit"
    }

    @GetMapping("/edit/{id}")
    fun updateNotePage(@PathVariable("id") id: Long, model: Model): String {
        val note = noteService.getById(id).orElseThrow {
            NotFoundException("Not Found note[$id")
        }
        model.addAttribute("note", note)
        return "note-edit"
    }

    @PostMapping("/edit")
    fun editNotePage(@ModelAttribute note: Note, model: Model): String {
        return try {
            note.creationDate = LocalDateTime.now()
            val createdNote = noteService.save(note)
            "redirect:/note/edit/${createdNote.id}?error=false"
        } catch (exception: Exception) {
            logger.error("Error while editing note", exception)
            model.addAttribute("note", note)
            "note-edit"
        }
    }

}