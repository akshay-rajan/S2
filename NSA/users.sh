#!/bin/bash

# Path to the CSV file
csv_file="/path/to/users.csv"

# Read the CSV file line by line
while IFS= read -r user
do
    # Create the user with a default shell
    useradd -m -s /bin/bash "$user"
done < "$csv_file"