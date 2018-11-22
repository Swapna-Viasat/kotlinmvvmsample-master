package com.ms.kotlinmvvmsample.data.source.remote

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *
 * @author Swapna
 * @version 1.0
 * @since 22/11/18
 */
interface WeatherApi {
    @GET("weather")
    fun getCurrentWeatherByCityName(
            @Query("q") cityName: String,
            @Query("appid") key: String
    ): Single<RemoteWeather>

    @GET("forecast")
    fun getForecast(
            @Query("q") cityName: String,
            @Query("appid") key: String
    ): Single<RemoteForecast>
}