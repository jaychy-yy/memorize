package com.dsm.crawling

fun main() {
    val crawler = JsoupCrawler()
    val popularWords = crawler.docsCrawling()

    DatabaseConnector().insert(
        english = "hello",
        korean = "안녕하세요",
        wordCount = 1,
    )
}