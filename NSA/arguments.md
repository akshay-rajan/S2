# Positional Arguments

Arguments passed to a script or command in a specific order when it is executed.

| Variable  | Description                                                                                                                                                                         |
|-----------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| $0        | Represents the name of the script or shell itself. Useful for accessing the script name within the script, especially when dealing with multiple scripts or functions.           |
| $1, $2, … | Represent the positional parameters passed to the script or function, with $1 being the first parameter, $2 the second, and so forth. Used to process and manipulate command-line arguments. |
| $#        | Holds the count of positional parameters passed to the script or function. Often used for validation or error handling based on the number of arguments provided.                 |
| $@        | Represents all the positional parameters passed to the script or function as separate arguments. Each parameter is treated individually.                                           |
| $*        | Represents all the positional parameters passed to the script or function as a single string. Parameters are separated by the first character of the IFS variable (space by default). |
| $$        | Represents the process ID (PID) of the currently running script or shell. Used for generating unique temporary files or directories by incorporating the PID into the filename.     |
| $!        | Represents the PID of the last background process started in the current shell. Helpful for monitoring or managing background processes in scripts.                               |
| $?        | Holds the exit status of the last command executed. Typically used for conditional logic based on command success or failure.                                                   |
