#!/bin/bash

./gradlew clean build

IOS_FRAMEWORKS="./ios_frameworks/"

rm -rf "$IOS_FRAMEWORKS"
mkdir -p "$IOS_FRAMEWORKS"

cp -R "./build/bin/ios/debugFramework/run_blocking.framework" "$IOS_FRAMEWORKS"
cp -R "./build/bin/ios/debugFramework/run_blocking.framework.dSYM" "$IOS_FRAMEWORKS"

