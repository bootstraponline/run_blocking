package example

import io.ktor.client.HttpClient
import io.ktor.client.request.request
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.readText
import io.ktor.utils.io.core.use

expect fun <T> runBlocking(block: suspend () -> T): T

fun healthCheck(): String {
    return runBlocking {
        HttpClient().use {
            it.request<HttpResponse>("http://robinhood.com/healthcheck") {}
                .readText()
        }
    }
}
