package vip.yazilim.thymeleaf.form_login.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
@Controller
@RequestMapping("/about")
class AboutController {

    @GetMapping("")
    fun about(): String {
        return "about"
    }

}