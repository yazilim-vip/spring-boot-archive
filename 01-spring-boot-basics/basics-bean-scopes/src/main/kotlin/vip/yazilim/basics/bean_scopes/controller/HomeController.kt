package vip.yazilim.basics.bean_scopes.controller

import org.springframework.stereotype.Controller
import vip.yazilim.basics.bean_scopes.counter.PrototypeCounter
import vip.yazilim.basics.bean_scopes.counter.RequestCounter
import vip.yazilim.basics.bean_scopes.counter.SessionCounter
import vip.yazilim.basics.bean_scopes.counter.SingletonCounter
import org.springframework.ui.Model

import org.springframework.web.bind.annotation.RequestMapping


/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/11/2021
 */
@Controller
class HomeController(
    private val prototypeCounter: PrototypeCounter,
    private val requestCounter: RequestCounter,
    private val sessionCounter: SessionCounter,
    private val singletonCounter: SingletonCounter,

    private val prototypeCounter2: PrototypeCounter,
    private val requestCounter2: RequestCounter,
    private val sessionCounter2: SessionCounter,
    private val singletonCounter2: SingletonCounter
) {

    @RequestMapping("/")
    fun home(model: Model): String? {
        model.addAttribute("prototype_var", prototypeCounter.counter)
        model.addAttribute("prototype2_var", prototypeCounter2.counter)
        model.addAttribute("request_var", requestCounter.counter)
        model.addAttribute("session_var", sessionCounter.counter)
        model.addAttribute("singleton_var", singletonCounter.counter)
        model.addAttribute("singleton2_var", singletonCounter2.counter)
        return "home"
    }

    @RequestMapping("/prototype")
    fun prototypeVar(model: Model): String? {
        prototypeCounter.increment()
        home(model)
        return "redirect:/"
    }

    @RequestMapping("/prototype2")
    fun prototype2Var(model: Model): String? {
        prototypeCounter2.increment()
        home(model)
        return "redirect:/"
    }

    @RequestMapping("/request")
    fun requestVar(model: Model): String? {
        requestCounter.increment()
        home(model)
        return "redirect:/"
    }

    @RequestMapping("/session")
    fun sessionVar(model: Model): String? {
        sessionCounter.increment()
        home(model)
        return "redirect:/"
    }

    @RequestMapping("/singleton")
    fun singletonVar(model: Model): String? {
        singletonCounter.increment()
        home(model)
        return "redirect:/"
    }

    @RequestMapping("/singleton2")
    fun singleton2Var(model: Model): String? {
        singletonCounter2.increment()
        home(model)
        return "redirect:/"
    }

}