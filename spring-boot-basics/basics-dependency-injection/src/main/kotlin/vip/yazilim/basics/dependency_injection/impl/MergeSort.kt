package vip.yazilim.basics.dependency_injection.impl

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component
import vip.yazilim.basics.dependency_injection.AppDependencyInjection
import vip.yazilim.basics.dependency_injection.ISortAlgorithm

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/11/2021
 */
@Component
@Primary
class MergeSort : ISortAlgorithm {
    private val logger: Logger = LoggerFactory.getLogger(AppDependencyInjection::class.java)

    override fun sort(arr: IntArray) {
        logger.info("Sorting Algorithm: Merge Sort")
        mergeSort(arr);
    }

    fun mergeSort(numArr: IntArray) {
        if (numArr.size <= 1)
            return
        val leftArray = numArr.copyOfRange(0, numArr.size / 2)
        val rightArray = numArr.copyOfRange(numArr.size / 2, numArr.size)
        mergeSort(leftArray)
        mergeSort(rightArray)
        merge(leftArray, rightArray, numArr)
    }

    fun merge(a: IntArray, b: IntArray, t: IntArray) {
        var i = 0
        var j = 0
        for (k in t.indices) {
            if ((j >= b.size) || (i < a.size && a[i] <= b[j])) {
                t[k] = a[i]
                i++
            } else {
                t[k] = b[j]
                j++
            }
        }
    }
}