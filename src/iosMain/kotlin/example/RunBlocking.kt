package example

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Runnable
import kotlinx.coroutines.launch
import platform.Foundation.NSRunLoop
import platform.Foundation.performBlock
import kotlin.coroutines.CoroutineContext

actual fun <T> runBlocking(block: suspend () -> T): T {
    val expectation = Expectation<T>()

    GlobalScope.launch(MainRunLoopDispatcher) {
        expectation.fulfill(block.invoke())
    }

    return expectation.wait() ?: throw RuntimeException("runBlocking failed")
}

private object MainRunLoopDispatcher : CoroutineDispatcher() {
    override fun dispatch(context: CoroutineContext, block: Runnable) {
        NSRunLoop.mainRunLoop().performBlock {
            block.run()
        }
    }
}
