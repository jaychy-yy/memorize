package com.dsm.memorization.exception.handler

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(CommonException::class)
    fun commonExceptionHandler(e: CommonException) =
        ResponseEntity(
            ExceptionResponse(
                code = e.code,
                message = e.message?: "메시지가 널입니다.",
            ),
            e.status,
        )

    @ExceptionHandler(RuntimeException::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun runtimeExceptionHandler(e: RuntimeException) =
        ExceptionResponse(
            code = "INTERNAL_SERVER_ERROR",
            message = "서버 에러 발생",
        )
}