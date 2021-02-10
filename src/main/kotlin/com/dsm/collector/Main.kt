package com.dsm.collector

import com.dsm.collector.crawling.JsoupCrawler
import com.dsm.collector.database.DatabaseConnector
import com.dsm.collector.database.Word
import com.dsm.collector.translation.KakaoTranslator

fun main() {
    // Jsoup 라이브러리를 이용하여 Spring Boot Docs 크롤링 맟 단어 추출
    val crawler = JsoupCrawler()
    val popularWords = crawler.docsCrawling()

    // Kakao 번역 API를 이용하여 [한글] - [영어] - [갯수]로 변환
    val translator = KakaoTranslator()
    val words = popularWords.map { (english, count) ->
        Word(
            englishWord = english,
            koreanWord = translator.translation(english),
            count = count,
        )
    }

    // Kotlin Exposed 프레임워크를 이용하여 데이터베이스에 변환한 값을 저장
    val databaseConnector = DatabaseConnector()
    databaseConnector.connect()
    databaseConnector.reset()
    databaseConnector.insertAll(words)
}