package com.dsm.memorization.exception

import com.dsm.memorization.exception.handler.CommonException
import org.springframework.http.HttpStatus

class WordNotFoundException(
    word: String,
) : CommonException(
    code = "WORD_NOT_FOUND",
    message = "해당하는 단어를 찾을 수 없습니다. [word = $word]",
    status = HttpStatus.NOT_FOUND,
)