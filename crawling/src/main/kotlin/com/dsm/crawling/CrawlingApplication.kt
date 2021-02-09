package com.dsm.crawling

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrawlingApplication

fun main(args: Array<String>) {
    runApplication<CrawlingApplication>(*args)
}
