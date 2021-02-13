package vip.yazilim.data.h2.service.impl

import vip.yazilim.data.h2.entity.Note
import vip.yazilim.data.h2.repo.INoteRepo
import vip.yazilim.data.h2.service.INoteService

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/13/2021
 */
class NoteServiceImpl(private val noteRepo: INoteRepo) : INoteService {
    override fun save(note: Note): Note {
        return noteRepo.save(note)
    }

    override fun getAll(): List<Note> {
        return noteRepo.findAll()
    }

    override fun delete(note: Note) {
        noteRepo.delete(note)
    }
}