package vip.yazilim.thymeleaf.form_login.service

import vip.yazilim.thymeleaf.form_login.model.Person

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
interface IPersonService {
    fun getAll(): List<Person>
    fun getByName(name: String): Person
}