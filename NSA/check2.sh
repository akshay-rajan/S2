#!/bin/bash

for i in $(seq 5)
do
	if [ $i -eq 3 ]
	then
		continue
	fi
	echo $i
done
