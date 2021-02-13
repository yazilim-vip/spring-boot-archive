package vip.yazilim.thymeleaf.layouts.service

import vip.yazilim.thymeleaf.layouts.model.Person

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
interface IPersonService {
    fun getAll(): List<Person>
    fun getByName(name: String): Person
}