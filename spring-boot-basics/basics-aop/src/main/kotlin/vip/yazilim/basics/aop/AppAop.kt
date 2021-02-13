package vip.yazilim.basics.aop

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppAop

private val logger = LoggerFactory.getLogger(BusinessAspect::class.java)

fun main(args: Array<String>) {
    val ctx = runApplication<AppAop>(*args)

    // aspect
    val business = ctx.getBean(Business::class.java)


    // testing aspect
    business.getARecord()
    try {
        business.wrong()
    } catch (e: Exception) {
        logger.error("An exception occur on Business Object")
    }

}
