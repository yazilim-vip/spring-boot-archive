package vip.yazilim.thymeleaf.form_login.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

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

    @NotBlank(message = "Title cannot be empty")
    var title: String? = null

    @NotBlank(message = "Title cannot be empty")
    var text: String? = null
    var creationDate: LocalDateTime? = null
    var updateDate: LocalDateTime? = null

    override fun toString(): String {
        return "Note(id=$id, title='$title', text='$text', creationDate=$creationDate)"
    }
}