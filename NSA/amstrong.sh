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
	return $(( $1 == $sum ))
}

read -p "Enter a number: " num
isAmstrong $num

result=$(( $? == 1 ? "true" : "false"))
echo $result
echo "hello"
