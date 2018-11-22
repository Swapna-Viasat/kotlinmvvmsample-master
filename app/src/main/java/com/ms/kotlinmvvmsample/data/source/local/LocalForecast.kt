package com.ms.kotlinmvvmsample.data.source.local

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 *
 * @author Swapna
 * @version 1.0
 * @since 22/11/18
 */

@Entity
data class LocalForecast(
        @PrimaryKey
        val primaryId: String,

        val id: Int,
        val dt: Long,
        val main: String?,
        val description: String?,
        val icon: String?,
        val city: String?
)