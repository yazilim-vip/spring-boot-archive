package vip.yazilim.thymeleaf.form_login.config.security

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.password.PasswordEncoder

@Configuration
@EnableWebSecurity
class SecurityConfig() : WebSecurityConfigurerAdapter() {

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.inMemoryAuthentication()
            .withUser("admin").password("0").roles("ADMIN", "USER")
            .and()
            .withUser("user").password("0").roles("USER")
            .and()
            .passwordEncoder(passwordEncoder())
    }

    fun passwordEncoder(): PasswordEncoder {
        return object : PasswordEncoder {
            override fun encode(p0: CharSequence?): String {
                return p0.toString()
            }

            override fun matches(p0: CharSequence?, p1: String?): Boolean {
                return p0.toString() == p1.toString()
            }
        }
    }

    override fun configure(web: HttpSecurity?) {
        http
            .authorizeRequests()
            .antMatchers("/login").permitAll()
            .antMatchers("/secure/**").authenticated()
            .and()
            .formLogin()
            .loginPage("/login")
            .failureUrl("/login-error")
            .and()
            .logout()
            .logoutSuccessUrl("/")
            .and()
            .csrf().disable()
    }


//    @Throws(Exception::class)
//    protected override fun configure(http: HttpSecurity) {
//        http
//            .authorizeRequests()
//            .antMatchers("/resources/**").permitAll()
//            .anyRequest().authenticated()
//            .and().rememberMe().key("fkjdshfkjdshfkjdshfkjdshfkjsdkjfawlşekqwekjqwhekjmncbxmnbcxmz")
//    }
}
