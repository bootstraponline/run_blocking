package example

import kotlin.test.Test
import kotlin.test.assertEquals

class GitHubTestJVM {

    @Test
    fun getGitHubSucceeds() {
        val response = getGitHub().response
        assertEquals(response.status.value, 301)
    }
}
