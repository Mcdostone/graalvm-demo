#!/usr/bin/env bash

set -euo pipefail

if [ ! -f "target/demo" ]; then
  mvn -Pnative native:compile -DskipTests
fi

PROPERTY="-Dfoo=bar"

# It works
target/demo $PROPERTY

# It doesn't work
JAVA_TOOL_OPTIONS=$PROPERTY target/demo
JAVA_OPTS=$PROPERTY target/demo
_JAVA_OPTIONS=$PROPERTY target/demo
JDK_JAVA_OPTIONS=$PROPERTY target/demo