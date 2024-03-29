#!/bin/bash

isAmstrong() {
	num=$1
	sum=0
	while (( $num > 0 ))
	do
		digit=$(( $num % 10 ))
		sum=$(( $sum + $(( $digit * $digit * $digit )) ))
		num=$(( $num / 10 ))
	done
	exit $(( $1 == $sum ))
}

isAmstrong 153
echo $? 
echo "hello"
