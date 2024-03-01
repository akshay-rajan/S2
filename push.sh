#!/bin/bash

git pull
git status
sleep 1

git add :/
git commit -m "$1"
git push origin main 
