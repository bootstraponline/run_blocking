package example

import kotlin.test.Test
import kotlin.test.assertEquals

class GitHubTest {

    @Test
    fun getGitHubSucceeds() {
        val response = getGitHub().response
        assertEquals(200, response.status.value)
    }
}
