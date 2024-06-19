# NGINX

**nginx** is an HTTP server.
nginx can be used to serve web applications.

It can also be used as a **reverse proxy** server, which acts as an intermediary between the actual server.
This can allow for load balancing (distribution of workload across multiple servers), caching, encryption, and other features.

nginx is known for its performance, stability, and low resource usage.

### Installation

```bash
sudo apt install nginx
```

### Configuration

nginx is configured using `.conf` files.
These files are located in `/etc/nginx`.

The main configuration file is `nginx.conf`.

### Usage

Start nginx:
```bash
sudo service nginx start
# OR
nginx
```
Now the server is available on [localhost:8080](http://localhost:8080)

To stop the server, run:
```bash
sudo service nginx stop
```

## `nginx.conf`

The configuration is contains 

1. **Key-value pairs**, which are **directives**
    
    ```nginx
    worker_processes 1;
    ```

2. **Blocks**, known as **contexts**.

    ```nginx
    http {
        ...
    }
    ```

## Serve a Static Website

Create a directory to store the website files:

```bash
mkdir mysite
```
Create an `index.html` file in the directory.

Update the configuration of nginx:
```nginx
http {
    server {
        listen 8080;
        root /path/to/mysite;
    }    
}
```
Now reload the server:
```sh
nginx -s reload
```
Now the static website is hosted on port `8080`.
