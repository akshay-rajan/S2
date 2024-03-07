#!/bin/bash

fibonacci() {
	a=0
	b=1
	c=1
	for i in $(seq $1)
	do
		echo $a
		a=$b
		b=$c
		c=$(( $a + $b ))
	done
}

read -p "Enter the number of fibonacci numbers to print: " n
fibonacci $n
