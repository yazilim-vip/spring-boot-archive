package vip.yazilim.thymeleaf.hello_world.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import java.util.*

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