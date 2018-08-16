# hello-dpc
Sample device owner app.

- After factory reseting a device, tap 6 times on the Setup Wizard's first page. 
- Scan this barcode after the QR Code reader is ready to scan using the device's rear camera:

![qr code](samples/hello-dpc/hello-dpc-enterprise-qr.png)


- Alternatively, download the APK and run this **adb** command to set as device owner:
```bash
adb shell dpm set-device-owner datalogic.com.hellodpc/.DeviceOwnerReceiver
```
