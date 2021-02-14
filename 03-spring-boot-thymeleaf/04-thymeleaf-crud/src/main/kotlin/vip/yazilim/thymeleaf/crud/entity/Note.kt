package vip.yazilim.thymeleaf.crud.entity

import java.time.LocalDateTime
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
class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
    var title: String? = null
    var text: String? = null
    var creationDate: LocalDateTime? = null
    var updateDate: LocalDateTime? = null

    override fun toString(): String {
        return "Note(id=$id, title='$title', text='$text', creationDate=$creationDate)"
    }
}