#!/usr/bin/env bash

# Get Args
IMAGE_NAME=`echo "$1" | tr -d '\r'`
IMAGE_DIGEST=`echo "$2" | tr -d '\r'`

# Replace image tag in deployment
sed -ri "s#^(\s*)(image\s*:.*$)#\1image: ${IMAGE_NAME}@${IMAGE_DIGEST}#" config/base/deployment.yaml