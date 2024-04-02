# SSH (Secure Shell)

SSH is a network protocol that allows you to securely connect to a remote computer or server over an unsecured network. 


1. **Connect to a remote server**:
   ```
   ssh username@remote_host
   ```
   Replace `username` with your username on the remote server and `remote_host` with the IP address or domain name of the server.

2. **Connect with a specific port**:
   ```
   ssh -p port_number username@remote_host
   ```
   Use this command to connect to a server on a non-default SSH port. Replace `port_number` with the actual port number.

3. **Generate SSH key pair**:
   ```
   ssh-keygen
   ```
   This command generates a new SSH key pair (public and private key). Follow the prompts to specify the key type, location, and passphrase (optional).

4. **Copy SSH public key to server**:
   ```
   ssh-copy-id username@remote_host
   ```
   Use this command to copy your SSH public key to the remote server, allowing you to authenticate using key-based authentication.

5. **Securely transfer files to/from server**:
   - SCP (Secure Copy):
     ```
     scp /path/to/local/file username@remote_host:/path/to/destination
     ```
     This command copies a file from your local machine to the remote server or vice versa.
   - SFTP (SSH File Transfer Protocol):
     ```
     sftp username@remote_host
     ```
     Opens an interactive SFTP session for secure file transfer between your local machine and the remote server.

6. **Terminate SSH session**:
   ```
   exit
   ```
   Use this command to exit an active SSH session and return to your local shell.

7. **SSH tunneling (port forwarding)**:
   ```
   ssh -L local_port:remote_host:remote_port username@ssh_server
   ```
   Creates a local port forwarding tunnel, allowing you to access services on a remote server securely through your local machine.

8. **Check SSH server status**:
   ```
   systemctl status ssh
   ```
   On systems using systemd, this command checks the status of the SSH server service.

9. **Restart SSH server**:
   ```
   sudo systemctl restart ssh
   ```
   Use this command to restart the SSH server after making configuration changes or troubleshooting issues.

10. **Copy files securely between servers**:
    ```
    scp username1@remote_host1:/path/to/file username2@remote_host2:/path/to/destination
    ```
    Use SCP to copy files securely between two remote servers.
