package vip.yazilim.thymeleaf.bootstrap_webjars.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
@Controller
@RequestMapping("/about")
class AboutController {

    @GetMapping("")
    fun welcome(): String {
        return "about"
    }
}