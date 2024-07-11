#!/bin/bash

func() {
	# Read numbers separated by spaces
	read -p "Enter an array: " arr
	echo "Numbers: ${arr[@]}"

	# Calculate sum and number of elements
	sum=0
	count=0
	for num in $arr; do
		sum=$(( $sum + $num ))
		count=$(( $count + 1 ))
	done
	echo "Sum:" $sum "Count:" $count

	# Calculate mean
	mean=$( echo "scale=2; $sum / $count" | bc )
	echo "Mean:" $mean

	# Calculate Variance
	var=0
	for num in $arr; do
		diff=$( echo "scale=2; $num - $mean" | bc )
		var=$( echo "scale=2; $var + ($diff * $diff)" | bc )
	done
	var=$( echo "scale=2; $var / $count" | bc )
	echo "Variance:" $var

	# Calculate Standard Deviation
	sd=$( echo "scale=2; sqrt($var)" | bc)
	echo "SD:" $sd
}

# Array: 10 12 23 23 16 23 21 16, Output: 4.89
func
