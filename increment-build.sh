#!/usr/bin/env bash

# Read version from version file
version=`cat version | xargs`
major=0
minor=0
build=0

echo "Current Version: $version"

# break down the version number into it's components
regex="([0-9]+).([0-9]+).([0-9]+)"
if [[ $version =~ $regex ]]; then
  major="${BASH_REMATCH[1]}"
  minor="${BASH_REMATCH[2]}"
  build="${BASH_REMATCH[3]}"
fi

# Increment the build number
build=$(echo $build + 1 | bc)

version=${major}.${minor}.${build}

echo "New Version: $version"

# Write incremented version to file
echo -n "$version" > version
