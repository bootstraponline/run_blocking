package example

import io.ktor.client.HttpClient
import io.ktor.client.call.call
import io.ktor.client.response.readText
import kotlinx.io.core.use

expect fun <T> runBlocking(block: suspend () -> T): T

fun healthCheck(): String {
    return runBlocking {
        HttpClient().use {
            it.call("http://robinhood.com/healthcheck").response.readText()
        }
    }
}
