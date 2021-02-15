package vip.yazilim.thymeleaf.form_login.config.security

import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 27.12.2020
 */
@Component
class CustomPasswordEncoder : PasswordEncoder {
    override fun encode(p0: CharSequence?): String {
        return p0.toString()
    }

    override fun matches(p0: CharSequence?, p1: String?): Boolean {
        return p0.toString() == p1.toString()
    }
}