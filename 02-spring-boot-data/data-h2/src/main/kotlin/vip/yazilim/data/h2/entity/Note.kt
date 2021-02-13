package vip.yazilim.data.h2.entity

import vip.yazilim.data.h2.annotations.NoArgConstructor
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
@NoArgConstructor
class Note(
    var title: String,
    var text: String,
    var creationDate: LocalDateTime,
    var updateDate: LocalDateTime? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null

    override fun toString(): String {
        return "Note(id=$id, title='$title', text='$text', creationDate=$creationDate)"
    }
}