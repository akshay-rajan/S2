#!/bin/bash

sum() {
	read -p "Enter 2 numbers: " a b
	echo  $(( $a + $b ))
}

sum
