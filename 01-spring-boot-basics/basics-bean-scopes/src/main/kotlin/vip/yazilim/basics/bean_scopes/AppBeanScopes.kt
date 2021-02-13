package vip.yazilim.basics.bean_scopes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppBeanScopes

fun main(args: Array<String>) {
    runApplication<AppBeanScopes>(*args)
}
