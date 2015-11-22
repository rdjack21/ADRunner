#!/usr/bin/bash

## Need to do this in a portable way but for now this is specific to
## bash.
DIR="$(dirname "$(readlink -f "$0")" )"
echo $DIR

java -jar $DIR/ADRunner-0.1-SNAPSHOT.jar $@

