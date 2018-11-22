package com.ms.kotlinmvvmsample.data.source.local

import com.ms.kotlinmvvmsample.data.source.IWeatherDataSource

/**
 *
 * @author Swapna
 * @version 1.0
 * @since 22/11/18
 */
interface IWeatherCacheManager : IWeatherDataSource {

    fun insertCurrentWeather(localWeather: LocalWeather)

    fun insertForecast(forecasts: List<LocalForecast>)
}