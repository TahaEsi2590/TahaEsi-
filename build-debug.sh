#!/usr/bin/env bash
set -euo pipefail
if command -v gradle >/dev/null 2>&1; then
  gradle --no-daemon clean assembleDebug
else
  echo 'Gradle is not installed. Open this project in Android Studio or install Gradle 9.3.1.' >&2
  exit 1
fi
echo 'APK: app/build/outputs/apk/debug/app-debug.apk'
