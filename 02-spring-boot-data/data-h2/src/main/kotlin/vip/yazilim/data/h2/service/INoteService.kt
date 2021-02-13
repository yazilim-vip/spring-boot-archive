package vip.yazilim.data.h2.service

import vip.yazilim.data.h2.entity.Note

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/13/2021
 */
interface INoteService {
    fun save(note: Note): Note?
    fun getAll(): List<Note>
    fun delete(note: Note)
}
