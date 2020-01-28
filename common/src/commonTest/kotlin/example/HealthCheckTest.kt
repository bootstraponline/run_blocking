package example

import kotlin.test.Test
import kotlin.test.assertEquals

class HealthCheckTest {

    @Test
    fun testHealthCheck() {
        assertEquals("Success", healthCheck())
    }
}
