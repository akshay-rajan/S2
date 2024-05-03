## Ubuntu

Installing Ubuntu in VM (VirtualBox).

1. **Download Ubuntu ISO**: Download the Ubuntu ISO file from the official Ubuntu website. Choose the version you want to install.

    https://ubuntu.com/download/desktop

2. **Install VirtualBox**: Download and install VirtualBox from the official VirtualBox website if you haven't already.

    https://www.virtualbox.org/wiki/Downloads

3. **Create a new Virtual Machine**: Open VirtualBox and click on "New" to create a new virtual machine. Name your VM, select "Linux" as the type, and "Ubuntu" as the version.

4. **Allocate RAM**: Decide the amount of RAM to allocate to the VM. A minimum of 2GB is recommended for Ubuntu.

5. **Create a virtual hard disk**: Choose "Create a virtual hard disk now" and click "Create". Choose "VDI (VirtualBox Disk Image)" as the hard disk file type. You can choose either "Dynamically allocated" or "Fixed size" for storage on the physical hard disk. Assign a size to the virtual hard disk (20GB or more is recommended).

6. **Attach the Ubuntu ISO**: Select the VM from the left panel in VirtualBox, click on "Settings", go to the "Storage" tab, under the "Controller: IDE", click on the empty disk icon, then click on the CD/DVD icon on the right side and choose "Choose a disk file...". Locate and select the Ubuntu ISO file you downloaded.

7. **Start the VM and Install Ubuntu**: Click "Start" to boot up your VM. It will boot from the ISO file and you should see the Ubuntu installation screen. Choose your language, and then click on "Install Ubuntu". Follow the on-screen instructions to complete the installation.

8. **Set up your Ubuntu**: After installation, restart the VM. You'll be asked to remove the installation media, but VirtualBox usually does this automatically. You should now boot into your fresh Ubuntu installation. Follow the on-screen instructions to complete the setup.


## antiX

Installing AntiX on a system with limited resources.

1. **Download AntiX ISO**: Download the AntiX ISO file from the official AntiX website using another computer.

    https://antixlinux.com/download/

2. **Create a bootable USB**: Use a tool like Rufus or UNetbootin to create a bootable USB stick with the AntiX ISO. Make sure the USB stick has at least 4GB of space.

    https://github.com/pbatard/rufus

3. **Insert the USB stick into the target system**: Plug the bootable USB stick into the system where you want to install AntiX.

4. **Boot from the USB stick**: Restart the system and press the appropriate key (usually F12, F10, or ESC) to open the boot menu. Select the USB stick as the boot device.

5. **Start the AntiX Installer**: Once the system boots from the USB stick, you will see the AntiX live environment. Look for an icon or menu entry for the AntiX Installer and start it.

6. **Follow the Installer Prompts**: The AntiX Installer will guide you through the process. You'll need to choose your language, set your timezone, partition your hard drive, and set up a user account.

7. **Install AntiX**: Once you've made all your selections, the installer will copy the AntiX system to your hard drive. This process may take some time.

8. **Restart the System**: After the installation is complete, you'll need to restart the system. Make sure to remove the USB stick so the system boots from the hard drive.

9. **Set up your AntiX**: After rebooting, you should boot into your fresh AntiX installation. Follow any on-screen prompts to complete the setup.

