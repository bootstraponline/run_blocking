package io.gogoapps.example

import androidx.test.ext.junit.runners.AndroidJUnit4
import example.healthCheck
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HealthCheckInstrumentedTest {

    @Test
    fun testHealthCheck() {
        assertEquals("Success", healthCheck())
    }
}