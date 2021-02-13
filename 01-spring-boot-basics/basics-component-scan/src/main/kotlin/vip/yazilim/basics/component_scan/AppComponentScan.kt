package vip.yazilim.basics.component_scan

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import vip.yazilim.basics.component_scan.ctx1.AppComponentScanCtx1
import vip.yazilim.basics.component_scan.ctx1.Pojo
import vip.yazilim.basics.component_scan.ctx2.AppComponentScanCtx2

@SpringBootApplication
class AppComponentScan


val logger: Logger = LoggerFactory.getLogger(AppComponentScan::class.java)

fun main(args: Array<String>) {

    // Context 1
    val ctx1 = runApplication<AppComponentScanCtx1>(*args)
    try {
        logger.info("Context1: ${ctx1.getBean(Pojo::class.java)}")
    } catch (exception: Exception) {
        logger.error("Context 1 Could not get Bean :: ${exception.message}", exception)
    }

    // Context 2
    val ctx2 = runApplication<AppComponentScanCtx2>(*args)
    try {
        logger.info("Context1: ${ctx2.getBean(Pojo::class.java)}")
    } catch (exception: Exception) {
        logger.error("Context 2 Could not get Bean :: ${exception.message}", exception)
    }
}
