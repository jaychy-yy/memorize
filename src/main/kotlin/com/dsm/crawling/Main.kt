package com.dsm.crawling

fun main() {
    val crawler = JsoupCrawler()
    val popularWords = crawler.docsCrawling()

    val databaseConnector = DatabaseConnector()
    databaseConnector.connect()
    databaseConnector.insertAll(
        popularWords.map { (english, count) ->
            Word(
                englishWord = english,
                koreanWord = english,
                count = count,
            )
        }
    )
}