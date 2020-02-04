package example

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

actual fun <T> runBlocking(
    context: CoroutineContext,
    block: suspend CoroutineScope.() -> T
): T = kotlinx.coroutines.runBlocking(
    context = mainDispatcher,
    block = block
)
