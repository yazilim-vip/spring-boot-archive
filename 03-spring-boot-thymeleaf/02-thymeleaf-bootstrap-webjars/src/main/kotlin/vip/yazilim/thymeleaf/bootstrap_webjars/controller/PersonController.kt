package vip.yazilim.thymeleaf.bootstrap_webjars.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import vip.yazilim.thymeleaf.bootstrap_webjars.service.IPersonService

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
@Controller
class PersonController(private val personService: IPersonService) {

    @GetMapping("/person")
    fun person(model: Model): String {
        model.addAttribute("personList", personService.getAll())
        return "person"
    }

    @GetMapping("/person/{name}")
    fun getPersonByName(@PathVariable("name") name: String, model: Model): String {
        model.addAttribute("selectedPerson", personService.getByName(name))
        model.addAttribute("personList", personService.getAll())
        return "person"
    }
}