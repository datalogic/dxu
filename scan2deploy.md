---
title: Scan2Deploy
---
`Scan2Deploy` is an application devoted to the initial staging of devices by reading a barcode sequence. Depending on the content of the staging barcodes `Scan2Deploy` will (in this order)

* configure the device Wi-Fi network,
* control some device inner system settings (e.g. the lock-screen enabled state),
* download a data archive from a HTTP/HTTPS server and unpack it to the device,
* install/update applications and the system image, and
* run a customary script (to perform any additional setup).

It's worth noticing that the application is *not* a resident service. The above-mentioned actions are performed as long as `Scan2Deploy` is active and in use.

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

Some other editors know to use the schema files on schemastore.org when a given file uses a specific file extension. The following file extensions are registered on schemastore.org for Dataloigc Scan2Deploy files:

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

Information on Scan2Deploy for Android can be found in the [Scan2Deploy Android](https://github.com/datalogic/scan2deploy-android) repository.

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
