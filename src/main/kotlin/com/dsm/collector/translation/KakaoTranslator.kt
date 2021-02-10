package com.dsm.collector.translation

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

class KakaoTranslator : Translator {
    private val kakaoAuthorization: String = "KakaoAK <REST API KEY>"
    private val kakaoConnection = Retrofit.Builder()
        .baseUrl("https://dapi.kakao.com")
        .addConverterFactory(JacksonConverterFactory.create(jacksonObjectMapper()))
        .build()
        .create(KakaoConnection::class.java)

    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    override fun translation(english: String) =
        try {
            kakaoConnection.translation(kakaoAuthorization, "en", "kr", english).execute().body()!!.translatedText.single().single()
        } catch (e: Exception) {
            e.printStackTrace()
            println("카카오 번역 API 연결 실패")
            null
        }

    override suspend fun translationAll(englishList: List<String>) =
        englishList.map {
            coroutineScope.async {
                translation(it)
            }
        }.awaitAll()
}