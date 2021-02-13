package vip.yazilim.data.h2.service.impl

import org.springframework.stereotype.Service
import vip.yazilim.data.h2.entity.Note
import vip.yazilim.data.h2.repo.INoteRepo
import vip.yazilim.data.h2.service.INoteService
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