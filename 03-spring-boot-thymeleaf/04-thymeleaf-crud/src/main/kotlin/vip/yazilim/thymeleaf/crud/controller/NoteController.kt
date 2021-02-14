package vip.yazilim.thymeleaf.crud.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import vip.yazilim.thymeleaf.crud.entity.Note
import vip.yazilim.thymeleaf.crud.service.INoteService
import vip.yazilim.thymeleaf.crud.service.impl.NoteServiceImpl
import java.util.*

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
@Controller
@RequestMapping("/note")
class NoteController(private val noteService: INoteService) {

    @GetMapping
    fun listNotePage(model: Model): String {
        model.addAttribute("noteList", noteService.getAll())
        return "note-list"
    }

    @GetMapping(value = ["/edit", "/edit/{id}"])
    fun editNotePage(@PathVariable("id") id: Long, model: Model): String {
        val note = noteService.getById(id).orElseGet { Note() }
        model.addAttribute("note", note)
        return "note-edit"
    }

}