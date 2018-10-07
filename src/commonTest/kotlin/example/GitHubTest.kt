package example

import kotlin.test.Test

class GitHubTest {
    @Test
    fun getGitHubSucceeds() {
        // TODO: impossible to test suspend functions in common without runBlocking
        // https://youtrack.jetbrains.com/issue/KT-22228
        // getGitHub().request
    }
}
