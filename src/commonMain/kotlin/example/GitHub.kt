package example

import io.ktor.client.HttpClient
import io.ktor.client.call.HttpClientCall
import io.ktor.client.call.call
import kotlinx.coroutines.CoroutineScope
import kotlinx.io.core.use
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

// runBlocking doesn't exist in common
// https://github.com/Kotlin/kotlinx.coroutines/issues/195
expect fun <T> runBlocking(context: CoroutineContext = EmptyCoroutineContext, block: suspend CoroutineScope.() -> T): T

fun getGitHub(): HttpClientCall = runBlocking {
    HttpClient().use { it.call("https://www.github.com") }
}
