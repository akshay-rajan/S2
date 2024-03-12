#!/bin/bash

# Search for all occurences of "5" in a file
grep 5 marks.txt

# Using pipe "|"
cat marks.txt | grep "5"

# Case insensitive search
grep -i "abc" marks.txt
