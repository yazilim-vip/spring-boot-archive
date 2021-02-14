package vip.yazilim.thymeleaf.crud.service.impl

import org.springframework.stereotype.Service
import vip.yazilim.thymeleaf.crud.entity.Note
import vip.yazilim.thymeleaf.crud.repo.INoteRepo
import vip.yazilim.thymeleaf.crud.service.INoteService
import java.time.LocalDateTime
import java.util.*

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/13/2021
 */
@Service
class NoteServiceImpl(private val noteRepo: INoteRepo) : INoteService {

    override fun getAll(): List<Note> {
        return noteRepo.findAll()
    }

    override fun getById(id: Long): Optional<Note> {
        return noteRepo.findById(id)
    }

    override fun save(note: Note): Note {
        return noteRepo.save(note)
    }

    override fun delete(note: Note) {
        noteRepo.delete(note)
    }

}