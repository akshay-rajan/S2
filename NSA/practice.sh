#!/bin/bash

read -p "Array: " -a arr
echo "${arr[@]:2:5}"
