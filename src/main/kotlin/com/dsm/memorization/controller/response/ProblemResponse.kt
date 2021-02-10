package com.dsm.memorization.controller.response

class ProblemResponse(val stage: Int, val words: List<Word>) {
    class Word(val englishWord: String, val count: Int)
}