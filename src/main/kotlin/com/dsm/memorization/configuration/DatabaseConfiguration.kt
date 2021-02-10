package com.dsm.memorization.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class DatabaseConfiguration(
    @Value("\${DATABASE_DRIVER}")
    val driverClassName: String,
    @Value("\${DATABASE_URL}")
    val url: String,
    @Value("\${DATABASE_USERNAME}")
    val username: String,
    @Value("\${DATABASE_PASSWORD}")
    val password: String,
) {

    @Bean
    fun dataSource(): DataSource =
         DataSourceBuilder.create()
            .driverClassName(driverClassName)
            .url(url)
            .username(username)
            .password(password)
            .build()
}