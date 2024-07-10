#!/bin/bash

read -p "Enter directory name: " dir

if [ -d "$dir" ]; then
    echo "$dir is a directory"
else
    echo "$dir is not a directory"
fi
