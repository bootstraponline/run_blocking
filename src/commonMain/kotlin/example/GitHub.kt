package example

import io.ktor.client.HttpClient
import io.ktor.client.call.HttpClientCall
import io.ktor.client.call.call

// runBlocking doesn't exist in common
// https://github.com/Kotlin/kotlinx.coroutines/issues/195
suspend fun getGitHub(): HttpClientCall {
    val client = HttpClient()
    val urlString = "https://www.github.com"
    return client.call(urlString)
}
