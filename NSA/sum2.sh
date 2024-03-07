#!/bin/bash

sum() {
	echo $(( $1 + $2 ))
}

read -p "Enter 2 numbers: " a b
sum a b
