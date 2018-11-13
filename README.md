# DXU

Datalogic DXU is a an utility to configure devices in the following ways:

* Datalogic Configuration
* Firmware Update
* Remote Control

DXU can connect directly to individual Datalogic mobile computers that connect either directly to a PC via USB or remotely over a network, either via Ethernet or Wi-Fi. DXU reports information about currently connected devices.

## Documentation

* Documentation for latest DXU version is now available [here](https://datalogic.github.io/dxu/).

## Notes

* In Android 8 and on, broadcasts must be sent explicitly, so you need to specify a component in your script. For the APPLY_SETTINGS action, the full command will look like this: "SHELL am broadcast -a com.datalogic.dxu.action.APPLY_SETTINGS -n com.datalogic.dxu/.plugin.EnterpriseReceiver -e path sdcard/config82137.dxu". 

## Known Issues

* If you set "target-path" to "/mnt/sdcard/", then "purge-target-path" should be false. Otherwise, all directories in /sdcard/ will be deleted, including standard Android directories like "Download", "Music", etc. It's better to use a custom subdirectory like "/mnt/sdcard/myCompany". This is also what's causing the "archive inflating failed" error. If "purge-target-path" is true, "working-archive" should not be set to a location at or within "target-path" because the archive will be deleted.

* "skip-inflation" currently incorrectly checks inside the "global" section, rather than "deployment".

* "backup-to-enterprise" currently does not work. Set this to false for now.

* the bug regarding applying scanner settings is fixed in Scan2Deploy 1.3. We just need to include it in a firmware image.

* Several changes have been made to a different project and need to be reimplemented here. Some of these known issues may have been addressed.