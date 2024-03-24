| Contents | Contents | Contents |
| -------- | -------- | -------- |
| [more](#1-more) | [less](#2-less) | [find](#3-find) |
| [wc](#4-wc) | [cut](#5-cut) | [paste](#6-paste) |
| [head](#7-head) | [tail](#8-tail) | [chown](#9-chown) |
| [useradd](#10-useradd) | [userdel](#11-userdel) | [usermod](#12-usermod) |
| [passwd](#13-passwd) | [df](#14-df) | [top](#15-top) |
| [ps](#16-ps) | [ssh](#17-ssh) | [scp](#18-scp) |


# 1. more
The `more` command in Linux is a utility for viewing text files and command outputs in the terminal, one screenful at a time¹². It's particularly useful for reading large files or long outputs that would otherwise scroll past the screen too quickly².

Here's the basic syntax of the `more` command¹:

```bash
more [options] [file_name]
```

While viewing a file with `more`, you can use the following controls¹:

- **Enter key**: Scroll down line by line.
- **Space bar**: Go to the next page.
- **b key**: Go back one page.

The `more` command also supports a variety of options¹:

- `-d`: Displays help messages for navigation.
- `-f`: Does not wrap long lines.
- `-p`: Clears the screen before displaying text.
- `-c`: Displays pages in the same area by overlapping the previously displayed text.
- `-s`: Squeezes multiple blank lines into one.
- `-u`: Omits underlines.

You can also use `more` in combination with other commands. For example, you can pipe the output of one command into `more` to view it one screenful at a time¹. Here's an example:

```bash
ls -l | more
```

This command will display the long format listing of the current directory's contents, one screenful at a time.

Moreover, `more` allows you to search for a specific string in the text file or command output¹. You can do this by using the `+/pattern` option, where `pattern` is the string you're looking for¹. For example:

```bash
more +/error logfile.txt
```

This command will display the contents of `logfile.txt`, starting from the first occurrence of the string "error".

Despite its usefulness, `more` has a significant limitation: it does not support backward scrolling (except for going back one page)⁵. If you need more advanced features, such as backward scrolling or the ability to scroll left and right, you might want to use the `less` command instead².

In conclusion, the `more` command is a simple yet powerful tool for viewing text files and command outputs in the terminal. It provides a variety of options for customizing the display and supports basic navigation and search features¹².

# 2. less

The `less` command in Linux is a utility for viewing text files and command outputs in the terminal¹². It is similar to `more`, but has more advanced features and allows you to navigate both forward and backward through the file².

Here's the basic syntax of the `less` command¹:

```bash
less [options] [file_name]
```

While viewing a file with `less`, you can use the following controls²:

- **Space bar or f key**: Move forward one page.
- **b key**: Move backward one page.
- **Up arrow, y or k**: Move backward one line.
- **Down arrow, Enter, e, or j**: Move forward one line.
- **/pattern**: Search forward for matching patterns.
- **?pattern**: Search backward for matching patterns.

The `less` command also supports a variety of options¹:

- `-E`: Automatically exit when reaching the end of the file.
- `-F`: Exit if the entire file can be displayed on the first screen.
- `-N`: Shows line numbers.
- `-X`: Leave file contents on screen when less exits.
- `-p pattern`: Start at the first occurrence of the specified pattern in the file.
- `-s`: Squeeze consecutive blank lines into a single line.

You can also use `less` in combination with other commands. For example, you can pipe the output of one command into `less` to view it one screenful at a time¹. Here's an example:

```bash
dmesg | less
```

This command will display the output of the `dmesg` command, one screenful at a time.

Moreover, `less` allows you to search for a specific string in the text file or command output¹. You can do this by using the `/pattern` option, where `pattern` is the string you're looking for¹. For example:

```bash
dmesg | less -p "fail"
```

This command will display the output of `dmesg`, starting from the first occurrence of the string "fail".

In conclusion, the `less` command is a powerful tool for viewing text files and command outputs in the terminal. It provides a variety of options for customizing the display and supports advanced navigation and search features¹².

# 3. find
The `find` command in Linux is a utility for searching files and directories in a directory hierarchy based on different criteria such as name, size, type, and more¹².

Here's the basic syntax of the `find` command¹:

```bash
find [path] [options] [expression]
```

- `path`: The directory to start searching from.
- `options`: Additional settings or conditions for the search.
- `expression`: The search criteria.

The `find` command supports a variety of options¹:

- `-name pattern`: Searches for files with a specific name or pattern.
- `-type type`: Specifies the type of file to search for (e.g., `f` for regular files, `d` for directories).
- `-size [+/-]n`: Searches for files based on size. `+n` finds larger files, `-n` finds smaller files.
- `-mtime n`: Finds files based on modification time. `n` represents the number of days ago.
- `-exec command {} \;`: Executes a command on each file found.
- `-print`: Displays the path names of files that match the specified criteria.
- `-maxdepth levels`: Restricts the search to a specified directory depth.
- `-mindepth levels`: Specifies the minimum directory depth for the search.
- `-empty`: Finds empty files and directories.
- `-delete`: Deletes files that match the specified criteria.
- `-execdir command {} \;`: Executes a command on each file found, from the directory containing the matched file.
- `-iname pattern`: Case-insensitive version of `-name`.

Here are some examples of how to use the `find` command:

- To find all files named `file.txt` in the current directory and all its subdirectories:

```bash
find . -name file.txt
```

- To find all directories named `dir` in the `/home` directory:

```bash
find /home -type d -name dir
```

- To find all `.png` files that are larger than 500KB in the `/home` directory:

```bash
find /home -type f -name "*.png" -size +500k
```

In conclusion, the `find` command is a powerful tool for searching files and directories in a directory hierarchy. It provides a variety of options for customizing the search and supports advanced navigation and search features¹².

# 4. wc

The `wc` command in Linux is a utility for counting lines, words, characters, and bytes in files or standard input¹².

Here's the basic syntax of the `wc` command¹:

```bash
wc [options] [file]
```

While using `wc`, you can use the following options¹:

- `-l`: Prints the number of lines in a file.
- `-w`: Prints the number of words in a file.
- `-c`: Displays the count of bytes in a file.
- `-m`: Displays the count of characters in a file.
- `-L`: Prints the length of the longest line in a file.

Here are some examples of how to use the `wc` command:

- To display the number of lines in a file:

```bash
wc -l file.txt
```

- To display the number of words in a file:

```bash
wc -w file.txt
```

- To display the number of characters in a file:

```bash
wc -m file.txt
```

- To display the number of bytes in a file:

```bash
wc -c file.txt
```

- To display the length of the longest line in a file:

```bash
wc -L file.txt
```

In conclusion, the `wc` command is a powerful tool for counting lines, words, characters, and bytes in files or standard input¹².

# 5. cut

The `cut` command in Linux is a utility for cutting out sections from each line of files and writing the result to standard output¹². It can be used to cut parts of a line by byte position, character, and field¹².

Here's the basic syntax of the `cut` command¹:

```bash
cut [options] [file]
```

While using `cut`, you can use the following options¹:

- `-b, --bytes=LIST`: Selects only the bytes specified in LIST (e.g., -b 1-3,7).
- `-c, --characters=LIST`: Selects only the characters specified in LIST (e.g., -c 1-3,7).
- `-d, --delimiter=DELIM`: Uses DELIM as the field delimiter character instead of the tab character.
- `-f, --fields=LIST`: Selects only the fields specified in LIST, separated by the delimiter character (default is tab).
- `-n`: Do not split multi-byte characters (no effect unless -b or -c is specified).
- `--complement`: Invert the selection of fields/characters. Print the fields/characters not selected.

Here are some examples of how to use the `cut` command:

- To display the first field of each line of a file, using comma as the field delimiter:

```bash
cut -d ',' -f 1 file.txt
```

- To display the first three characters of each line of a file:

```bash
cut -c 1-3 file.txt
```

- To display all fields except the first one of each line of a file, using comma as the field delimiter:

```bash
cut -d ',' --complement -f 1 file.txt
```

In conclusion, the `cut` command is a powerful tool for manipulating text files and command outputs in the terminal¹².

# 6. paste

The `paste` command in Linux is a utility for merging lines of files horizontally¹². It outputs lines consisting of the sequentially corresponding lines of each file specified as an argument, separated by tabs¹².

Here's the basic syntax of the `paste` command¹:

```bash
paste [options] [file]
```

While using `paste`, you can use the following options¹:

- `-d, --delimiters`: Specifies a list of characters to be used as delimiters instead of the default TAB separator¹².
- `-s, --serial`: Merges the lines of one file at a time instead of one line from each file¹².
- `-z, --zero-terminated`: Uses a null character to delimit the items instead of the default newline character².

Here are some examples of how to use the `paste` command:

- To merge lines of two files horizontally, separated by space²:

```bash
paste file1 file2
```

- To use the underscore character as a delimiter instead of TAB²:

```bash
paste -d '_' file1 file2
```

- To merge all lines from the given file in separated lines²:

```bash
paste -s file1 file2
```

In conclusion, the `paste` command is a powerful tool for merging lines of files horizontally¹².

# 7. head

The `head` command in Linux is a utility for displaying the beginning of text files or command outputs¹². By default, it prints the first 10 lines of the specified files¹.

Here's the basic syntax of the `head` command¹:

```bash
head [options] [file]
```

While using `head`, you can use the following options¹:

- `-n num`: Prints the first `num` lines instead of first 10 lines¹. For example, `head -n 5 file.txt` will display the first 5 lines of `file.txt`¹.
- `-c num`: Prints the first `num` bytes from the file specified¹. For example, `head -c 6 file.txt` will display the first 6 bytes of `file.txt`¹.
- `-q`: It is used if more than 1 file is given. Because of this command, data from each file is not preceded by its file name¹.
- `-v`: By using this option, data from the specified file is always preceded by its file name¹.

Here are some examples of how to use the `head` command:

- To display the first 10 lines of a file:

```bash
head file.txt
```

- To display the first 5 lines of a file:

```bash
head -n 5 file.txt
```

- To display the first 6 bytes of a file:

```bash
head -c 6 file.txt
```

In conclusion, the `head` command is a simple yet powerful tool for displaying the beginning of text files or command outputs¹².

# 8. tail

The `tail` command in Linux is a utility for displaying the end of text files or command outputs¹². By default, it prints the last 10 lines of the specified files¹.

Here's the basic syntax of the `tail` command¹:

```bash
tail [options] [file]
```

While using `tail`, you can use the following options¹:

- `-n num`: Prints the last `num` lines instead of last 10 lines¹. For example, `tail -n 5 file.txt` will display the last 5 lines of `file.txt`¹.
- `-c num`: Prints the last `num` bytes from the file specified¹. For example, `tail -c 6 file.txt` will display the last 6 bytes of `file.txt`¹.
- `-q`: It is used if more than 1 file is given. Because of this command, data from each file is not preceded by its file name¹.
- `-v`: By using this option, data from the specified file is always preceded by its file name¹.

Here are some examples of how to use the `tail` command:

- To display the last 10 lines of a file:

```bash
tail file.txt
```

- To display the last 5 lines of a file:

```bash
tail -n 5 file.txt
```

- To display the last 6 bytes of a file:

```bash
tail -c 6 file.txt
```

In conclusion, the `tail` command is a simple yet powerful tool for displaying the end of text files or command outputs¹².

# 9. chown

The `chown` command in Linux is a utility for changing the ownership of files and directories¹². The term `chown` stands for "change owner"⁵.

Here's the basic syntax of the `chown` command¹:

```bash
chown [options] [OWNER][:[GROUP]] [file]
```

- `OWNER`: The user name or the user ID (UID) of the new owner³.
- `GROUP`: The new group’s name or the group ID (GID)³.
- `file`: The name of one or more files, directories, or links³.

While using `chown`, you can use the following options¹:

- `-R, --recursive`: Operate on files and directories recursively¹.
- `--dereference`: Affect the referent of each symbolic link (this is the default), rather than the symbolic link itself¹.
- `-h, --no-dereference`: Affect symbolic links instead of any referenced file (useful only on systems that can change the ownership of a symlink)¹.
- `--from=CURRENT_OWNER:CURRENT_GROUP`: Change the owner and/or group of each file only if its current owner and/or group match those specified here¹.
- `--no-preserve-root`: Do not treat '/' specially (the default)¹.
- `--preserve-root`: Fail to operate recursively on '/'¹.
- `--reference=RFILE`: Use RFILE's owner and group rather than specifying OWNER:GROUP values¹.
- `-v, --verbose`: Output a diagnostic for every file processed¹.
- `--help`: Display help and exit¹.
- `--version`: Output version information and exit¹.

Here are some examples of how to use the `chown` command:

- To change the owner of a file:

```bash
chown new_owner file.txt
```

- To change the owner and group of a file:

```bash
chown new_owner:new_group file.txt
```

- To change the owner of all files in a directory recursively:

```bash
chown -R new_owner directory
```

In conclusion, the `chown` command is a powerful tool for managing file and directory ownership in Linux¹².

# 10. useradd

The `useradd` command in Linux is used to add user accounts to your system³. It edits `/etc/passwd`, `/etc/shadow`, `/etc/group` and `/etc/gshadow` files for the newly created user accounts, creates and populates a home directory for the new user, and sets permissions and ownerships to the home directory³.

Here's the basic syntax of the `useradd` command³:

```bash
useradd [options] [username]
```

While using `useradd`, you can use the following options³:

- `-d, --home`: Create a new home directory for the user.
- `-u, --uid`: Assign a specific user ID (UID) to the new user.
- `-g, --gid`: Assign a specific group ID (GID) to the new user.
- `-M`: Do not create a home directory for the new user.
- `-e, --expiredate`: Set an expiry date for the user account.
- `-c, --comment`: Add a comment or description for the user.
- `-s, --shell`: Change the login shell for the user.
- `-p, --password`: Set an unencrypted password for the user.

Here are some examples of how to use the `useradd` command:

- To add a new user in Linux:

```bash
sudo useradd test_user
```

- To add a user by specifying a home directory path for the new user:

```bash
sudo useradd -d /home/test_user test_user
```

- To create a user with a specific User ID (UID):

```bash
sudo useradd -u 1234 test_user
```

- To create a user with a specific Group ID (GID):

```bash
sudo useradd -g 1000 test_user
```

- To create a user without a home directory:

```bash
sudo useradd -M test_user
```

- To create a user with an expiry date:

```bash
sudo useradd -e 2020-05-30 test_user
```

- To create a user with a comment:

```bash
sudo useradd -c "This is a test user" test_user
```

- To create a user with a changed login shell:

```bash
sudo useradd -s /bin/sh test_user
```

In conclusion, the `useradd` command is a powerful tool for managing user accounts in Linux³.

# 11. userdel

The `userdel` command in Linux is a utility for deleting user accounts and their associated files¹²³. It modifies the system account files, deleting all entries that refer to the username¹²³.

Here's the basic syntax of the `userdel` command¹²³:

```bash
userdel [options] USER
```

While using `userdel`, you can use the following options¹²³:

- `-r, --remove`: Remove the user’s home directory along with the account¹²³.
- `-f, --force`: Force removal of the user account, even if the user is still logged in¹²³.
- `-Z`: Remove SELinux user mapping for the user’s login¹.
- `--help`: Display a help message and exit¹.

Here are some examples of how to use the `userdel` command:

- To delete a user:

```bash
sudo userdel username
```

- To forcibly delete a user:

```bash
sudo userdel -f username
```

- To delete a user along with the home directory and mail spool:

```bash
sudo userdel --remove username
```

In conclusion, the `userdel` command is a powerful tool for managing user accounts in Linux¹²³.


# 12. usermod

The `usermod` command in Linux is a command-line utility that allows you to modify a user’s login information¹. This includes adding a user to a group, changing a user shell, login name, home directory, and more¹.

Here's the basic syntax of the `usermod` command¹:

```bash
usermod [options] USER
```

While using `usermod`, you can use the following options¹:

- `-a, -G GROUP`: Add the user to the supplementary group(s). Use only with the `-G` option¹.
- `-c COMMENT`: The new value of the user's password file comment field. It is typically a short description of the login, and is currently used as the field for the user's full name¹.
- `-d HOME_DIR`: The user's new login directory¹.
- `-e EXPIRE_DATE`: The date on which the user account will be disabled¹.
- `-f INACTIVE`: The number of days after a password expires until the account is permanently disabled¹.
- `-g GROUP`: The group name or number of the user's new initial login group. The group must exist¹.
- `-G GROUP1[,GROUP2,...[,GROUPN]]]`: A list of supplementary groups which the user is also a member of. Each group is separated from the next by a comma, with no intervening whitespace¹.
- `-l LOGIN`: The name of the user will be changed from LOGIN to NEW_LOGIN¹.
- `-L`: Lock a user's password¹.
- `-m`: Move the content of the user's home directory to the new location¹.
- `-p PASSWORD`: The encrypted password, as returned by `crypt(3)`¹.
- `-s SHELL`: The name of the user's new login shell¹.
- `-u UID`: The numerical value of the user's ID¹.
- `-U`: Unlock a user's password¹.

Here are some examples of how to use the `usermod` command:

- To add a user to a group:

```bash
sudo usermod -a -G GROUP USER
```

- To change a user's home directory:

```bash
sudo usermod -d HOME_DIR -m USER
```

- To change a user's login shell:

```bash
sudo usermod -s /bin/sh USER
```

- To change a user's login name:

```bash
sudo usermod -l NEW_LOGIN USER
```

In conclusion, the `usermod` command is a powerful tool for managing user accounts in Linux¹.

# 13. passwd

The `passwd` command in Linux is a utility for managing password-related tasks¹². Its primary purpose is to change user passwords, but it offers additional functionalities such as updating password aging policies, unlocking accounts, and more¹².

Here's the basic syntax of the `passwd` command¹:

```bash
passwd [options] [username]
```

While using `passwd`, you can use the following options¹²:

- `-d, --delete`: Deletes the user password, making the account password-less¹.
- `-e, --expire`: Immediately expires the account password, prompting the user to change it on the next login¹.
- `-h, --help`: Displays help related to the `passwd` command¹.
- `-i, --inactive`: Sets the number of days after password expiration before the account is deactivated¹.
- `-k, --keep-tokens`: Changes the password only if it is expired, keeping authentication tokens if not expired¹.
- `-l, --lock`: Locks the password of the user, preventing login with a password¹.
- `-n, --mindays`: Changes the minimum number of days between password changes, preventing the user from changing the password for a specified period¹.
- `-q, --quiet`: Enables quiet mode, suppressing the usual message “Changing password for $user” during password change¹.
- `-r, --repository`: Changes the password for a specified repository¹.
- `-R, --root`: Applies changes in the specified directory and uses configuration files from that directory¹.
- `-S, --status`: Shows the password status of a user, including last change date, minimum age, maximum age, warning period, and inactivity period¹.
- `-a, --all`: Shows password status for all users. Requires the use of -S option¹.
- `-u, --unlock`: Unlocks the password of an account, allowing login with the password¹.
- `-w, --warndays`: Changes the number of days before password expiration to display a warning¹.
- `-x, --maxdays`: Sets the maximum number of days a password remains valid¹.

Here are some examples of how to use the `passwd` command:

- To change your own password:

```bash
passwd
```

- To change another user's password:

```bash
sudo passwd username
```

- To lock a user's password:

```bash
sudo passwd -l username
```

- To unlock a user's password:

```bash
sudo passwd -u username
```

In conclusion, the `passwd` command is a powerful tool for managing password-related tasks in Linux¹².

# 14. df

The `df` command in Linux stands for "disk filesystem". It is used to get a full summary of available and used disk space usage of the file system on the Linux system¹². If no file name is given, it displays the space available on all currently mounted file systems¹².

Here's the basic syntax of the `df` command¹²:

```bash
df [options] [filesystems]
```

While using `df`, you can use the following options¹²:

- `-a, --all`: Includes pseudo, duplicate, and inaccessible file systems in the output.
- `-B, --block-size=S`: Scales sizes by SIZE before printing them. Here, SIZE is an integer and optional unit (example: -BM prints sizes in units of 1,048,576 bytes).
- `-h, --human-readable`: Prints sizes in a human-readable format (e.g., 1K, 234M, 2G).
- `-H, --si`: Prints sizes in a human-readable format (e.g., 1k, 234m, 2g).
- `-i, --inodes`: Lists inode information instead of block usage.
- `-l, --local`: Limits listing to local file systems.
- `-P, --portability`: Uses POSIX output format.
- `-t, --type=TYPE`: Limits listing to file systems of type TYPE.
- `-T, --print-type`: Prints file system type.
- `--total`: Produces a grand total.
- `--help`: Display help and exit.

Here are some examples of how to use the `df` command:

- To display information about all the mounted file systems:

```bash
df
```

- To display disk usage in a human-readable format:

```bash
df -h
```

- To display the file system type along with the disk usage:

```bash
df -T
```

In conclusion, the `df` command is a powerful tool for managing disk space in Linux¹².

# 15. top

The `top` command in Linux is a utility that provides a dynamic real-time view of the running system¹². It shows information about system performance and running processes, including the process ID, user, CPU usage, memory usage, and more¹².

Here's the basic syntax of the `top` command¹:

```bash
top [options]
```

While using `top`, you can use the following options¹:

- `-d`: Changes the delay time between refreshing the screen.
- `-p`: Monitors specific processes based on their process ID.
- `-u`: Displays processes owned by a specific user.
- `-i`: Ignores idle or zombie processes.
- `-n`: Updates the display a specified number of times, then exits.

Here are some examples of how to use the `top` command:

- To start `top`:

```bash
top
```

- To change the update interval to 2 seconds:

```bash
top -d 2
```

- To display only the processes for a specific user:

```bash
top -u username
```

In conclusion, the `top` command is a powerful tool for monitoring system performance and managing processes in Linux¹².

# 16. ps

The `ps` command in Linux stands for "process status". It is used to provide a snapshot of the current processes on your system¹². By default, `ps` displays information about the processes associated with the current terminal session¹².

Here's the basic syntax of the `ps` command¹:

```bash
ps [options]
```

While using `ps`, you can use the following options¹²:

- `-A`: Displays information about all processes.
- `-e`: Displays information about all processes.
- `-f`: Provides full-format listing.
- `-u user`: Displays information about processes owned by `user`.
- `-x`: Includes processes without a controlling terminal.

Here are some examples of how to use the `ps` command:

- To display information about all the processes:

```bash
ps -A
```

- To display detailed information about all the processes:

```bash
ps -ef
```

- To display information about all the processes for a specific user:

```bash
ps -u username
```

In conclusion, the `ps` command is a powerful tool for managing and viewing processes in Linux¹².

# 17. ssh

The `ssh` command in Linux stands for "Secure Shell". It is a cryptographic network protocol for operating network services securely over an unsecured network¹². Typical applications include remote command-line, login, and remote command execution, but any network service can be secured with SSH¹².

Here's the basic syntax of the `ssh` command¹:

```bash
ssh [username]@[hostname or IP address]
```

While using `ssh`, you can use the following options¹:

- `-p port`: Specifies the port to connect to on the remote host.
- `-i key_file`: Selects a file from which the identity (private key) for public key authentication is read.
- `-C`: Requests compression of all data.
- `-v`: Verbose mode. Causes `ssh` to print debugging messages about its progress. This is helpful in debugging connection, authentication, and configuration problems.

Here are some examples of how to use the `ssh` command:

- To connect to a remote server:

```bash
ssh username@hostname
```

- To connect to a remote server using a specific port:

```bash
ssh -p port username@hostname
```

- To connect to a remote server with a specific identity (private key):

```bash
ssh -i key_file username@hostname
```

In conclusion, the `ssh` command is a powerful tool for secure remote command execution, secure file transfer, and secure tunneling of other applications¹².

# 18. scp

The `scp` command in Linux stands for "secure copy". It is used to copy files securely between hosts on a network¹². It uses SSH (Secure Shell) for data transfer and uses the same authentication and security as SSH¹².

Here's the basic syntax of the `scp` command¹²:

```bash
scp [options] [[user@]host1:]source_file_or_directory ... [[user@]host2:]destination
```

While using `scp`, you can use the following options¹²:

- `-P port`: Specifies the port to connect to on the remote host.
- `-p`: Preserves modification times, access times, and modes from the original file.
- `-q`: Disables the progress meter.
- `-r`: Recursively copy entire directories.
- `-s`: Name of program to use for the encrypted connection. The program must understand ssh (1) options.

Here are some examples of how to use the `scp` command:

- To copy a file from a local machine to a remote machine¹:

```bash
scp file_name remoteuser@remotehost:/remote/directory
```

- To copy a file from a remote machine to the local machine¹:

```bash
scp user@remotehost:/home/user/file_name .
```


