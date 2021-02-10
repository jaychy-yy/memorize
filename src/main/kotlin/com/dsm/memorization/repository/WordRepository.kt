package com.dsm.memorization.repository

import com.dsm.memorization.domain.Word
import org.springframework.data.jpa.repository.JpaRepository

interface WordRepository : JpaRepository<Word, Long> {
    fun findByEnglish(english: String): Word?
}