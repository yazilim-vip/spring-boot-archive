package vip.yazilim.basics.bean_scopes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import vip.yazilim.basics.component_scan.ctx1.AppComponentScanCtx1

@SpringBootApplication
class AppBeanScopes

fun main(args: Array<String>) {
    runApplication<AppBeanScopes>(*args)
}
