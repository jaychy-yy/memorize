package com.dsm.collector.database

import org.springframework.boot.jdbc.DataSourceBuilder
import javax.sql.DataSource

class DatabaseProperty(
    private val driverClassName: String = "com.mysql.cj.jdbc.Driver",
    private val url: String = "jdbc:mysql://spring-boot-docs-crawling.cfc2yl6t4e27.ap-northeast-2.rds.amazonaws.com/crawling?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
    private val username: String = "admin",
    private val password: String = "dhwlddjgmanf",
) {

    fun dataSource(): DataSource =
        DataSourceBuilder
            .create()
            .driverClassName(driverClassName)
            .url(url)
            .username(username)
            .password(password)
            .build()
}