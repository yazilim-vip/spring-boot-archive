package vip.yazilim.basics.bean_scopes.counter

import org.springframework.stereotype.Component
import org.springframework.web.context.annotation.RequestScope

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/11/2021
 */

@Component
@RequestScope
//@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
class RequestCounter : GlobalCounter() {
}