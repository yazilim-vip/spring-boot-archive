package vip.yazilim.data.h2.entity

import vip.yazilim.data.h2.annotations.NoArgConstructor
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 *,
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
@Entity
@NoArgConstructor
class Note(
    val title: String,
    val text: String,
    val creationDate: LocalDate,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Long? = null
    override fun toString(): String {
        return "Note(id=$id, title='$title', text='$text', creationDate=$creationDate)"
    }
}