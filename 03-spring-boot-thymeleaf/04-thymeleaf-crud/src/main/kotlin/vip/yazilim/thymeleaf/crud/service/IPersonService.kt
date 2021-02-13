package vip.yazilim.thymeleaf.crud.service

import vip.yazilim.thymeleaf.crud.model.Person

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
interface IPersonService {
    fun getAll(): List<Person>
    fun getByName(name: String): Person
}