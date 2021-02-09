package com.dsm.crawling

interface SpringBootDocsCrawler {
    fun docsCrawling(): List<Pair<String, Int>>
}