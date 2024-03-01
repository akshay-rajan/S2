#!/bin/bash

# Usage
# For Staging,Commiting and Push: ./git.sh "Commit Message"
# For Pulling Changes from github: ./git.sh

if [ -z "$1" ]
then
	git pull
	exit 1
fi

git status
git add :/
git commit -m "$1"
git push origin main 
