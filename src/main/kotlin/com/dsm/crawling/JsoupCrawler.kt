package com.dsm.crawling

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class JsoupCrawler(
    private val url: String = "https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/",
    private val document: Document = Jsoup.connect(url).get()
) : SpringBootDocsCrawler {

    override fun docsCrawling() =
        document.getElementsByTag("p")
            .asSequence()
            .map { it.text() }
            .map { it.split(" ") }
            .flatten()
            .map { it.replace(UnUsePattern.INCLUDE_SPECIAL_CHARACTER.pattern, "") }
            .filter { it.matches(UnUsePattern.ONLY_ENGLISH.pattern) }
            .filterNot { it.matches(UnUsePattern.MORE_THAN_ONE_UPPERCASE_CHARACTER.pattern) }
            .filter { it.matches(UnUsePattern.AT_LEAST_THREE_CHARACTER.pattern) }
            .map { it.toLowerCase() }
            .groupBy { it }
            .map { Pair(it.key, it.value.size) }
            .sortedByDescending { it.second }
}