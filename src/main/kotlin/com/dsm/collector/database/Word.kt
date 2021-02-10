package com.dsm.collector.database

data class Word(
    val englishWord: String,
    val koreanWord: String?,
    val count: Int,
)