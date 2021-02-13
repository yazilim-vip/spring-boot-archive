package vip.yazilim.basics.dependency_injection.impl

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import vip.yazilim.basics.dependency_injection.AppDependencyInjection
import vip.yazilim.basics.dependency_injection.ISortAlgorithm

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/11/2021
 */
@Component
class BubbleSort : ISortAlgorithm {
    private val logger: Logger = LoggerFactory.getLogger(AppDependencyInjection::class.java)

    override fun sort(arr: IntArray) {
        logger.info("Sorting Algorithm: Bubble Sort")
        var swap = true
        while (swap) {
            swap = false
            for (i in 0 until arr.size - 1) {
                if (arr[i] > arr[i + 1]) {
                    val temp = arr[i]
                    arr[i] = arr[i + 1]
                    arr[i + 1] = temp
                    swap = true
                }
            }
        }
    }
}