# Assign a variable to the output of a function
#!/bin/bash

user=$(whoami)
date=$(date)
dir=$(pwd)

echo "You are currently logged in as $user"
sleep 1
echo "Present Working Directory: $dir"
sleep 1
echo "$date"
