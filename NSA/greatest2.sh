#!/bin/bash

read -p "Enter two numbers: " a b
if [ $a -gt $b ]
then 
    echo "$a is greater than $b"
else
    echo "$b is greater than $a"
fi