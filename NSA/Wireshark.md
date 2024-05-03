# Wireshark

Wireshark is a popular network protocol analyzer tool that allows you to inspect network traffic in real-time or from a saved file.

1. **Install Wireshark**: In Ubuntu, you can install Wireshark using the command `sudo apt install wireshark`. In Windows, you can download it from the official Wireshark website and follow the installation wizard.

    https://www.wireshark.org/download.html

2. **Start Wireshark**: Open Wireshark. You'll see a list of available network interfaces.

3. **Choose a network interface**: Select the network interface that you want to capture traffic from. This is typically the interface that's connected to the network you're interested in.

4. **Start capturing packets**: Click the "Start" button to begin capturing packets on that interface.

5. **Stop the capture**: Click the "Stop" button when you want to stop the capture.

6. **Analyze the packets**: You can now see a list of packets that have been captured. Click on a packet to see more details about it. You can also use the "Filter" bar at the top to filter packets based on various criteria.

For example, to filter HTTP traffic, you can enter "http" in the filter bar and press Enter. Only packets that match the filter will be displayed.

| Filter | Description |
| --- | --- |
| `ip.addr == 10.0.0.1` | Filter IP address |
| `tcp.port == 80` | Filter TCP port |
| `udp` | Filter all UDP packets |
| `tcp` | Filter all TCP packets |
| `http` | Filter all HTTP traffic |
| `dns` | Filter all DNS traffic |
| `ftp` | Filter all FTP traffic |
| `icmp` | Filter all ICMP traffic |
| `ip.src == 10.0.0.1` | Filter source IP address |
| `ip.dst == 10.0.0.1` | Filter destination IP address |
| `tcp.srcport == 80` | Filter source TCP port |
| `tcp.dstport == 80` | Filter destination TCP port |
| `frame.len == 64` | Filter by frame length |
| `eth.dst == 00:11:22:33:44:55` | Filter by destination MAC address |
| `eth.src == 00:11:22:33:44:55` | Filter by source MAC address |

You can combine filters using logical operators:

- `&&` (logical AND): `ip.src == 10.0.0.1 && tcp.port == 80`
- `||` (logical OR): `ip.src == 10.0.0.1 || ip.src == 10.0.0.2`
- `!` (logical NOT): `!arp`

