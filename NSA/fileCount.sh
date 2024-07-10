#!/bin/bash

read -p "Directory: " dir
direct="./$dir"
if [ -d "$direct" ]; then
    num_files=$(find "$direct" -type f | wc -l)
    echo "There are $num_files files in $direct"
else
    echo "$direct is not a directory"
fi
