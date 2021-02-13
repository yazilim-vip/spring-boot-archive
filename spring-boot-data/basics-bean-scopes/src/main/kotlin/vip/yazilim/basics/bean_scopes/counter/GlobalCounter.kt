package vip.yazilim.basics.bean_scopes.counter

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/11/2021
 */
abstract class GlobalCounter(var counter: Int = 0) {
    fun increment(): Int {
        counter++
        return counter
    }
}
