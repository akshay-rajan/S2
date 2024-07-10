#!/bin/bash

echo "Process Details for PID: $1"
ps -p $1 u

# Usage: ./ps.sh <PID>
