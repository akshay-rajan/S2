#!/bin/bash

read -p "Enter 2 numbers: " a b

# Set 'm' to the maximum possible value of gcd, which is min(a, b)
m=$a
if [ $b -lt $m ]; then
    m=$b
fi

while [ $m -gt 0 ]; do
    # Divide both numbers by m
    x=$(expr $a % $m)
    y=$(expr $b % $m)
    # If both numbers are divisible by m, GCD is found
    if [ $x -eq 0 -a $y -eq 0 ]; then
        echo "gcd($a, $b) = $m"
        break
    fi
    # Decrement m
    m=$(expr $m - 1)
done

# lcm = (a * b) / gcd
l=$(expr $a \* $b / $m)

echo "lcm($a, $b) = $l"
