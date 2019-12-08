package example

import kotlinx.coroutines.runBlocking

actual fun <T> runBlocking(block: suspend () -> T): T = runBlocking { block.invoke() }

