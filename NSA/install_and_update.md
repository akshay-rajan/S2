### For Debian-based Distributions (e.g., Ubuntu, Debian)

#### Installing an Application

1. **Update the package list**:
   ```bash
   sudo apt update
   ```
2. **Install the application**:
   ```bash
   sudo apt install <application_name>
   ```

#### Updating an Application

1. **Update the package list**:
   ```bash
   sudo apt update
   ```
2. **Upgrade the installed packages**:
   ```bash
   sudo apt upgrade
   ```

### For Red Hat-based Distributions (e.g., RHEL, CentOS, Fedora)

#### Installing an Application

1. **Install the application**:
   ```bash
   sudo yum install <application_name>  # For RHEL/CentOS
   sudo dnf install <application_name>  # For Fedora
   ```

#### Updating an Application

1. **Update the installed packages**:
   ```bash
   sudo yum update  # For RHEL/CentOS
   sudo dnf update  # For Fedora
   ```

### For Arch-based Distributions (e.g., Arch Linux, Manjaro)

#### Installing an Application

1. **Install the application**:
   ```bash
   sudo pacman -S <application_name>
   ```

#### Updating an Application

1. **Update the installed packages**:
   ```bash
   sudo pacman -Syu
   ```

