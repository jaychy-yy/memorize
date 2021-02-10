package com.dsm.memorization.service

import com.dsm.memorization.exception.WordNotFoundException
import com.dsm.memorization.repository.WordRepository
import org.springframework.stereotype.Service

@Service
class TranslationService(
    private val wordRepository: WordRepository
) {

    fun translateEnglish(english: String) = wordRepository.findByEnglish(english)?: throw WordNotFoundException(english)
}