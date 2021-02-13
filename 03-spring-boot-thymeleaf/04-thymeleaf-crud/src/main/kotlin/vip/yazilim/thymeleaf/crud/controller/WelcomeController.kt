package vip.yazilim.thymeleaf.crud.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import java.util.*

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
@Controller
class WelcomeController {

    @GetMapping("/message/{path-variable}")
    fun welcome(
        @PathVariable("path-variable") pathVariable: String,
        model: Model
    ): String {
        model.addAttribute("message", pathVariable)
        return "welcome"
    }

    @GetMapping("/")
    fun welcome2(
        @RequestParam(name = "message") message: Optional<String>,
        model: Model
    ): String {
        model.addAttribute("message", message.orElseGet { "default-value" })
        return "welcome"
    }
}