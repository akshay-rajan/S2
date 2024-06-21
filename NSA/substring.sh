#!/bin/bash

read -p "String: " str
read -p "Enter Starting Index and Character Count: " a b

substring=${str:$a:$b}
echo "Substring: $substring"
