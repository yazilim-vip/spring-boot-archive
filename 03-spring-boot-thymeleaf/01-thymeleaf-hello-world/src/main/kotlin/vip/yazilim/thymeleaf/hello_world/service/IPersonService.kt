package vip.yazilim.thymeleaf.hello_world.service

import vip.yazilim.thymeleaf.hello_world.model.Person

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
interface IPersonService {
    fun getAll(): List<Person>
    fun getByName(name: String): Person
}