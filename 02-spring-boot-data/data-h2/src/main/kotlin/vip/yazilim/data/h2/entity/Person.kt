package vip.yazilim.data.h2.entity

import vip.yazilim.data.h2.annotations.NoArgConstructor
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
class Person(
    val name: String,
    val surname: String,
    val age: Int
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Long? = null

}