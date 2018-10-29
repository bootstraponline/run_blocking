package example

import platform.Foundation.NSDate
import platform.Foundation.NSRunLoop
import platform.Foundation.addTimeInterval
import platform.Foundation.runUntilDate

class Expectation<T> {
    private var waiting = true
    private var result: T? = null

    fun fulfill(result: T?) {
        waiting = false
        this.result = result
    }

    fun wait(): T? {
        while (waiting) {
            advanceRunLoop()
        }

        return result
    }
}

private fun advanceRunLoop() {
    val date = NSDate().addTimeInterval(1.0) as NSDate
    NSRunLoop.mainRunLoop.runUntilDate(date)
}
