package vip.yazilim.thymeleaf.bootstrap_webjars.service

import vip.yazilim.thymeleaf.bootstrap_webjars.model.Person

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
interface IPersonService {
    fun getAll(): List<Person>
    fun getByName(name: String): Person
}