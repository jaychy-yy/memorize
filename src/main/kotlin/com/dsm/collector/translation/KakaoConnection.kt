package com.dsm.collector.translation

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface KakaoConnection {

    @Headers(value = ["accept: application/json", "content-type: application/json"])
    @GET("/v2/translation/translate")
    fun translation(
        @Header("Authorization") kakaoKey: String,
        @Query("src_lang") source: String,
        @Query("target_lang") target: String,
        @Query("query") word: String,
    ): Call<KakoTranslationResponse>
}