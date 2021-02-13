package vip.yazilim.thymeleaf.hello_world.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
@Controller
class WelcomeController {

    @GetMapping("/")
    fun welcome(): String {
        return "welcome"
    }
}