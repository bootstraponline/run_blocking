import XCTest
 @testable import runblocking

 class runblockingTests: XCTestCase {
     
     func testHealthCheck() {
     // After dropping cocoapods, for some reason is not possible to run
     // HealthCheckKt.healthCheck() directly from XCTestCase.
         XCTAssertEqual("Success", healthCheck())
     }
 }
