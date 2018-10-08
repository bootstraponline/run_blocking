package example

import kotlinx.coroutines.runBlocking
import kotlin.test.Test

class GitHubTestIos {
    @Test
    fun getGitHubSucceeds() = runBlocking<Unit> {
        getGitHub()
    }
}
