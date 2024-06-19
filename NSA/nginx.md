# NGINX

**nginx** is an HTTP server.
nginx can be used to serve web applications.

It can also be used as a **reverse proxy** server, which acts as an intermediary between the actual server.
This can allow for load balancing (distribution of workload across multiple servers), caching, encryption, and other features.

nginx is known for its performance, stability, and low resource usage.

## Installation

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


## Examples

### Serve a Static Website

Create a directory to store the website files:

```bash
sudo mkdir -p /var/www/html
```

Create an `index.html` file in the directory:

```html
sudo echo "<h1>Hello, World!</h1>" | sudo tee /var/www/html/index.html
```

Create a new configuration file in `/etc/nginx/sites-available`:

```bash
sudo nano /etc/nginx/sites-available/mywebsite
```

Add the following configuration to the file:

```nginx
server {
    listen 80;
    server_name example.com;

    location / {
        root /var/www/html;
        index index.html;
    }
}
```

Create a symbolic link to enable the site:

```bash
sudo ln -s /etc/nginx/sites-available/mywebsite /etc/nginx/sites-enabled/
```

Remove the default configuration:

```bash
sudo rm /etc/nginx/sites-enabled/default
```

Reload nginx:

```bash
sudo service nginx reload
```

Now you can access the website by visiting `http://example.com` in a web browser.
