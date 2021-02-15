package vip.yazilim.thymeleaf.form_login.controller

import javassist.NotFoundException
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*
import vip.yazilim.thymeleaf.form_login.entity.Note
import vip.yazilim.thymeleaf.form_login.service.INoteService
import java.time.LocalDateTime
import javax.validation.Valid;

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
    fun editNotePage(@Valid note: Note, bindingResult: BindingResult, model: Model): String {

        if (bindingResult.hasErrors()) {
            return "note-edit"
        }

        return try {
            note.creationDate = LocalDateTime.now()
            val editedNote = noteService.save(note)
            "redirect:/note/edit/${editedNote.id}"
        } catch (exception: Exception) {
            logger.error("Error while editing note", exception)
            model.addAttribute("note", note)
            "note-edit"
        }
    }

    @GetMapping("/delete/{id}")
    fun deleteNote(@PathVariable("id") id: Long, model: Model): String {
        val note = noteService.getById(id).orElseThrow {
            NotFoundException("Not Found note[$id")
        }
        noteService.delete(note)
        return "redirect:/note"
    }

}