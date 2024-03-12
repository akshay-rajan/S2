#!/bin/bash

# Compare the data in two files as 3 columns: 
# Items in file1, but not in file2 (Non matching items in first file) | Non matching items in second file | Common / Matching items
comm file1.txt file2.txt

echo ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"

# To display only the 2nd column
comm -13 file1.txt file2.txt
