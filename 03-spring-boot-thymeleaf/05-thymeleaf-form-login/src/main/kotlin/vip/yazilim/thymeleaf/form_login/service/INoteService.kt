package vip.yazilim.thymeleaf.form_login.service


import vip.yazilim.thymeleaf.form_login.entity.Note
import java.util.*

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/13/2021
 */
interface INoteService {
    fun getAll(): List<Note>
    fun getById(id: Long): Optional<Note>
    fun save(note: Note): Note
    fun delete(note: Note)
}
