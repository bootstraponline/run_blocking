package example

import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals

class GitHubTestIos {

    @Test
    fun getGitHubSucceeds() {
        val response = getGitHub().response
        assertEquals(response.status.value, 301)
    }
}
