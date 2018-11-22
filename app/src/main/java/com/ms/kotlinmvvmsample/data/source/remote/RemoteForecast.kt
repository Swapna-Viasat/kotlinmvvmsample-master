package com.ms.kotlinmvvmsample.data.source.remote

import com.google.gson.annotations.SerializedName

/**
 *
 * @author Swapna
 * @version 1.0
 * @since 22/11/18
 */

data class RemoteForecast(
        @SerializedName("cod") val code: Int,
        @SerializedName("message") val message: Float,
        @SerializedName("cnt") val cnt: Int,
        @SerializedName("list") val forecast: List<Forecast>?,
        @SerializedName("city") val city: City?
)

data class Forecast(
        val dt: Long,
        val weather: List<ForecastWeather>?
)

data class ForecastWeather(
        val id: Int,
        val main: String?,
        val description: String?,
        val icon: String?
)

data class City(
        val id: Long,
        val name: String?
)