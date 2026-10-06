#!/bin/sh
set -eu
HERE=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)
ROOT=$(CDPATH= cd -- "$HERE/.." && pwd)
mkdir -p "$HERE/app/src/main/assets"
cp "$ROOT/index.html" "$HERE/app/src/main/assets/index.html"
cp "$ROOT/icon.svg" "$HERE/app/src/main/assets/icon.svg"
