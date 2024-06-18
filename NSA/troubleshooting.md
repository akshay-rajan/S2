### Q. You are given a system which is connected to internet. However, users logging on to the system are unable to access internet from their browser. Trouble shoot the issue, clearly documenting the steps you have taken (Possible issues to look for are browser configuration, network connectivity, routing, ip address configuration,DNS resolution)

### 1. **Verify Network Connectivity**
1. **Check Physical Connections:**
   - Ensure that the Ethernet cable is securely connected if using a wired connection.
   - For wireless connections, ensure the device is connected to the Wi-Fi network.

2. **Check Network Interface Status:**
   - Open a terminal or command prompt.
   - On Windows: `ipconfig`
   - On macOS/Linux: `ifconfig` or `ip a`

3. **Ping Test:**
   - Ping the local router/gateway to ensure local network connectivity.
     ```bash
     ping 192.168.1.1
     ```
   - Ping an external server (e.g., Google DNS) to check internet connectivity.
     ```bash
     ping 8.8.8.8
     ```

### 2. **Verify IP Address Configuration**
1. **Check IP Address Assignment:**
   - Ensure the system has a valid IP address, subnet mask, gateway, and DNS server configuration.
   - On Windows: `ipconfig /all`
   - On macOS/Linux: `ifconfig` or `ip a` and `cat /etc/resolv.conf`

2. **Renew IP Address:**
   - On Windows: `ipconfig /release` and then `ipconfig /renew`
   - On macOS/Linux: `sudo dhclient -r` and then `sudo dhclient`

### 3. **Check DNS Resolution**
1. **Verify DNS Configuration:**
   - Check the DNS server addresses. Ensure they are correct.
   - On Windows: `ipconfig /all`
   - On macOS/Linux: `cat /etc/resolv.conf`

2. **Test DNS Resolution:**
   - Use `nslookup` to verify DNS resolution.
     ```bash
     nslookup google.com
     ```
   - If DNS resolution fails, try using a public DNS server like Google DNS (8.8.8.8).

### 4. **Verify Routing**
1. **Check Routing Table:**
   - Ensure that there is a default route to the internet.
   - On Windows: `route print`
   - On macOS/Linux: `netstat -rn` or `route -n`

2. **Add/Correct Default Route:**
   - If the default route is missing, add it manually.
   - On Windows:
     ```bash
     route add 0.0.0.0 mask 0.0.0.0 192.168.1.1
     ```
   - On macOS/Linux:
     ```bash
     sudo route add default gw 192.168.1.1
     ```

### 5. **Check Browser Configuration**
1. **Verify Proxy Settings:**
   - Ensure that the browser is not set to use an incorrect proxy server.
   - In Chrome/Firefox: Go to Settings > Network Settings > Proxy.

2. **Clear Browser Cache and Cookies:**
   - Clear cache and cookies to rule out any browser-related issues.

3. **Disable Extensions:**
   - Temporarily disable browser extensions to ensure they are not causing the issue.

4. **Try a Different Browser:**
   - Use another browser to determine if the issue is browser-specific.

### 6. **Check Firewall and Security Software**
1. **Check Firewall Settings:**
   - Ensure that the firewall is not blocking internet access.
   - On Windows: Check Windows Firewall settings.
   - On macOS: Check the built-in firewall settings.
   - On Linux: Check `iptables` or `ufw` settings.

2. **Temporarily Disable Security Software:**
   - Temporarily disable antivirus or any security software to see if it resolves the issue.

### 7. **Check Router and ISP**
1. **Reboot Network Equipment:**
   - Restart the modem and router.

2. **Check Router Configuration:**
   - Log into the router and check for any settings that might be blocking internet access.

3. **Contact ISP:**
   - Verify with your ISP if there are any outages or issues on their end.

### 8. **Advanced Diagnostics**
1. **Traceroute:**
   - Run a traceroute to identify where the connection fails.
     - On Windows: `tracert google.com`
     - On macOS/Linux: `traceroute google.com`

2. **Check System Logs:**
   - Review system and browser logs for any errors or warnings related to network connectivity.

