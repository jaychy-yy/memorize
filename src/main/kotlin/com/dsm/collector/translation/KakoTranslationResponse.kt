package com.dsm.collector.translation

import com.fasterxml.jackson.annotation.JsonProperty

class KakoTranslationResponse(
    @JsonProperty("translated_text")
    val translatedText: List<List<String>>
)