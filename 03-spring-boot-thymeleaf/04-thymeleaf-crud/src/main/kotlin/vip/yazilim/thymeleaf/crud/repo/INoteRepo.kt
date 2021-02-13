package vip.yazilim.thymeleaf.crud.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import vip.yazilim.thymeleaf.crud.entity.Note

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 28.12.2020
 */
@Repository
interface INoteRepo : JpaRepository<Note, Long>