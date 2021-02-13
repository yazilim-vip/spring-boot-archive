package vip.yazilim.basics.dependency_injection

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class AppDependencyInjection


val logger: Logger = LoggerFactory.getLogger(AppDependencyInjection::class.java)

fun main(args: Array<String>) {

    val arr = intArrayOf(2, 5, 1, 6, 9)

    // Context 1
    val ctx = runApplication<AppDependencyInjection>(*args)

    val sorterService = ctx.getBean(IArraySorterService::class.java)

    logger.info("Array Before Sort: {}", arr.contentToString())
    sorterService.sort(arr)
    logger.info("Array After Sort: {}", arr.contentToString())
}
