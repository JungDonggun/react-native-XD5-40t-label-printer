package com.sizl.reactnativexd540tlabelprinter;

import com.bixolon.labelprinter.BixolonLabelPrinter;

public class BluetoothModule {
  public static BixolonLabelPrinter mBixolonLabelPrinter;

  BluetoothModule() {
    PrintEventHandler printHandler = new PrintEventHandler();
    mBixolonLabelPrinter = new BixolonLabelPrinter(null, printHandler.mHandler, null);
  }


  public void findBluetoothPrinters() {
    mBixolonLabelPrinter.findBluetoothPrinters();
  }

  public void connectPrinter(String address) {
    mBixolonLabelPrinter.connect(address);
  }
}
