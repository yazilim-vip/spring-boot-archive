package vip.yazilim.basics.dependency_injection.impl

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import vip.yazilim.basics.dependency_injection.AppDependencyInjection
import vip.yazilim.basics.dependency_injection.IArraySorterService
import vip.yazilim.basics.dependency_injection.ISortAlgorithm

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/11/2021
 */
@Component
class ArraySorterServiceImpl(private val sortAlgorithm: ISortAlgorithm) : IArraySorterService {
    private val logger: Logger = LoggerFactory.getLogger(AppDependencyInjection::class.java)

    override fun sort(arr: IntArray) {
        sortAlgorithm.sort(arr)
    }
}