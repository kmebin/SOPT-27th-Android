package org.kmebin.Seminar27th.api

import org.kmebin.Seminar27th.data.*
import retrofit2.Call
import retrofit2.http.*

interface SoptService {
    // 회원가입
    @Headers("Content-Type: application/json")
    @POST("/users/signup")
    fun postSignUp(
            @Body body: RequestSignUpData
    ) : Call<ResponseSignUpData>

    // 로그인
    @Headers("Content-Type: application/json")
    @POST("/users/signin")
    fun postLogin(
        @Body body : RequestLoginData
    ) : Call<ResponseLoginData>

    // 더미데이터
    @Headers("Content-Type: application/json")
    @GET("/api/users")
    fun getDummy(
        @Query("page") page : Int
    ) : Call<ResponseDummyData>

    // 카카오 웹 검색
    @Headers("Authorization: KakaoAK 40413dea0470321441d02b60a8f7ad8c")
    @GET("/v2/search/web")
    fun getWebSearch(
        @Query("query") web : String
    ):Call<ResponseKakaoData>
}