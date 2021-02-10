package com.dsm.crawling

fun main() {
    val crawler = JsoupCrawler()
    val popularWords = crawler.docsCrawling()

    TODO("파파고 API를 이용해서 번역")

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