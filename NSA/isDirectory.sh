#!/bin/bash

read -p "Enter directory name: " dir

for filename in "./$dir"
do
if [ -d "$filename" ]
then
echo "$filename is a directory"
else
echo "$filename is not directory"
fi
done