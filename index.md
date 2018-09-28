---
title: Datalogic DXU Desktop
---

# Version 1.10

## Contents

1. [Audience](#audience)

1. [Conventions](#conventions)

1. [Product Overview](#product-overview)

1. [Installation](#installation)

1. [DXU Overview](#dxu-overview)

1. [Scan2Deploy](#scan2deploy)

1. [Device Configuration](#device-configuration)

1. [Device Info](#device-info)

1. [Remote Control](#remote-control)

1. [Firmware Utility](#firmware-utility)

1. [Credits](#credits)

## Audience

This manual is written for small business owners and corporate
administrators who find using DXU to configure and upgrade Datalogic
mobile computers that run the Android operating system. End users of
Datalogic’s mobile computers can usually change settings on the device
in their hands. Larger corporate administrators will likely resort to
MDM tools that can remotely configure and update large groups of mobile
devices at many sites simultaneously, such as Wavelink Avalanche and
42Gears SureMDM.

## Conventions

Datalogic mobile computers will often be referred to generically as “the
device” in this manual.

Personal computers which run any of a variety of Windows operating
systems will often be referred to as a “PC.”

**Application controls** are highlighted in **boldface** for
convenience.

![Note](./media/image40.png) Notes are highlighted with this icon for
visibility. These points illustrate ideas to remember.

![Caution](./media/image41.png) Cautions are highlighted with this icon for
visibility. Cautions only point out where a choice may result in a
savings of time or effort.

![Warning](./media/image42.png) Warnings are highlighted with this icon for
visibility. Warnings try to guide you around potential problems that may
result in incorrect functionality, loss or corruption of data, damage to
equipment, or the risk of physical danger.

## Product Overview

### DXU Features

Datalogic DXU is a an utility to configure devices in the following ways:

* Scan2Deploy
* Device Configuration
* Device Info
* Firmware Update
* Remote Control

DXU can connect directly to individual Datalogic mobile
computers that connect either directly to a PC via USB or remotely over
a network, either via Ethernet or Wi-Fi. DXU reports information about
currently connected devices.

![DXU Features](./media/image43.png)

DXU can configure a wide variety of device parameters, including the
scanner and most decoding parameters, the touch screen and the keyboard,
interfaces such as NFC, Wi-Fi, Bluetooth, USB, and Ethernet, device
settings such as date, time, time zone, and power management, and
security settings such as password access. DXU can also configure
communication parameters between the application that runs on a PC and
the client applications that run on Datalogic mobile computers.

DXU offers a method to print out barcodes that Datalogic mobile
computer users can scan to quickly connect to DXU called Scan2Deploy.

DXU offers remote control capabilities for remote troubleshooting. There
are some limitations to this (not too remote), but it allows a DXU
administrator an opportunity to remotely operate a Datalogic mobile
computer to check settings, configure the device using its own user
interface, and to see what a user sees.

### How DXU Works

DXU is really two applications working together. The DXU desktop
application runs on a Windows PC, providing convenient UI to configure
Datalogic mobile computers. An application runs continuously on
Datalogic mobile computers to extract current configuration settings and
send them to the DXU desktop application, and to receive updated
settings from the DXU desktop application and apply those configuration
settings to the mobile computer.

![How DXU Works](./media/image44.png)

DXU configurations are stored as configuration files on the PC, and are
transmitted to and from the Datalogic mobile computer as XML web pages.
XML is a standard data format that is widely used for a variety of
applications on the internet. Some data is encrypted in the XML file to
protect your sensitive data from prying eyes, but most data which is not
sensitive is transmitted in plain text that can be easily viewed and
analyzed.

DXU can connect directly to devices that are plugged into your PC via
USB, including those inserted into a powered dock which is connected to
your PC via USB. DXU can also connect to devices on your network. DXU
supports connecting only to devices in the same subnet as the PC running
DXU. Datalogic mobile computers connected to Wi-Fi wireless access
points can connect to DXU as long as the AP is on the same subnet as
your PC. Datalogic mobile computers connected over Ethernet can connect
to DXU too as long as they connect on the same subnet as your PC. Ask
your network specialists for more information.

### Supported Datalogic Mobile Computers

DXU supports select Datalogic mobile computers that run Android and Windows CE operating
systems.

#### Supported Android devices

* Joya Touch A6
* Joya Touch A6 Healthcare
* Skorpio X4
* Falcon X4
* DL-Axist

#### Supported Windows CE devices

* Skorpio X4
* Falcon X4
* Skorpio X3
* Falcon X3 / X3+

## Installation

The DXU desktop application must be installed on a Windows PC. DXU Agent
is already pre-installed on Datalogic mobile computers.

### Supported Windows Versions

DXU is supported on both 32-bit and 64-bit versions of the following Windows operating systems:

* Windows Vista
* Windows 7
* Windows 8
* Windows 8.1
* Windows 10

### Unsupported Windows Versions

DXU may run on older, unsupported Windows versions, but Datalogic
technical support will not support users who have problems if they
install DXU on Windows versions no longer supported by Microsoft.

### How to Install DXU

1. Copy the installer file to any convenient location on your PC.

2. Launch the installer.

3. If User Access Control (UAC) is enabled on your computer, authorize
    the installer to run. (UAC is enabled by default on all supported
    Windows operating systems, but it can be disabled by default. If you
    do not see this prompt, UAC may have been disabled.)

4. Follow on-screen prompts to finish installing DXU.

5. Follow on-screen prompts to finish installing Datalogic Device
    Support drivers.

## DXU Overview

### DXU Desktop Tasks

#### Available Devices Page

The Available Devices list displays devices which are either currently
connected, have been connected since launching DXU, or were manually
connected at some time in the past. You can refresh the view to
automatically show devices or hide devices which connect while you work
on another device. In general, they should appear automatically as they
connect.

![Device discovery](./media/image50.png)

By default, “No Devices Available” will display when no devices announce
themselves to DXU either when they connect via USB or when they connect
over a network. Simply connecting a Datalogic mobile computer to a
network, even on the same subnet as the PC running DXU, will not
automatically display as being available. The device must try to connect
to DXU, which sends an announcement packet to DXU. However, connecting a device to the
PC running DXU via USB will automatically display it in DXU. You may
also check the “Enable Automatic Discovery of Devices” checkbox in DXU’s
Settings view to automatically see any device that connects to the
network, but remember that automatic discovery is restricted to
discovering devices only within your PC’s subnet.

To configure a connected device, you simply click its button under
Available Devices to load its configuration into DXU.

To return to the DXU main window, click the Back button (generally, a
leftward pointing arrow in a circle).

![X](./media/image51.png)

##### Refresh

This button manually refreshes the display of currently connected
devices. This can overcome problems with the automatic display of
devices as they connect, and it can remove devices from the list that
are not currently connected.

![Refresh](./media/image52.png)

##### Add Device

This button opens the “Add Device” dialog which allows you to type the
IP address of a device. This dialog does not support DNS naming of
devices. You can also use a custom TCP port if you have configured your
device to use one in DXU Agent. For convenience, this field
pre-populates with your PC’s IP subnet. You need only type in the last
number of your device’s IP address if it is in the same subnet as your
PC.

![Add device](./media/image53.png)

This dialog allows you to manually connect to devices running DXU Agent
that are either inside your PC’s subnet or outside it. The limitation is
that devices on other subnets must be on a subnet that is routable from
your PC’s subnet. Consult with your network expert for more information.

Once connected, devices that respond to DXU’s query over the network
will display in the Available Devices list.

##### Load Configuration

Clicking the “Load Configuration” button opens a standard file dialog
that allows you to explore for and select a DXU configuration file.
Loading a configuration allows you to edit a device’s configuration when
the device is not connected to DXU. This also allows you to save copies
of this configuration to new locations or file names, so you can edit a
copy of the configuration while leaving the original configuration
unchanged.

![Load configuration](./media/image54.png)

To load a configuration:

1. Click the “Load Configuration” button.

2. Explore to any folder where DXU configuration files are located,
    then select any configuration file you wish. You can double-click it
    to streamline opening it.

3. Click the Open button.

Note that the default location is your user directory on your PC, but
DXU remembers the last directory you opened a DXU configuration file,
and always starts in that directory the next time you wish to open
another DXU configuration file.

#### Settings View

The **Settings** view is opened by clicking the Settings button on DXU’s
main view. This view includes controls which should seldom need to be
changed, such as the language that DXU displays in, TCP ports used to
communicate with remote devices, and the About tab that displays DXU’s
version.

##### Settings Tab

![Settings tab](./media/image60.png)

###### Language Section

The **Language** section lets you switch the language that strings in DXU
are displayed in. The default language is US English, but you may choose
Italian, Chinese Simplified, or Chinese Traditional. Additional
languages may be added later without notice.

##### Advanced Settings Tab

The “Advanced Settings” tab lets you change network communications
settings that DXU uses to communicate several types of information with
remote computers that are being configured.

![Advanced Settings](./media/image61.png)

###### Desktop UDP Service Port

The “Desktop UDP Server Port” filed must be set to the same value as the
matching ports on the remote device to ensure communication and remote
configuration.

###### Device UDP Service Port

The “Desktop UDP Server Port” field must be set to the same value as the
matching ports on the remote device to ensure communication and remote
configuration.

###### Device HttpServer Port

The “Device HTTP Server Port” field must be set to the same value as the
matching ports on the remote device to ensure communication and remote
configuration.

###### Device VNC Server Port

The “Device VNC Server Port” field must be set to the same value as the
matching ports on the remote device to enable Remote Control.

###### Enable Proxy

The “Enable Proxy” setting, if checked, will use your PC’s global proxy
settings to connect to external IP addresses.

###### (Beta) Enable USBLAN Proxy

This feature is currently released in Beta form. It allows you to
connect X4 and X3 generation CE devices running in USBLAN mode to a PC
running DXU via USB cable and access HTTP servers located on the
attached network (LAN or Internet). The following limitations are
present:

* The PC must not have any other services using UDP port 53

* The PC must not have any other services using TCP port 80

* HTTPS connections are not supported

* No feedback is provided if UDP port 53 or TCP port 80 is already in
  use on your system. It is recommended that you use the resmon.exe
  tool built into Windows to determine if other processes are using
  these ports before using this feature.

##### About Tab

The About tab displays DXU’s version. This is likely the first question
that Datalogic technical support may ask you if you call in with a
question.  The About tab also displays a link to the online DXU manual.

#### Desktop Configuration Utility - Device View

This is the view you see when you click on a device’s button in the
“Available Device” list. It displays a large picture of your device’s
model, along with the model name and serial number.

##### Configure this Device Button

This button lets you configure individual parameter values on your
device from DXU. The types of settings include scanner settings,
enterprise settings, system configuration settings, DXU Agent
configuration settings, Soft Spot settings, Tap2Deploy device-side
settings, and SureLock settings. Other settings may be added in the
future. Additional settings may be available depending on hardware
options installed on your Datalogic mobile computer, and may depend on
software installed on your mobile computer.

##### Device Info Button

Clicking this button displays the Device Info view, which displays your
device’s Wi-Fi radio capabilities, the type of barcode scanner on the
device, the operating system version, battery information, the firmware
version installed on your device, and the version of the enterprise SDK,
which may be important for troubleshooting.

![Device Info](./media/image62.png)

##### Remote Control Button

Clicking this button opens a Remote Control window that displays what is
visible on the screen of the device you are currently connected to. This
window also includes buttons to remotely activate the devices external
buttons, and to capture a screen shot of what is visible on its screen.

##### Firmware Utility Button

Clicking this button opens the “Firmware Utility” dialog, which you can
use to update the firmware on your device.

![Firmware Utility](./media/image63.png)

### Configure DXU

There are many ways to configure DXU, such as changing its language,
changing the TCP/IP ports used to communicate with DXU Agent on remote
devices, enabling automatic discovery of devices, enabling logging, and
resetting DXU’s settings back to their default values.

#### Configure DXU’s Language

DXU can display its controls in several languages. US English is the
default, but you can also select Italian, Chinese Simplified or Chinese
Traditional.

To change DXU’s language:

1. In DXU’s main view, click the **Settings** button.

   ![Settings](./media/image60.png)

2. Select the language you prefer in the **Language** menu.

3. Click the **Back** button (a leftward pointing arrow in a circle) to
    return to DXU’s main view.

#### Configure DXU Communication Settings

You can configure the TCP/IP ports used by DXU to communicate with DXU
Agent on Datalogic mobile computers. Configure these settings only if
you understand how these changes affect your network. Consult your
network expert for more information.

To configure DXU’s UDP and TCP ports:

1. In DXU’s main view, click the **Settings** button.

2. Click the “**Advanced Settings**” tab.

    ![Advanced Settings](./media/image71.png)

3. Edit the port values to match the ports used by **DXU Agent** on
    your devices:

4. The “Desktop UDP Server Port” configures the UDP port for the DXU
    server running on the on the console PC. It is set to UDP port 3453
    by default.

5. The “Device UDP Server Port” configures the UDP port for the DXU
    Agent server running on the device. It is set to UDP port 3453 by
    default.

6. The “Device HTTP Server Port” configures the TCP port for the DXU
    Agent server running on the device. It is set to TCP port 80 by
    default, like common web servers.

7. The “Device VNC Server Port” configures the TCP port for VNC running
    on the device. It is set to TCP port 5900, like common VNC servers.

8. Click the **Back** button (a leftward pointing arrow in a circle) to
    return to DXU’s main view).

#### Enable Automatic Discovery of Devices

You can enable the automatic discovery of Datalogic mobile computers by
DXU. This is not enabled by default.

![Warning](./media/image42.png) Warning: do not enable automatic discovery if
you have more than one user of DXU console in your subnet, or you risk
having two DXU administrators changing the settings on any particular
device in your subnet at once. DXU will warn you if it launches and
detects another instance of DXU already running in your subnet.

To enable automatic discovery of devices:

1. In DXU’s main view, click the **Settings** button.

2. Click the “**Advanced Settings**” tab.

3. Check the “**Enable Automatic Discovery of Devices**” checkbox.

4. Click the **Back** button (a leftward pointing arrow in a circle) to
    return to DXU’s main view).

#### Enable Logging on the DXU Console PC

DXU can log its activities, and this can be very helpful for technical
support to help you diagnose those unexpected problems that always seem
to pop up after software is released to actual users. Logging is not
enabled by default. DXU’s default log file location, once enabled, is in
your user directory at “C:\\Users\\\<user\>\\AppData\\Roaming\\Datalogic
DXU”.

To enable logging:

1. In DXU’s main view, click the **Settings** button.

2. Click the “**Advanced Settings**” tab.

   ![Enable Logging](./media/image72.png)

3. Check the “**Enable Logging**” checkbox.

4. Click the **Back** button (a leftward pointing arrow in a circle) to
    return to DXU’s main view).

#### Reset Advanced Settings to Defaults

You can reset DXU’s Advanced Settings to their default values. To do
this:

1. In DXU’s main view, click the **Settings** button.

2. Click the “**Advanced Settings**” tab.

3. Click the “**Reset Advanced Settings**” button.

4. Click the **Yes** button to confirm.

5. Click the **Back** button (a leftward pointing arrow in a circle) to
    return to DXU’s main view).

### Connect to devices

#### Connect to a Device via USB

You can connect to a Datalogic mobile computer directly by connecting it
to your PC with a USB cable. DXU will connect to it directly without any
further set-up.

1. Launch **DXU**.

2. Connect your device to your PC with a **USB** cable.

3. Click the device’s button in the “**Available Device**” list.

#### Connect to a Device via Network Manually

If DXU Agent on the device has its **“Enable Discovery Manager”**
feature enabled and **DXU** has “**Automatic Discovery of Devices”**
enabled under **Advanced Settings**, then clicking **Refresh** should
display it in the “Available Device” list if it is in the same subnet.

However, if you want to manually add a device in **DXU** make sure both
device and system are in the same subnet and do this:

1. On DXU’s main view, click the “**Add Device**“ button

    ![Add device](./media/image64.png)

2. In the “Add Device“ dialog, enter the **IP address** of the device
    and optionally its port if it is has been changed from the default;

   ![Note](./media/image40.png) Note: you will see the IP Address and port
   details displayed on DXU’s main view along with the model name, serial
   number, and an illustration of the device.

3. Click the **OK** button to complete.

The added device will display on the left side of the console under
**Available Device**.

![Note](./media/image40.png) Note: you can also directly connect the device
to DXU using USB.

#### Deleting a Device from the Available Device List

Simply click the exit button (**X**) located at top right of the device.

![X](./media/image51.png)

### Command Line DXU Execution

DXU allows for command line execution, such as via a .bat batch file.
This is a convenient method for configuring multiple devices without
having to either launch the UI of DXU desktop or the need to configure
Simplified Deploy. This configuration can happen via USB or over Wi-Fi
(assuming the device has already been attached to the Wi-Fi network).

#### Usage

DXU command line options are described below.

Apply configuration file to any USB connected devices:

```console
DXU –put <filename.dxu>
```

Apply configuration file to device of specific IP address:

```console
DXU –put <filename.dxu> -ip <ipaddress>
```

Apply Simplified Deploy to any USB connected devices:

```console
DXU –man <filename.ini>
```

Apply Simplified Deploy to device of specific IP address:

```console
DXU –man <filename.ini> -ip <ipaddress>
```

To output a log file, add the optional parameter:

```console
DXU -log <logfilename>
```

### Enable Logging on the Datalogic Mobile Computer

DXU Agent can log its activities. When enabled, logs are written to the
log file location. Logging can be helpful when diagnosing problems, but
at a slight cost of slowing DXU Agent and consuming slightly more power.
This checkbox is not checked by default.

You can specify where DXU Agent’s log file is kept on your Datalogic
mobile computer. The default location on Android OS mobile computers is
/storage/sdcard0, which is located in the device’s on-board flash
memory. This location is a persistent location, so log files stored here
are safe if the mobile computer reboots. If a MicroSD card is used, you
may wish to specify that logs be kept on the card if the card has
greater capacity than on-board flash. MicroSD cards are also persistent.

To enable DXU Agent logging on your Datalogic mobile computer:

1. Resume your mobile computer and unlock its screen.

2. Launch the **DXU Agent** application.

3. Tap the **Menu** button to display the menu.

4. Tap the **Settings** button.

5. Uncheck the “**Enable Service**” checkbox.

   ![Caution](./media/image41.png) Caution: you must uncheck “Enable Service” before
   you can change any setting in DXU Agent.

6. Check the “**Enable Log**” checkbox.

7. Check the “**Enable Service**” checkbox.

8. Clean up by tapping the **Home** button.

To specify where log files are stored on your Datalogic mobile computer:

1. Resume your mobile computer and unlock its screen.

2. Launch the **DXU Agent** application.

3. Tap the **Menu** button to display the menu.

4. Tap the **Settings** button.

5. Uncheck the “**Enable Service**” checkbox.

   ![Caution](./media/image41.png) Note: you must uncheck “Enable Service” before
   you can change any setting in DXU Agent.

6. Tap the “**Change Log File Location**” button.

7. Type a valid path on your device into the “Change Log File Location”
    field, and then tap the **OK** button.

8. (Optional, but desired if you wish to log to this new location)
    Check the “**Enable Log**” checkbox.

9. Check the “**Enable Service**” checkbox.

10. Clean up by tapping the **Home** button.

### Set User Names, Passwords, and Prompt for Authentication on DXU Configuration Files

Configurations and configuration files can require authentication to
open and apply. DXU implements an invisible sort of authentication by
automatically applying a default user name and password to every DXU
configuration and configuration file. You can display an authentication
prompt whenever anyone attempts to connect to one of your Datalogic
mobile computers with DXU, and change both the user name and password as
well to increase security of your devices.

#### Enable Authentication in DXU Agent

You can ensure that users are prompted to enter a user name and password
to open a configuration file in the DXU console or to DXU Agent’s
Settings window on a Datalogic mobile computer. This capability is
enabled with a single checkbox in DXU Agent.

To enable authentication:

1. Resume your mobile computer and unlock its screen.

2. Launch the **DXU Agent** application.

3. Tap the **Menu** button to display the menu.

4. Tap the **Settings** button.

5. Uncheck the “**Enable Service**” checkbox.

   ![Caution](./media/image41.png) Caution: you must uncheck “Enable Service” before
   you can change any setting in DXU Agent.

6. Check the “**Is Authentication Required**” checkbox.

7. Check the “**Enable Service**” checkbox.

8. Clean up by tapping the **Home** button.

To authenticate while opening DXU Agent’s Settings window:

1. Resume your mobile computer and unlock its screen.

2. Launch the **DXU Agent** application.

3. Tap the **Menu** button to display the menu.

4. Tap the **Settings** button.

5. Type your password into the “**Enter Password**” field, and then tap
    the **OK** button.

    ![Enter Password](./media/image48.png)

#### Change the User Name in DXU Agent

Editing the user name adds an extra layer of complication to
authentication. The default user name is “admin.” Changing the user name
adds another piece of information that a hacker must enter correctly to
access the configuration in DXU.

To change the User Name:

1. Resume your mobile computer and unlock its screen.

2. Launch the **DXU Agent** application.

3. Tap the **Menu** button to display the menu.

4. Tap the **Settings** button.

5. Uncheck the “**Enable Service**” checkbox.

   ![Caution](./media/image41.png) Caution: you must uncheck “Enable Service” before
   you can change any setting in DXU Agent.

6. Tap the “**User Name**” button.

7. Delete the contents of the field, and type a new user name.

8. Tap the **OK** button.

9. Check the “**Is Authentication Required**” checkbox.

10. Check the “**Enable Service**” checkbox.

11. Clean up by tapping the **Home** button.

#### Change the Password in DXU Agent

Editing the password ensures the simplest means to keep untrusted actors
out of DXU Agent configuration settings. The default password is “0000.”

To change the Password:

1. Resume your mobile computer and unlock its screen.

2. Launch the **DXU Agent** application.

3. Tap the **Menu** button to display the menu.

4. Tap the **Settings** button.

5. Uncheck the “**Enable Service**” checkbox.

   ![Caution](./media/image41.png) Note: you must uncheck “Enable Service” before
   you can change any setting in DXU Agent.

6. Tap the **Password** button.

7. Delete the contents of the field, and type a password.

8. Tap the **OK** button.

9. Check the “**Is Authentication Required**” checkbox.

10. Check the “**Enable Service**” checkbox.

11. Clean up by tapping the **Home** button.

## DXU Agents

### DXU Agent Android

The following describes the Android version of DXU Agent.

The most important thing to remember about changing DXU Agent settings
is that the DXU Agent Service must be disabled before changing settings,
and it must be enabled again after changing settings to put those
settings into operation.

Find these settings in the DXU Agent application on the mobile computer.

1. Launch the DXU Agent application.

2. Tap the Menu button (![Menu button](./media/image45.png)) to display the menu.

3. Tap the Settings button.

   ![Settings button](./media/image46.png)

4. Tap the Settings item

#### Settings

Here is a brief overview of each of the settings:

![DXU Agent settings](./media/image47.png)

##### a. Enable Service

This checkbox is the key to changing any settings in DXU Agent.
Unchecking this checkbox allows you to edit almost all settings.
Checking this checkbox puts those settings into operation. This checkbox
is checked by default.

Also, if for some reason you want to disable DXU on a mobile computer,
you can uncheck this checkbox to prevent DXU from changing settings.
Doing this will not undo settings changes already made, but it will
prevent DXU from getting the mobile computer’s settings and will prevent
DXU from changing any settings on the mobile computer.

##### b. Enable Discovery Manager

This checkbox controls the mobile computer’s broadcast of its name and
device type over USB or over a network to the DXU desktop application.
When checked, DXU will automatically see when the mobile computer
connects to USB or over a network. When unchecked, DXU will not display
when the mobile computer connects to USB or over the network. This
checkbox is checked by default.

##### c. Enable Log

This checkbox enables DXU Agent’s logging capability. When enabled, logs
are written to the log file location. Logging can be helpful when
diagnosing problems, but at a slight cost of slowing DXU and consuming
slightly more power. This checkbox is not checked by default.

##### d. Change Log File Location

This field allows you to specify where DXU Agent’s log file is kept on
your Datalogic mobile computer. The default location on Android OS
mobile computers is /storage/sdcard0, which is located in the device’s
on-board flash memory. This location is a persistent location, so log
files stored here are safe if the mobile computer reboots. If a MicroSD
card is used, you may wish to specify that logs be kept on the card if
the card has greater capacity than on-board flash. MicroSD cards are
also persistent.

##### e. Allow Binary Data in Configuration

This checkbox allows a few types of binary data to be transmitted from
the Datalogic mobile computer to DXU, and from DXU to the mobile
computer. The desktop wallpaper file is an example of binary data that
can be controlled by DXU. Checking this checkbox allows binary data to
be sent to or from the binary computer in the configuration file.
Unchecking this checkbox blocks transfer of binary data in the
configuration file. Binary data can be quite large compared to other
configuration data, so if performance is important and the desktop
wallpaper file does not need to be changed remotely for example, the
administrator can uncheck this checkbox to make configuration files
smaller and quicker to apply. This checkbox is checked by default.

##### f. Custom Home Page

This checkbox enables a locally hosted web page that can be displayed on
the device when network connectivity fails. Checking this checkbox will
set browsers’ error pages to the home page located in the “Home Page
Location” folder location. Unchecking this checkbox returns browsers to
their default error behavior when they cannot load any particular web
page.

##### g. Home Page Location

This field stores the path to a locally hosted web page that can be
displayed on the device when network connectivity fails. This
functionality is enabled by the “Custom Home Page” checkbox. This folder
can be located in either internal flash (/storage/sdcard0) or in a
MicroSD card (/storage/sdcard1). The default value is /storage/sdcard0.

##### h. Is Authentication Required

This checkbox enables authentication to launch DXU Agent, and puts the
User Name and Password into operation. When enabled, the user must
correctly type both the user name and password to gain access to DXU
Agent’s settings. This checkbox is not checked by default.

Note that these settings are also enforced by the DXU desktop
application when it loads the configuration from the device. The DXU
administrator will be prompted to type this user name and password. Once
authenticated, the DXU administrator can edit the user name and password
in DXU and apply these to devices.

##### i. User Name

This field stores the user name used to log into DXU Agent. It is put
into effect when the “Is Authentication Required” checkbox is checked.
The default value is “admin” and you can change it.

##### j. Password

This field stores the password used to log into DXU Agent. It is put
into effect when the “Is Authentication Required” checkbox is checked.
The default value is “0000” and you can change
it.

![Password](./media/image48.png)

##### k. Is Simplified Deploy enabled

This checkbox enables Simplified Deploy. This is a security setting that could be used, for example, to allow use of Simplified Deploy only once as an out-of-box experience.

##### l. Is application install enabled

This checkbox enables installing applications with Simplified Deploy. This is a security setting that can be used to disable the feature of allowing Simplified Deploy to install customer applications onto the device.

##### m. Enable VNC

This checkbox enables VNC, a cross-platform standard for remotely
controlling computers. DXU uses VNC to implement its Remote Control
feature. Unchecking this checkbox blocks DXU from remotely observing and
controlling the device. Checking this checkbox enables this feature.
This checkbox is checked by default.

##### n. VNC Password

This field allows VNC communication to be authenticated, so prying eyes
cannot remotely connect to and control your Datalogic mobile computer.
This field is blank by default.

#### Advanced Settings

These settings must match settings on DXU in order for the DXU desktop
application to communicate with Datalogic mobile computers. A mismatch
will result in a communication failure, which will block all
configuration functionality.

Change these settings only if you understand precisely any advantage you
may gain by doing so. Most users will not realize any advantage from
changing these port settings.

Find these settings in the DXU Agent application on the mobile computer.

To configure DXU Agent’s **Advanced Settings**, do this:

1. Launch the DXU Agent application.

2. Tap the Recent Apps button to display the menu.

3. Tap the “Advanced Settings” button.

As with the DXU Agent settings listed above, these advanced settings can
only be changed when the “Enable Service” checkbox is unchecked.

![Advanced settings](./media/image49.png)

##### a. Device HTTP Server Port

This field configures the HTTP port for the DXU server running on the
device. It is set to TCP port 80 by default, the same as most web
servers.

##### b. Device UDP Server Port

This field configures the UDP port for the DXU server running on the
device. It is set to UDP port 3453 by default.

##### Desktop UDP Server Port

This field configures the UDP port for communicating to the DXU desktop
server. It is set to UDP port 3453 by default.

##### c. VNC Server Port

This field configures the HTTP port for VNC running on the device. It is
set to TCP port 5900 by default, which is the customary port used by
most VNC clients for connections.

#### Version

This page displays the DXU Agent version number.

### DXU Agent Windows CE

DXU Agent for Windows CE can be found in the device's Control Panel.

## Scan2Deploy

`Scan2Deploy` is an application devoted to the initial staging of devices by reading a barcode sequence. Depending on the content of the staging barcodes `Scan2Deploy` will (in this order)

* configure the device Wi-Fi network,
* control some device inner system settings (e.g. the lock-screen enabled state),
* download a data archive from a HTTP/HTTPS server and unpack it to the device,
* install/update applications and the system image, and
* run a customary script (to perform any additional setup).

It's worth noticing that the application is *not* a resident service. The above-mentioned actions are performed as long as `Scan2Deploy` is active and in use.

### Scan2Deploy Topics

1. [Creating Scan2Deploy files](#creating-scan2deploy-files)
1. [Barcode Generation](#barcode-generation)
1. [Scan2Deploy Android](#scan2deploy-android)
1. [Scan2Deploy Windows CE](#scan2deploy-windows-ce)

### Creating Scan2Deploy files

You will need to create your Scan2Deploy JSON files using a text editor. JSON schemas are provided for both Scan2Deploy Android and Scan2Deploy Windows CE. There are several advantages to using an editor that supports these schemas:

* Provides help text for each field

* Provides real-time compiler-like messages letting you know when you have made a mistake

* Allows you to write files faster and with fewer mistakes

#### Choosing an editor

There are several good JSON editors available. We reccommend [Visual Studio Code](https://code.visualstudio.com/). It is free and has [many features designed to make writing JSON files easier](https://code.visualstudio.com/docs/languages/json), including utilizing JSON schemas.

Visual Studio and Visual Studio Code can be configured to use JSON schemas by including the `$schema` tag in you JSON file. Datalogic has made schemas available for both Android and Windows CE JSON files as follows:

For Android:

```json
{
    "$schema": "http://json.schemastore.org/datalogic-scan2deploy-android"
}
```

For Windows CE:

```json
{
    "$schema": "http://json.schemastore.org/datalogic-scan2deploy-ce"
}
```

Some other editors know to use the schema files on schemastore.org with you give the file a specific extension. The following file extensions are registered on schemastore.org for Dataloigc Scan2Deploy files:

* For Android: *.dla.json
* For Windows CE: *.dlc.json

### Barcode Generation

Scan2Deploy barcodes are generated with the `Scan2Deploy` UI inside DXU Desktop. From the main *Device Configuration Utility* page, click the *Scan2Deploy (Beta)* button:

![Scan2Deploy button](./media/image81.png)

Once you are at the Scan2Deploy UI page, you can browse to the JSON file you have created and then click `Generate PDF`.

![Scan2Deploy button](./media/image82.png)

A PDF page will open up in your default PDF viewer, ready for you to print, save, or scan.

![Scan2Deploy button](./media/image83.png)

### Scan2Deploy Android

In order to describe the JSON input-file structure used for Android devices, we start off by picking an example template file containing all the available parameters, as follows

```json
{
    "$schema": "http://json.schemastore.org/datalogic-scan2deploy-android",
    "layout": {
        "description": "This is for our Android devices",
        "enroll": true
    },
    "padlock": {
        "valid-until": "20991231235959",
        "key": "ihavenomouthandimustscream",
        "state": "locked",
        "hide-from-launcher": false
    },
    "global": {
        "target-path": "/mnt/sdcard/airwatch",
        "install-path": "/mnt/sdcard/airwatch",
        "update-path": "/mnt/sdcard/airwatch",
        "purge-target-path": true,
        "auto-scan": true,
        "script": "setup.s",
        "action": "close",
        "backup-to-enterprise": true
    },
    "settings": {
        "date-time": "Thu, 19 Apr 2018 07:51:37 GMT",
        "auto-time": false,
        "auto-time-zone": false,
        "auto-time-server": "pool.ntp.org",
        "debug-bridge": false,
        "lock-screen": false,
        "status-bar": false,
        "navigation-bar": true,
        "charge-threshold": 0,
        "usb-profile": "NONE",
        "usb-function": "CHARGING"
    },
    "network": {
        "essid": "TESTTKIP",
        "hidden": false,
        "mode": "wpa-psk",
        "mode-key": "datalogic",
        "mode-key-encrypted": false,
        "ephemeral": false,
        "wait-for-connection": true
    },
    "deployment": {
        "scheme": "http",
        "host": "172.19.0.77",
        "port": 8080,
        "path": "/airwatch.zip",
        "ping-timeout": 1000,
        "fetch-timeout": 60000,
        "working-archive": "/mnt/sdcard/target.zip",
        "skip-inflation": true
    },
    "blobs": [
        {
            "file": "/mnt/sdcard/airwatch/credentials.bin",
            "content": "fd09B1iL/k4jRWrjrP0/sO44teY            +B3UafBLsMsCEqd1KOv6b6JYBXLVv70FmHdZhIVoEOQvHu7O4PUJStpZQ+4PYjPqCO+NQr81M7GOF421Ke8L2u4EYyqDE5qXfLy2shEgaRwRpr2f35/38WZkh6edyiWZQJjyLeZcuI7WiaJPpw7Jcw7ye7mb7Rl+ePNFmfvUrpeRFtN+5kUsx/SbB1v0gDyOOuoep"
        }
    ]
}
```

Each section is *optional* in nature. Sections `padlock`, `settings`, `network`, `deployment`, and `blobs` are skipped when missing. Also, for the `settings` section, the configuration parameters are *optional* and when not provided the current setting is kept.

#### Layout

The `layout` section is used to format the output file. The available parameters are the following

* `description`: (optional) Free-form description field (350 max characters). Description will be displayed in header of output file. The default description is `none`.
* `enroll`: (optional) Boolean flag instructing DL-Config to generate Scan2Deploy Device Owner Enrollment QR code in output file. The default value is `false`.

#### Padlock

The `padlock` section is used to configure the staging locking feature. The available parameters are:

* `valid-until`: (optional) Specifies the expiration date of the barcode sequence. In order for this to properly work the device date should be synchronized or at least configured. The default value is `20991231235959`, that is a non-expiring barcode sequence.
* `key`: (optional) Defines the padlock key to be used. If the values doesn't match the device one the barcode is rejected. The default value is the empty string (meaning, no key).
* `state`: (optional) Configures the padlock state. Can be either `locked` indicating that the provided key is possibly set, or `unlocked` in the case device padlock need to be disabled.
* `hide-from-launcher`: (optional) Boolean value that enables the `Scan2Deploy` to be disabled for good once the staging is complete. Please note that once disabled the application can't be re-enabled unless a factory-reset is performed. The default value is `false`.

#### Global

The `global` section is used to configure some application scoped settings. It also specifies

* `target-path`: (optional) This is the base destination folder where any archive/fill will be inflated/written. The default value points to the device internal SD-card root.
* `install-path`: (optional) Folder where the application expects auto-installed/auto-updated APKs are to be found. The default value point to the value specified for the `target-path` parameter.
* `update-path`: (optional) Folder where the application expects auto-updated OTA packages are to be found. The default value point to the value specified for the `target-path` parameter.
* `purge-target-path`: (optional) Boolean value that drives the application behaviour with regards to the target path, that is whether a pre-existing target need to be *purged* (i.e. *deleted*) prior inflation of the deployment archive. The default value is `true` in order to ensure a cleanest-as-possibile deployment.
* `auto-scan`: (optional) Boolean value that enables/disables the auto-installation and auto-update of APKs and OTA packages. The default value is `false`.
* `downgrade-preinstalled`: (optional) Boolean value used to force the downgrade even of (system) pre-installed application, if required. The default value is `false`.
* `script`: (optional) Can be either a string specifying the absolute/relative path of a file, or a JSON array of strings describing the file content line-by-line. The script file will be interpreted and run at the very end of the staging process, after any setting/network/deployment has been completed. The default value is the empty string (i.e. `""`), disabling the script interpretation.
* `action`: (optional) Specifies the final action performed by the application at the very end of the staging process. This can be `none`, `close`, `enterprise-reset`, `factory-reset`, `reset`, or an `intent:`/`android-app://` URI. The default value is `none`.
* `backup-to-enterprise`: (optional) Boolean flag that activates the enterprise backup persistence for the staging data. That means that both the staging script and archive are copied in the enterprise partition. Upon enterprise reset, the application will re-stage the device with such information. The default value is `false`.

#### Settings section

The `settings` sections can be used to controls some inner device settings, that typically need to be changed from the default (Android) setting. The available parameters are the following

* `date-time`: (optional) String representation, in RFC-1123 format, of the date to be set. The default value is `null`, which leave the current device date untouched.
* `auto-time`: (optional) Boolean value controlling the *Date & Time* automatic date-time adjustment setting. The default (Android) value is `true`.
* `auto-time-zone`: (optional) Boolean value controlling the *Date & Time* automatic time-zone adjustment setting. The default (Android) value is `true`.
* `auto-time-server`: (optional) Address of the NTP server to be used for date-time synchronization. Please note that the timezone won't possibly be synched due to lack of a GPS unit in the device. If the server is set a device reboot is suggested for the new setting to be spread system-wide.  The default value is `null`, which leave the default NTP is used (i.e. `asia.pool.ntp.org`).
* `debug-bridge`: (optional) Boolean value controlling the state of *Android Debug Bridge*. The default (Android) value is `true`.
* `lock-screen`: (optional) Boolean value controlling the state of Android's lock-screen, requiring the user to swipe the display to unlock the device. The default (Android) value is `true`.
* `status-bar`: (optional) Boolean value controlling the (top) display status-bar. By hiding the status-bar notifications will disappear, too. The default (Android) value is `true`.
* `navigation-bar`: (optional) Boolean value controlling the (bottom) display navigation-bar. The default (Android) value is `true`.
* `charge-threshold`: (optional) Integer value in the range `0` to `100` indicating the charge threshold a battery exhausted device need to reach to automatically boot when recharging. The default value is `5`.
* `usb-profile`: (optional) USB communication profile in use. Available values are `NONE`, `BOTH`, `DATA`, and `CHARGE`. The default (Android) value is `BOTH`.
* `usb-function`: (optional) USB communication function in use. Available values are `MTP`, `PTP`, and `CHARGING`. The default (Android) value is `CHARGING`.

#### Network

The `network` sections is used to configure the device Wi-Fi network. The available parameters are the following

* `essid`: (optional) The wireless network ESSID. The default value is `tsunami`.
* `hidden`: (optional) Boolean value indicating whether the wireless network is using a hidden ESSID. The default value is `false`.
* `mode`: (optional) The wireless connection mode. Supported values are `open`, `wep-40`, `wep-104`, `wpa-psk`, `wpa2-psk`, `wpa-eap`, and `wpa2-eap`. The default value is `open`.
* `mode-key`: (optional) The wireless network key, if needed. The default value is the empty string (i.e. `""`).
* `mode-key-encrypted`: (optional) Boolean value reporting if the `mode-key` is written in plain-text or encrypted (with a custom encryption algorithm). The default value is `false`.
* `eap-method`: (optional) Configures the EAP authentication method. Supported values are `none`, `peap`, `tls`, `ttls`, `pwd`, `sim`, `aka`, and `aka-prime`. The default value is `none`.
* `eap-phase2`: (optional) Configures the EAP phase 2 authentication method. Supported values are `none`, `pap`, `mschap`, `mschapv2`, and `gtc`.The default value is `none`.
* `eap-identity`: (optional) Indicates the EAP identity. The default value is the empty string (i.e. `""`).
* `eap-anonymous-identity`: (optional) Indicates the EAP anonymous identity, used as the unencrypted identity with certain EAP types. The default value is the empty string (i.e. `""`).
* `eap-password`: (optional) Sets the EAP password, if needed. The default value is the empty string (i.e. `""`).
* `eap-password-encrypted`: (optional) Boolean value reporting if the `eap-password` is written in plain-text or encrypted (with a custom encryption algorithm). The default value is `false`.
* `eap-certificate`: (optional) Base64 representation of the EAP certificate to use. The default value is the empty string (i.e. `""`).
* `proxy-host`: (optional) Server name or IP address of the proxy to be user for HTTP/HTTPS communications. The default value is the empty string (i.e. `""`).
* `proxy-port`: (optional) Server IP port of the proxy for HTTP/HTTPS communications. The default value is `0`.
* `purge`: (optional) Boolean value telling if any currently configured wireless network is to be removed. This can be useful in order to avoid profile roaming. The default value is `true`.
* `reconfigure`: (optional) When the `purge` parameter is set to `false` the wireless network the application is going to set-up could already be existing. This boolean parameter controls the application behavior, that will re-configure any existing and matching network (`true`) or skip it and leave it untouched (`false`).
* `sleep-policy`: (optional) Wireless sleep policy, as for Android's [Settings.Global](https://developer.android.com/reference/android/provider/Settings.Global.html) parameter. Available values are `0` (`WIFI_SLEEP_POLICY_DEFAULT`), `1` (`WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED`), and `2` (`WIFI_SLEEP_POLICY_NEVER`). The default value is `2` (i.e. `WIFI_SLEEP_POLICY_NEVER`).
* `frequency-band`: (optional) Controls the frequency bands supported by the device. Supported value are `auto`, `5ghz`, and `2ghz`. The default value is the current device setting (typically `"auto"`).
* `ephemeral`: (optional) If set to `true` the wireless connection profile will be solely used during the staging process, and deleted once complete. When `false` the profile will still be present after the staging process. The default value is `true`.
* `save-to-file`: (optional) Absolute path of the file where the current network configuration will be saved. The default value is the empty string (`""`), indicating that the network configuration will not be serialized to file.
* `wait-for-connection`: (optional) Tells whether a valid Wi-Fi connection has to be waited once the network configuration is complete. Can be useful when the device need to be configured *but* a valid Wi-Fi connection is not ready, yet. The default value is `true`.

#### Deployment

The `deployment` section can be used to download a ZIP archive from a server and inflate it to the `target-path` folder. The available parameters are the following

* `scheme`: (optional) The deployment download scheme to use. Can be either `http` or `https`. The default value is `http`.
* `host`: (mandatory) The host-name or internet-protocol address of the server from which the resource is to be fetched.
* `port`: (optional) TCP/IP port to be used to contact the server. The default value is `80`.
* `path`: (optional) Path to the server resource to download, complete with query-string if needed. The default value is the empty string (`""`).
* `check-timeout`: (optional) The default value is `1000`.
* `fetch-timeout`: (optional) The default value is `60000`.
* `skip-inflation`: (optional) Boolean value instructing the application *not* to inflate the deployment archive once downloaded. This can be useful to speed the OTA update process up. The default value is `false`.
* `working-archive`: (optional) String representation of the local archive path-file name, once downloaded. The default value is `/mnt/sdcard/scan2deploy.archive`.

#### Blobs

The `blobs` (optional) section is a JSON-array of objects. Each object *must* contain the following two attributes

* `file`, the path of the file to be created, and
* `content`, the base64 representation of the actual file content.

The `file` attribute can be either absolute or relative (in this latter case, relative to the `global/target-path` parameter value). During the files de-serialization any required (parent) path is automatically created.

In order to generate the base64 representation of a give binary file any suitable tool can be used (e.g. `base64` command-line program, or online services such as [HexEd.it](https://hexed.it) or [CyberChef](https://gchq.github.io/CyberChef/)).

#### Third-party Integration

The application can be either controller by the user, or programmatically controlled in un-manned manner. This can be achieved by calling the launch intent for the `com.datalogic.android.scan2deploy` package and passing the encoded data representing the configuration to be applied.

```java
Context context = ...; // Android context to be used (e.g. the current activity one)
String data = ...; // Encoded Scan2Deploy configuration
PackageManager packageManager = context.getPackageManager();
Intent launchIntent = packageManager.getLaunchIntentForPackage("com.datalogic.android.scan2deploy");
launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
launchIntent.putExtra("data", data);
context.startActivity(launchIntent);
```

To obtain the encoded configuration data, the `dl_config.exe` program need to be called with the `--encodeonly=true` flag. In this case, obviously, the output filename is not required. An example output in this case is the following:

```console
> dl_config.exe lock-test.json --encodeonly=true
Datalogic Staging Configurator (ver 1.6.0)
Copyright (c) 2016-2018 by Datalogic MCSA S.r.l.
======================================================================
Loading file 'lock-test.json'
Processing data
-----BEGIN ENCODED DATA-----
Bm9uiYeZ/NWOnA0ZtIrgLMe1iTFLmjusB6P7S4z/lVZ7LFk1d++YM73GqVnqsT9dmxEEuWfR9My93fUA2tUcEv+jxlGNjljHQpXt96BvbVR8bokir3SsXTnFU3qTDeZznLs3PFh+O3n59luLWVNR3c2mFJF5vaGmLue6xHi3bwJgrZOKzs3/bpibCqeNBLcHa/zQRCPQw4=
-----END ENCODED DATA-----
```

The data string to be passed is the ASCII armored sequence (header and trailer included).

As a sidenote, when launched from intent it could be beneficial to specify the global action for the application in order to (for example) automatically close it when the settings have been applied.

#### Scripting Language

During the staging finalization phase, the application can be instructed to interpret and run a custom script, enabling it to perform additional post-staging procedures.

The language structure is a simple one-statement-per-line sequence, executed in order.

Some (the most useful) of the supported commands are the following:

* `DELETE <path> <pattern> <include>`: Recursively deletes files/folders starting from `path`, only if the name matches the `pattern` regular-expression. If `include` is `true` the matching entries will be deleted, the non-matching otherwise. If folder `path` is empty at the end of the process it will be deleted, as well.
* `GRANT <package-name>`: Grants all the permissions declared in the manifest for an application given its `package-name`.
* `INFLATE <archive-path> <target-path>`: Inflates the ZIP archive found at `archive-path` to `target-path` folder.
* `INSTALL <apk-path>`: Installs an application given the path to the containing APK.
* `LAUNCH <package-name>`: Starts the launching intent given an application `package-name`.
* `SHELL <command-with-arguments>`: Runs an arbitrary shell command, similarly to the `ADB shell` command.
* `UNINSTALL <package-name>`: Uninstalls a previously installed application given its `package-name`.
* `UPDATE <ota-path> <reset-type> <force-update>`: Installs a firmware update from an OTA package.
* `WAIT <milliseconds>`: Suspend the script execution for `milliseconds` milliseconds.

### Scan2Deploy Windows CE

`Scan2Deploy` is an application devoted to the initial staging of devices by reading a barcode sequence. Depending on the content of the staging barcodes `Scan2Deploy` will (in this order)

* configure the device Wi-Fi network,
* download a data archive from a HTTP/HTTPS server and unpack it to the device,
* execute a series of shell commands

It's worth noticing that the application is *not* a resident service. The above-mentioned actions are performed as long as `Scan2Deploy` is active and in use.

#### Input File Structure

In order to describe the JSON input-file structure, the following example templates show how the available parameters are used:

Example EAP-FAST and applying a .dxu file:

```json
{
    "$schema": "http://json.schemastore.org/datalogic-scan2deploy-ce",
    "layout": {
      "description": "This is for our WEC7 devices, configures EAP-FAST network and applies .dxu file"
    },
    "global": {
        "target-path": "\\FlashDisk",
        "action": "warm-boot",
    "ping-timeout": 1000
},
"settings": {
    "usb-function": "usblan"
},
"network": {
    "profile": "my_fast",
    "essid": "eapfast",
    "mode": "wpa2-aes",
    "eap-method": "fast",
    "eap-username": "eapfast",
    "eap-password": "1234567890",
    "credentials-type": "password",
    "credentials-source": "profile",
    "validate-server": false,
    "connect-to-server": false,
    "connect-to-server-names": "",
    "server-cert-name": "",
    "outer-identity": "",
    "fast-reconnect": false,
    "inner-method": "eap-MsChapV2",
    "auto-pac": true,
    "pac-file-path": "",
    "pac-aid-info": ""
},
"deployment": {
    "scheme": "http",
    "host": "10.1.20.123",
    "port": 8080,
    "path": "target.zip"
},
"shell": {
    "cmds" : [
        {
            "app-name": "\\windows\\dldxu.exe",
            "args": "\\FlashDisk\\target\\config.dxu"
        }
    ]
}
}
```

Example WPA2-PSK and firmware update:

```json
{
"$schema": "http://json.schemastore.org/datalogic-scan2deploy-ce",
"layout": {
    "description": "This is for our WEC7 devices, configures wpa2-psk network and performs firmware update"
},
"global": {
    "target-path": "\\FlashDisk",
    "action": "close",
    "ping-timeout": 1000
},
"settings": {
    "usb-function": "active-sync-usb"
},
"network": {
    "profile": "my_psk",
    "essid": "tsunami",
    "mode": "wpa2-psk",
    "mode-key": "1234567890",
    "eap-method": "none"
},
"deployment": {
    "scheme": "http",
    "host": "10.1.20.123",
    "port": 8080,
    "path": "target.zip"
},
"shell": {
    "cmds" : [
        {
            "app-name": "\\windows\\fupdate.exe",
            "args": "\\FlashDisk\\target\\nk.img"
        }
    ]
}
}
```

Example WEP, MS-DOS commands, and applying a .dxu file:

```json
{
"$schema": "http://json.schemastore.org/datalogic-scan2deploy-ce",
"layout": {
    "description": "This is for our WEC7 devices, configures WEP network and applies .dxu file"
},
"global": {
    "target-path": "\\",
    "action": "warm-boot",
    "ping-timeout": 1000
},
"settings": {
    "usb-function": "usblan"
},
"network": {
    "profile": "my_wep",
    "essid": "tsunami",
    "mode": "wep-104",
    "mode-key": "1234567890123",
    "index": 1,
    "eap-method": "none"
},
"deployment": {
    "scheme": "http",
    "host": "10.1.20.123",
    "port": 8080,
    "path": "FlashDisk.zip"
},
"shell": {
    "cmds" : [
        {
            "app-name": "\\windows\\cmd.exe",
            "args": "/c copy \\FlashDisk\\config.dxu \\Temp"
        },
        {
            "app-name": "\\windows\\dldxu.exe",
            "args": "\\Temp\\config.dxu"
        },
        {
            "app-name": "\\windows\\cmd.exe",
            "args": "/c del \\Temp\\config.dxu"
        }
    ]
}
}
```

Each section is optional and will be skipped if missing from Json.

#### Layout Section

The `layout` section is used to format the output file. The available parameters are the following

* `description`: (optional) Free-form description field (350 max characters). Description will be displayed in header of output file. The default description is `none`.

#### Global Section

The `global` section is used to configure some application scoped settings. The available parameters are the following

* `target-path`: (optional) This is the base destination folder where any archive/folder will be inflated. The default value is `\FlashDisk`.
* `action`: (optional) Specifies the final action performed by the application at the very end of the staging process. This can be `stay`, `close`, `warm-boot`, `cold-boot`, or `clean-boot`. The default value is `cold-boot`.
* `ping-timeout`: (optional) The timeout value used when attempting to reach the host server. The default value is `1000`.

#### Settings Section

The `settings` section is used to configure some inner device settings. The available parameters are the following

* `usb-function`: (optional) USB communication function in use. Available values are `active-sync-usb`, `active-sync-com`, `usblan`, and `mass-storage`.

The default value is `active-sync-usb`. **Requires reboot for usb setting change to take effect.**

#### Network Section

The `network` section is used to configure the device Wi-Fi network. The available parameters are the following

* `profile`: (optional) The "friendly" name to associate with the network connection. The default value is `datalogic`.
* `essid`: (optional) The wireless network ESSID. The default value is `tsunami`.
* `mode`: (optional) The wireless connection mode. Supported values are `open`, `wep-40`, `wep-104`, `wpa-psk`, `wpa2-psk`, `wpa-tkip`, and `wpa2-aes`. The default value is `open`.
* `mode-key`: (optional) The wireless network key for `wep-40`, `wep-104`, `wpa-psk`, and `wpa2-psk` networks. The default value is the empty string (i.e. `""`).
* `index`: (optional) The wireless network key index for `wep-40` and `wep-104` networks. Supported values are `1`, `2`, `3`, and `4`. The default value is `1`.
* `eap-method`: (optional) Configures the EAP authentication method. Supported values are `none`, `peap`, `tls`, `ttls`, `fast`, and `leap`. The default value is `none`.
* `eap-username`: (optional) The username for the EAP method. The default value is the empty string (i.e. `""`).
* `eap-password`: (optional) The password for the EAP method. The default value is the empty string (i.e. `""`).
* `credentials-type`: (optional) Indicates the EAP credentials type. Supported values are `password`, `token`, `certificate`, and `unknown`. The default value is `password`.
* `credentials-source`: (optional) Indicates the EAP credentials source. Supported values are `user`, `logon`, `profile`, `auto`, and `unknown`. The default value is `user`.
* `validate-server`: (optional) Boolean value indicating if the server certificate should be validated. The default value is `false`.
* `connect-to-server`: (optional) Boolean value indicating if only the servers listed in the `connect-to-server-names` list should be connected to. The default value is `false`.
* `connect-to-server-names`: (optional) Semi-colon separated list of servers that are valid to connect to during server certificate validation. The default value is the empty string (i.e. `""`).
* `server-cert-name`: (optional) The "friendly" name of the server digital certificate that should be validated. The default value is the empty string (i.e. `""`).
* `outer-identity`: (optional)  The outer identity for the EAP method. The default value is the empty string (i.e. `""`).
* `fast-reconnect`: (optional) Boolean value to enable fast reconnect. The default value is `false`.
* `inner-method`: (optional) The inner EAP authentication method to use. Supported values are `eap-tls`, `eap-MsChapV2`, and `eap-gtc`. The default value is `eap-tls`.
* `auto-pac`: (optional) Boolean value indicating if automatic PAC provisioning is used for an EAP-FAST network. The default value is `false`.
* `pac-file-path`: (optional) The full path to the PAC file for manual PAC provisioning. The default value is the empty string (i.e. `""`).
* `pac-aid-info`: (optional) The PAC authority identity (AID) information used to select PAC from a list of PACs on the device. The default value is the empty string (i.e. `""`).

#### Deployment Section

The `deployment` section can be used to download a ZIP archive from a server and inflate it to the `target-path` folder. The available parameters are the following

* `scheme`: (optional) The deployment download scheme to use. Can be either `http` or `https`. The default value is `http`.
* `host`: (mandatory) The host-name or internet-protocol address of the server from which the resource is to be fetched.
* `port`: (optional) TCP/IP port to be used to contact the server. The default value is `80`.
* `path`: (optional) Path to the server resource to download, complete with query-string if needed. The default value is the empty string (`""`).

#### Shell Section

In the final staging phase, Scan2Deploy can be used to perform post-staging procedures, such as to update firmware or apply a .dxu configuration file to the device.
The `shell` section contains the JSON-array `cmds`. Each object in `cmds` is a shell command to execute. The available parameters are the following

* `app-name`: (mandatory) The full path to the application to be executed.
* `args`: (optional) The command line arguments. The default value is the empty string (`""`).

## Device Configuration

### Configuration Files

DXU configuration files end with the \*.dxu file extension. They are XML
files that can contain binary data for some configuration items like
wallpaper images.

#### Save a Configuration File

To save a configuration file, do this:

1. From within the “Device Configuration” view, click the “**Save As**”
   button.

   ![Save Configuration](./media/image65.png)

2. You may type the path and file name in the field, or you can click
   the **Browse** button to use a stand file dialog to explore to the
   folder of your choice and type the file name. Unusually, clicking
   the Save button in the Save As dialog does not actually save the
   configuration file yet, but instead returns you to the “**Save
   Configuration**” dialog.

3. *Optionally*, you may check the “**Use Password**” checkbox and type
   a password into the field. This will obligate anyone who opens this
   configuration file in the future to correctly type the password in
   order to open the file.

4. Click the **Save** button.

5. Click the **OK** button to dismiss the confirmation dialog.

#### Open a Configuration File

To load a configuration file saved earlier, do this:

1. Launch DXU.

2. Click the “**Load Configuration**” file. This will open a standard
    file dialog.

3. Explore to your configuration file, select it, and click the
    **Open** button.

![Load configuration](./media/image66.png)

#### Open a Configuration File Which is Authenticated

DXU will display a login prompt when you open a configuration file that
requires authentication. DXU will also display a login prompt when
connecting to a device with a password set in DXU Agent.

![LogIn Window](./media/image67.png)

To open a configuration or connect to a device which requires
authentication:

1. Open a configuration file or load the configuration from a connected
   device.

2. Type the user name for this configuration or device into the “**User
   Name**” field.

3. Type the password for this configuration or device into the
   **Password** field.

4. Click the **OK** button.

#### Edit a Configuration File Off-line

You can edit configuration files even when the device they were drawn
from are not connected to DXU. Do this:

1. Open your configuration file.

2. Edit any settings you wish.

3. Either save the result to a new configuration file, or just save to
    the same configuration file.

#### Add Comments to Configuration Settings

Comments can be added to any tab, node, or parameter in the “Device
Configuration” view. Comments are indicated with a small text balloon
icon.

![Add Commnets](./media/image68.png)

To add a comment:

1. Open a configuration file or load the configuration from a connected
    device.

2. Click the “**Configure This Device**” button.

3. Right-click on any tab, node, or parameter, then select the “**Add
    comment**” command in the context-sensitive menu.

4. Type your comment.

5. Click the **OK** button to save. A small text balloon will appear
    next to the item you commented on.

To edit a comment:

1. Right-click on any item with a small comment icon.

2. Select the “**Edit comment**” command in the context-sensitive menu.

3. Edit your comment.

4. Click the **OK** button to save.

#### Show Comments

You can show all comments in a configuration file in one handy table by
doing this:

1. Open a configuration file or load the configuration from a connected
    device.

2. Click the “**Configure This Device**” button.

3. If do not have comments in this configuration file, add several.

4. Click the “**Show Comments**” button in the button bar.

You can select and edit comments in this table by double-clicking on the
Comment field. Simply click the exit button (**X**) to close the dialog.

### Configure a Device On-line

Once you have added the device to **Desktop Configuration Utility**, you
can click on the listed device under **Available devices** and use
**Configure This Device** option to start configuring the device. There
is also an option to add comments on all the listed settings.

![Device Configuration](./media/image69.png)

To configure a device that is directly connected via USB:

1. Launch DXU.

2. Connect your Datalogic mobile computer to your PC via a USB cable.

3. Click the button for your connected device in the “Available Device”
    list.

4. Click the “Configure This Device” button.

5. Configure any settings you wish.

6. Save changes to a configuration file of you do not wish to apply
    them to your device.

7. Apply the configuration changes to your device is this is what you
    want to do.

To configure a device that is connected over the network (either
Ethernet or Wi-Fi):

1. Launch DXU.

2. Connect your Datalogic mobile computer to DXU manually, using
    Scan2Deploy labels, or using automatic discovery. (See instructions
    for these methods in this section.)

3. Click the button for your connected device in the “Available Device”
    list.

4. Click the “Configure This Device” button.

5. Configure any settings you wish.

6. Save changes to a configuration file of you do not wish to apply
    them to your device.

7. Apply the configuration changes to your device is this is what you
    want to do.

### Configuring SureLock and SureFox

For Datalogic Android devices, device and browsing lockdown can occur
using SureLock and SureFox, respectively. These lockdown settings can be
set via the DXU desktop. There are two important prerequisites to
configuring these settings when creating a DXU configuration file.

1. The EULA on the device must first be accept. This can be performed
   by first launching SureLock or SureFox on the device and accepting
   the EULA on the device. Future versions of DXU Desktop will allow
   you to remotely accept this EULA just once for your entire
   installation.

2. The “Enable SureLock Password” and/or “Enable SureFox Password”
    fields must have the current password. The Default password is
    “0000”.

For SureLock:

![SureLock](./media/image74.png)

And for SureFox:

![SureFox](./media/image75.png)

#### Changing the SureLock and/or SureFox Password

To Change the SureLock and/or SureFox password, after completing the
above steps, you can enter the new password in the “Change Password”
field.

For SureLock:

![SureLock Password](./media/image76.png)

For SureFox:

![SureFox Password](./media/image77.png)

#### Activating the SureLock and/or SureFox License

The activation codes for SureLock and SureFox, provided by 42Gears™,
cannot be used directly by DXU to active your fleet of devices. First,
they must be converted into an *encrypted* activation code.

To activate the SureFox/SureLock license using DXU, users need to enter
the *encrypted* activation code in the “Activation Code” field. To get
the encrypted activation code, users will need to manually activate the
license on one device and then extract the *encrypted* activation code
and use this *encrypted* code to activate surefox/surelock on other
devices from DXU.

For SureLock:

![SureLock Activation Code](./media/image78.png)

For SureFox:

![SureFox Activation Code](./media/image79.png)

Below are the steps to get the *encrypted* activation code, if you have
the unencrypted activation code.

1. On the device, open the SureFox/SureLock app and then click on the
    screen five times to open the SureFox/SureLock settings. Users will
    be prompted to enter the password after tapping the screen five
    times to open the settings.

2. Manually activate the SureFox/SureLock (**Settings** \> **About**
    **SureFox / About SureLock** **\> Activate)**.

3. After activating the license, export the settings to file
    (**Settings \> Import/Export Settings \> Export to File).**

    You can select the path where you want to save the settings on the
    device and the filename. But make sure to change the file extension
    from ‘**.settings’** to ‘**.txt**’ before saving the settings.

4. Then open the settings file and extract the *encrypted* activation
    code, after “activationcode=”.

   ![Activation Code](./media/image80.png)

## Device Info

### View Device Info for a Connected Device

You can view information about a device that is connected to DXU. This
information includes the capabilities of the device’s Wi-Fi radio, the
type of barcode scanner it has, the OS version, the battery’s type and
state of charge, the firmware version, and the version of the Datalogic
Enterprise SDK.

To view information about the device you are connected to:

1. Load the configuration from a connected device.

2. Click the “**Device Info**” button.

3. Click the **Back** button (a leftward pointing arrow in a circle)
     to return to DXU’s main view).

### View Device Info Recorded in a Configuration File

You can view information about the device from which a configuration
file was extracted. This information includes the capabilities of the
device’s Wi-Fi radio, the type of barcode scanner it has, the OS
version, the battery’s type and state of charge, the firmware version,
and the version of the Datalogic Enterprise SDK.

To view information about the device from which a configuration file was
extracted:

1. Open a configuration file or load the configuration from a connected
    device.

2. Click the “**Device Info**” button.

3. Click the **Back** button (a leftward pointing arrow in a circle) to
    return to DXU’s main view).

## Remote Control

Remote Control lets you see what is displayed on the screen of a
connected Datalogic mobile computer. This window also includes buttons
to remotely activate the device’s external buttons, and to capture a
screen shot of what is visible on its screen. Note that clicking a
button on screen does not physically press a button, or even trigger it
electrically, but instead sends an event message in the system as if you
had pushed a physical key or tapped a physical button on the touch
screen. Remote Control works through the magic of software.

![Remote Control](./media/image73.png)

### Unlock the Screen Using Remote Control

You can unlock the screen by dragging your mouse on the Remote Control
screen in the same manner as a user swiping on the device’s screen.

To start **Remote Control** and unlock a device’s screen:

1. Launch **DXU**.

2. Connect the device to DXU either directly using **USB** or on the
    network via **Wi-Fi** or **Ethernet**.

3. Click the device’s button in the “**Available Device**” list.

4. Click the “**Remote Control**” button.

5. If the device is suspended, with its screen off, click the **Power**
    button (3) at the bottom of the **Remote Control** window.

6. Click on the **lock icon** and drag it rightward, releasing it over
    the **unlocked lock icon** at the right edge of the Remote Control
    window.

#### 1\. Home Button

At the bottom of the Remote Control window, the **Home** button
activates the device’s Home button, which switches the display to the
Home screen.

#### 2\. Menu Button

At the bottom of the Remote Control window, the **Menu** button
activates the device’s menu. Some applications have a menu, and others
do not, so this feature depends on which application is active when you
click the Menu button.

#### 3\. Power Button

At the bottom of the Remote Control window, the **Power** button toggles
the device’s power state as if you had pressed the device’s Power
button. If the device is awake, clicking the Power button will turn off
the screen, locking the screen if the device is configured to do that.
If the device’s screen is off, clicking the Power button will resume the
device as if you pushed the device’s Power button.

#### 4\. Back Button

At the bottom of the Remote Control window, the **Back** button takes
the device to the previously viewed screen or application as if you had
tapped the device’s Back button.

#### 5\. Scan Button

At the bottom of the Remote Control window, the **Scan** button
activates the device’s barcode scanner as if you had pressed one of the
Scan keys on the device. There are some limitations: the scanner will
not scan if there is no application running that can receive its data;
the scanner cannot scan if the Camera application is showing its live
preview or taking a photograph or recording a video; and the scanner
will not scan if none of the device’s scan buttons are configured to
scan. However, in general if you have your device configured to scan
barcodes and an application is receiving the data, then the Scan button
will trigger a scan remotely.

#### 6\. Save a Screenshot of Remote Device

At the bottom of the Remote Control window, the **Save** button takes a
screen shot of the remote computer and prompts to save it to your PC.
The default path that DXU saves screen shots is your user folder.

### Set a VNC Password

VNC is a standard protocol for remotely controlling PC’s and other
computers, and it allows the use of a password to prevent unwanted
remote access to computers.

![Caution](./media/image41.png) Caution: the VNC password must match between DXU
console and DXU Agent on the device or a connection will not be made.

#### Set a VNC Password in DXU Agent

You can set a password for VNC in DXU Agent. This field allows VNC
communication to be authenticated, so prying eyes cannot remotely
connect to and control your Datalogic mobile computer. This field is
blank by default.

To set or edit a VNC password in DXU Agent:

1. Resume your mobile computer and unlock its screen.

2. Launch the **DXU Agent** application.

3. Tap the **Menu** button to display the menu.

4. Tap the **Settings** button.

5. Uncheck the “**Enable Service**” checkbox.

   ![Caution](./media/image41.png) Caution: you must uncheck “Enable Service” before
   you can change any setting in DXU Agent.

6. In the “**VNC Settings**” section, tap the **Password** button.

7. Type a password into the field. It can be numbers, letters, or some
     punctuation characters.

8. Tap the **OK** button.

9. Check the “**Enable Service**” checkbox.

10. Clean up by tapping the **Home** button.

To authenticate Remote Control when a password is set on the device:

1. Launch **DXU**.

2. Connect the device to DXU either directly using **USB** or on the
    network via **Wi-Fi** or **Ethernet**.

3. Click the device’s button in the “**Available Device**” list.

4. Click the “**Remote Control**” button.

5. Type the device’s **VNC password** into the field, and then click
    the **OK** button.

### Set or Edit the VNC Authentication Password from DXU

You can change a device’s VNC password from DXU. It is a configuration
parameter in the Device Configuration view. To do this:

1. Open a configuration file or load the configuration from a connected
    device.

2. Click the “Configure This Device” button.

3. Click the “DXU Configuration” tab.

4. Click the “General Settings” node in the middle pane.

5. Type a password into the “VNC Authentication Password” field, or
    edit the value in that field.

6. Note: the value in this field is encrypted for security. Once
    entered, it will be displayed as asterisks.

7. Click the **Back** button (a leftward pointing arrow in a circle) to
    return to DXU’s main view).

## Firmware Utility

You can update a Datalogic mobile computer’s firmware from DXU. DXU
provides several options, such as performing a “Silent Install” where no
user interaction is required on the device, and performing a “Force
Update” where the firmware is reinstalled even if the device reports
that it already has the same version installed. Also, you can specify
whether a factory data reset or an enterprise reset is performed after
updating the firmware, or if the update will simply reboot the device
without performing an update.

![Note](./media/image40.png) Note: DXU firmware update is not the only way
to update firmware on Datalogic mobile computers. DXU’s firmware update
capability works only with connected devices. If you need a method that
can update firmware on many devices remotely, especially if they are not
connected to a network, then other methods may suit your needs better.
Please consult your device’s user reference guide for other firmware
update methods.

![Note](./media/image40.png) Note: customarily firmware update is referred
to as “update” on Datalogic mobile computers that use Microsoft Windows
operating systems, and it is referred to as “upgrade” on Datalogic
mobile computers that use the Android operating system. These terms are
used because the creators of these operating systems use these terms,
but the terms essentially mean the same thing.

### Silent Install

This option allows you to perform an image update that does not require
any user interaction on the device. If left unchecked, the user will be
prompted to perform the update, but they have the option to cancel the
update. This checkbox is not checked by default.

### Force Update

This option allows you to perform a full upgrade of the firmware
regardless of what is installed on the device. By default, the firmware
upgrade utility will compare the version of the image file with what is
already running on the device, and if they match it will skip updating.
This is done to save time and prevent inconvenience for most users in
the field. However, in rare circumstances a firmware image can become
corrupted in the field, and this option allows a DXU administrator to
perform a full firmware upgrade, disregarding the version reported by
the device.

### Factory Data Reset After Installing Firmware

A factory data reset is a full reset of the device intended to return it
to the condition it would be in if it were just leaving the factory.
This reset deletes all user data and settings, deletes installed
applications, and resets the device’s real-time clock to its default
date and time. Data on microSD cards is not affected.

### Enterprise Reset After Installing Firmware

An enterprise reset is much like a factory data reset, except that it
does not reset network connects such as Wi-Fi settings, and it does not
reset custom desktop wallpaper graphics and splash screen graphics. In
every other way, it resets the device, including restoring flash memory
to factory defaults, removing installed applications, deleting user
data, and resetting the date and time to default levels.

### Update Firmware on a Connected Device

You must first connect to a device to update its firmware with DXU. The
connection can be either with USB, or over a network using Wi-Fi or
Ethernet.

To perform a firmware update with DXU:

1. Launch **DXU**.

2. Connect the device to DXU either directly using **USB** or on the
    network via **Wi-Fi** or **Ethernet**.

3. Click the device’s button in the “**Available Device**” list.

4. Click the “**Firmware Utility**” button.

5. Click the **Browse** button to open a standard file dialog to browse
    for and select a suitable firmware image file.

   ![Caution](./media/image41.png) Caution: DXU will automatically filter your view
   of file types to those that are compatible with your device.

6. Navigate to your firmware image file, select it, and click the
    **Open** button.

7. (Optional) Check the “**Silent Install**” checkbox if you wish to
    perform a firmware update that does not require user interaction on
    the device.

8. (Optional) Check the “**Force Update**” checkbox if you wish to
    force a complete reinstallation of this image on the device.

9. (Optional) Select an option from the “**Reset Type**” menu if you
    wish to perform a factory data reset after the image update
    finishes, or if you wish to perform an enterprise reset after the
    image update finishes, or if you just want to have the device reboot
    without resetting at all.

10. Click the **Update** button.

## Credits

### Contact Information

Datalogic ADC, Inc
959 Terry Street
Eugene, OR 97402 USA
Telephone: (541) 683-5700
Fax: (541) 345-7140

### Copyright Notice

©2017 Datalogic ADC, Inc

An Unpublished Work - All rights reserved. No part of the contents of
this documentation or the procedures described therein may be reproduced
or transmitted in any form or by any means with- out prior written
permission of Datalogic ADC, Inc. or its subsidiaries or affiliates
(“Datalogic” or “Datalogic ADC”). Owners of Datalogic products are
hereby granted a non-exclusive, revocable license to reproduce and
transmit this documentation for the purchaser’s own internal business
purposes. Purchaser shall not remove or alter any proprietary notices,
including copyright notices, contained in this documentation and shall
ensure that all notices appear on any reproductions of the
documentation.

Should future revisions of this manual be published, you can acquire
printed versions by contacting your Datalogic representative. Electronic
versions may either be downloadable from the Datalogic website
(www.datalogic.com) or provided on appropriate media. If you visit our
website and would like to make comments or suggestions about this or
other Datalogic publications, please let us know via the “Contact
Datalogic” page.

### Disclaimer

Datalogic has taken reasonable measures to provide information in this
manual that is complete and accurate; however, Datalogic reserves the
right to change any specification at any time without prior notice.

Datalogic and the Datalogic logo are registered trademarks of Datalogic
S.p.A. in many countries, including the U.S.A. and the E.U. All other
brand and product names may be trademarks of their respective owners.

### Patents

See
[www.patents.datalogic.com](http://www.patents.datalogic.com/) for patent list.
