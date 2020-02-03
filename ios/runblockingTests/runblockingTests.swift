import XCTest
import common

class runblockingTests: XCTestCase {
    
    func testHealthCheck() {
        XCTAssertEqual("Success", HealthCheckKt.healthCheck())
    }
}
