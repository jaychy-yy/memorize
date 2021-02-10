package com.dsm.memorization.controller.response

class StageResponse(val stages: List<Stage>) {
    class Stage(val stage: Int, val average: Int)
}