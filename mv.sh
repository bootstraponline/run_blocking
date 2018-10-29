#!/bin/bash

rm -rf "../ios/ios-frameworks/run_blocking.framework/"
rm -rf "../ios/ios-frameworks/run_blocking.framework.dSYM"

cp -R "./build/bin/ios/main/debug/framework/run_blocking.framework" "../ios/ios-frameworks/run_blocking.framework/"

cp -R "./build/bin/ios/main/debug/framework/run_blocking.framework.dSYM" "../ios/ios-frameworks/run_blocking.framework.dSYM/"
