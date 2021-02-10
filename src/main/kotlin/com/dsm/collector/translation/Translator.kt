package com.dsm.collector.translation

interface Translator {
    fun translation(english: String): String?
    suspend fun translationAll(englishList: List<String>): List<String?>
}