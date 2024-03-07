#!/bin/bash

isPalindrome() {
	rev=0
	num=$1
	while [ $num -gt 0 ]
	do
		remainder=$(( $num % 10 ))
		rev=$(( $(( $rev * 10 )) + $remainder )) 
		num=$(( $num / 10 ))
	done
	
	# Check if the reversed number is equal to the original number
	if [ $n -eq $rev ]
	then
		echo "$n is a palindrome!"
	else
		echo "$n is not a palindrome!"
	fi
}

read -p "Enter a number: " n
isPalindrome $n
