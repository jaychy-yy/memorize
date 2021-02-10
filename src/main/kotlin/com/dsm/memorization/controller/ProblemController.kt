package com.dsm.memorization.controller

import com.dsm.memorization.controller.response.ProblemResponse
import com.dsm.memorization.controller.response.StageResponse
import com.dsm.memorization.controller.response.WordResponse
import com.dsm.memorization.service.StageService
import com.dsm.memorization.service.TranslationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ProblemController(
    private val stageService: StageService,
    private val translationService: TranslationService,
) {

    @GetMapping("/stage")
    fun getStages() = StageResponse(stageService.getStages())

    @GetMapping("/stage/{stage-number}")
    fun getStageInformation(
        @PathVariable("stage-number") stageNumber: Int
    ) = ProblemResponse(
        stage = stageNumber,
        words = stageService.getStageInformation(stageNumber),
    )

    @GetMapping("/word")
    fun translateEnglish(
        @RequestParam("english") english: String
    ) = WordResponse(
        koreanWord = translationService.translateEnglish(english).korean
    )
}