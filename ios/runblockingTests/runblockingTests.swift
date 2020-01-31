//
//  runblockingTests.swift
//  runblockingTests
//
//  Created by Janek Góral on 31/01/2020.
//  Copyright © 2020 gogoapps. All rights reserved.
//

import XCTest
import common

class runblockingTests: XCTestCase {
    
    func testHealthCheck() {
        XCTAssertEqual("Success", HealthCheckKt.healthCheck())
    }
}
