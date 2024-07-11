#!/bin/bash

lcm() {
	cm=$(( $1 * $2 ))
	lcm=$cm
	for i in $( seq $cm ); do
		if [ $(( i % $1 )) -eq 0 ] && [ $(( i % $2 )) -eq 0 ]; then
			lcm=$i
			break
		fi
	done
	echo $lcm
}

lcm $1 $2
