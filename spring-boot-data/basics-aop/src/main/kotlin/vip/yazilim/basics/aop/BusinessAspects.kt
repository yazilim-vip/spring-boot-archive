package vip.yazilim.basics.aop

import org.aspectj.lang.ProceedingJoinPoint

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.*
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration


const val ASPECT_PACKAGE_PATTERN = "execution(* vip.yazilim.basics.aop.*.*(..))"

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/11/2021
 */
@Configuration
@Aspect
class BusinessAspect {
    private val logger = LoggerFactory.getLogger(BusinessAspect::class.java)

    /**
     * to be executed before invoking methods which matches given pattern before
     * executed
     *
     * @param jpoint point where aspect joins
     */
    @Before(ASPECT_PACKAGE_PATTERN)
    fun before(jpoint: JoinPoint) {
        logger.info("Before called => $jpoint")
    }

    /**
     * to be executed before invoking methods which matches given pattern after
     * executed
     *
     * @param jpoint point where aspect joins
     */
    @After(ASPECT_PACKAGE_PATTERN)
    fun after(jpoint: JoinPoint) {
        logger.info("After called => $jpoint")
    }

    /**
     * to be executed before invoking methods which matches given pattern returns
     *
     * @param jpoint point where aspect joins
     */
    @AfterReturning(ASPECT_PACKAGE_PATTERN)
    fun afterReturning(jpoint: JoinPoint) {
        logger.info("After returning... => $jpoint")
    }

    /**
     * to be executed before invoking methods which matches given pattern throws
     * exception
     *
     * @param jpoint point where aspect joins
     */
    @AfterThrowing(ASPECT_PACKAGE_PATTERN)
    fun afterThrowing(jpoint: JoinPoint) {
        logger.info("After Throwing Exception ... => $jpoint")
    }

    /**
     * ..
     * @param pjpoint point where aspect joins
     * @throws Throwable
     */
    @Around(ASPECT_PACKAGE_PATTERN)
    @Throws(Throwable::class)
    fun around(pjpoint: ProceedingJoinPoint) {
        val start = System.currentTimeMillis()
        pjpoint.proceed()
        val end = System.currentTimeMillis()
        logger.info("$pjpoint took : " + (end - start) + " ms")
    }
}
