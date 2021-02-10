package com.dsm.collector.crawling

interface SpringBootDocsCrawler {
    fun docsCrawling(): List<Pair<String, Int>>
}