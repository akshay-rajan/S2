#!/bin/bash

# Compare the data in two files as 3 columns: 
# Matching items in file1, but not in file2 | In file2 but not in file1 | Common items
comm file1.txt file2.txt
