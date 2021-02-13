package vip.yazilim.basics.bean_scopes.counter

import org.springframework.stereotype.Component
import org.springframework.web.context.annotation.SessionScope

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 2/11/2021
 */

@Component
@SessionScope
//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
class SessionCounter : GlobalCounter() {
}
