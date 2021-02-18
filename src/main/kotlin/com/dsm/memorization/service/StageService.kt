package com.dsm.memorization.service

import com.dsm.memorization.controller.response.ProblemResponse.Word
import com.dsm.memorization.controller.response.StageResponse.Stage
import com.dsm.memorization.repository.WordRepository
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class StageService(
    private val wordRepository: WordRepository
) {

    fun getStages() =
        wordRepository.findAll()
            .sortedByDescending { it.count }
            .chunked(10)
            .withIndex()
            .map { (index, words) ->
                Stage(
                    stage = index + 1,
                    average = (words.sumOf { it.count }) / words.size,
                )
            }

    fun getStageInformation(stage: Int) =
        wordRepository.findAll(createPageRequest(stage))
            .sortedByDescending { it.count }
            .map {
                Word(
                    englishWord = it.english,
                    count = it.count,
                )
            }

    fun createPageRequest(stage: Int) =
        PageRequest.of(stage - 1, 10, Sort.Direction.DESC, "count")
}