#!/bin/bash

# Define the user whose login details to extract from '/var/log/auth.log'
target_user=$1

# Extract last login details
last_login=$(grep "session opened for user $target_user" /var/log/auth.log | tail -n 1)

# Alternatively, use 'lastlog -u $target_user'

echo "Last Login Details for $target_user:"
echo "$last_login"

# List all failed logins
failed_logins=$(grep "authentication failure" /var/log/auth.log | grep "user=$target_user")

echo "Failed Logins for $target_user:"
echo "$failed_logins"


# The traditional text log files at '/var/log' is replaced by the 'journald' in modern Linux distributions.
# The logs are stored in '/var/log/journal' and can be accessed using the 'journalctl' command.
