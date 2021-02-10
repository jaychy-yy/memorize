package com.dsm.memorization.controller.response

import com.fasterxml.jackson.annotation.JsonProperty

class WordResponse(
    @get:JsonProperty("korean-word")
    val koreanWord: String
)