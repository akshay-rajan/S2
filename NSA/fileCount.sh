#!/bin/bash

read -p "Directory: " dir
if [ -d "$dir" ]; then
    num_files=$(find "$dir" -type f | wc -l)
    echo "There are $num_files files in $dir"
else
    echo "$dir is not a directory"
fi
