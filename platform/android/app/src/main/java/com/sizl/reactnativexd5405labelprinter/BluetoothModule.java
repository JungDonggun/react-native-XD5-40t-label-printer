package com.sizl.reactnativexd5405labelprinter;

public class BluetoothModule {
  public void findBluetoothPrinters() {
    MainActivity.mBixolonLabelPrinter.findBluetoothPrinters();
  }

  public void connectPrinter(String address) {
    MainActivity.mBixolonLabelPrinter.connect(address);

    Log.i("JUNGDONGGUN", "Connected@@@@@@@@@@@@@@@");
  }
}
