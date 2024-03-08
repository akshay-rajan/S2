#!/bin/bash

rev=$(cat file.txt | rev)
echo $rev > file.txt
