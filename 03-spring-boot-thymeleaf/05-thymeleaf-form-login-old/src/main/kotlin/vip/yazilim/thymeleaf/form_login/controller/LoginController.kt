package vip.yazilim.thymeleaf.form_login.controller

import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LoginController() {

    // Login form
    @GetMapping("/login")
    fun login(): String {
        SecurityContextHolder.getContext().authentication
        return "login"
    }

    // Login form with error
    @GetMapping("/login-error")
    fun loginError(model: Model): String {
        model.addAttribute("loginError", true)
        return "login"
    }
}