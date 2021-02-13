package vip.yazilim.thymeleaf.crud.service.impl

import org.springframework.stereotype.Service
import vip.yazilim.thymeleaf.crud.model.Person
import vip.yazilim.thymeleaf.crud.service.IPersonService

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020w
 */
@Service
class PersonServiceImpl : IPersonService {

    private val personData: List<Person> = arrayListOf(
        Person("mehmet", "sen", 22),
        Person("arif", "sen", 23),
        Person("emre", "sen", 24),
    )

    override fun getAll(): List<Person> {
        return personData
    }

    override fun getByName(name: String): Person {
        return personData.first { person: Person -> person.name == name }
    }
}