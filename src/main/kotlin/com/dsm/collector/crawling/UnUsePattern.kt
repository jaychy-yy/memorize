package com.dsm.collector.crawling

enum class UnUsePattern(val pattern: Regex) {
    INCLUDE_SPECIAL_CHARACTER(Regex("[~!@#$%^&*]*")),
    ONLY_ENGLISH(Regex("^[a-zA-Z]*")),
    MORE_THAN_ONE_UPPERCASE_CHARACTER(Regex(".*[A-Z].*[A-Z].*")),
    AT_LEAST_THREE_CHARACTER(Regex(".{3,}")),
}