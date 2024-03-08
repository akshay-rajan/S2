#!/bin/bash

files=$(ls | grep ".sh$")
for file in $files
do
	chmod +x $file
done
