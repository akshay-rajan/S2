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

    case expression in
        pattern1)
            commands
            ;;
        pattern2)
            commands
            ;;
        *)
            default commands
            ;;
    esac

### 7. `while` loop

    while [ condition_is_true ]
    do 
        statements
    done


### 8. `until` loop

    until [ condition_becomes_true ]
    do
        statements
    done

### 9. `for` loop

    for variable in {start...stop...step}
    do 
        statements
    done

Or we can do

    for (( i=0; i<5; i++ ))

### 10. `break` and `continue`

    for (( i=0; i<=10; i++ ))
    do
        if [ $i -eq 5 ]
        then 
            continue
        fi
        echo $i
    done

### 11. Script Input: STDIN

**Command-line Arguments**

    ./filename.sh input1 input2 input3
        ↑           ↑       ↑     ↑
        $0          $1      $2    $3

We can use any number of command-line arguments given, by using an array

    args=("$@")
    echo [args[0]]

**Reading a file**

Reading a file using the filename

    while read line
    do 
        echo $line
    done < "{$1:-/dev/stdin}"

To run

    ./filename.sh   file_to_read

If we give no filename as the argument, the program will consider the terminal as the file, and the input given via the command line will be taken as *$line*.

### 12. Script Output: STDOUT, STDERR

We can redirect the Standard Output and the Standard Error after running a command to two different files.

    command 1>file1.txt 2>file2.txt
            ↑           ↑
          STDOUT      STDERR
            ↓
    command >file.txt

To redirect the output and error to the same file, do

    command 1>file1.txt 2>$1
            or
    command >& file1.txt




    


