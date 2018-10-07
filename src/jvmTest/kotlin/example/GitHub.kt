package example

import kotlinx.coroutines.runBlocking
import kotlin.test.Test

class GitHubTestJVM {
    @Test
    fun getGitHubSucceeds() {
        runBlocking {
            getGitHub()
        }
    }
}
