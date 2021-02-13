package vip.yazilim.basics.aop

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.lang.Exception

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/11/2021
 */
@Component
class Business {

    private val logger = LoggerFactory.getLogger(BusinessAspect::class.java)

    fun getARecord() {
        logger.info("executing getARecord method")
    }

    @Throws(Exception::class)
    fun wrong() {
        throw Exception("This is an exception")
    }
}
