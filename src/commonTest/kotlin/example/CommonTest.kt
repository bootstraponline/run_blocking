package example

import kotlin.test.Test
import kotlin.test.assertEquals

class CommonTest {

    @Test
    fun testHealthCheck() {
        assertEquals("Success", healthCheck())
    }
}
