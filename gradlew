#!/bin/sh

APP_HOME=$(cd "${0%/*}" && pwd -P)
CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar

if [ ! -f "$CLASSPATH" ]; then
  echo "ERROR: Missing $CLASSPATH"
  echo "Run 'gradle wrapper' to regenerate Gradle wrapper binaries."
  exit 1
fi

if [ -n "$JAVA_HOME" ] ; then
  JAVACMD="$JAVA_HOME/bin/java"
else
  JAVACMD=java
fi

exec "$JAVACMD" -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
