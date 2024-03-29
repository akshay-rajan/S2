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

# Function call
read -p "Enter a number: " num
isAmstrong $num

# Check the return value (exit status) of the function
if [ $? -eq 1 ]
then
	echo "Amstrong number"
else
	echo "Not an Amstrong number!"
fi
