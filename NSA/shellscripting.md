# Bash Scripting

### 0. Execution

    ./filename.sh
    sh filename.sh
    source filename.sh

### 1. Shebang

    #!/bin/bash

### 2. Display

    echo "Hello, World"

### 3. Comments

    # This is a comment
    : '
    These
    are 
    multi-line comments '

### 4. Here Documnet (here-doc)

To input multiple lines of text to a command

    command << delimeter
        text...
        statements...
    delimeter

### 5. `if` Statement

    if [ condition ]
    then
        statements
    elif [ condition ]
    then
        statements
    else
        statements    
    fi

If we are using signs (`>`, `<`, `=`, ...) instead of letters (`-gt`, `-lt`, `-eq`, ...) in the condition, use (()) instead.

    if (( condition ))

We can use logical operators like

    if [ condition1 ] && [ condition2 ]
                    or
    if [[ condition1 && condition2 ]]


These can also be implemented using the corresponding letters for the logical operators:

    if [ condition1 -a condition2 ]

### 6. `case` Statement

    


