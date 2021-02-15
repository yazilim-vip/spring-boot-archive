package vip.yazilim.thymeleaf.form_login.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import vip.yazilim.thymeleaf.form_login.entity.Note

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 28.12.2020
 */
@Repository
interface INoteRepo : JpaRepository<Note, Long>