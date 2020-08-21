package com.sizl.reactnativexd540tlabelprinter;

import com.bixolon.labelprinter.BixolonLabelPrinter;

public class BluetoothModule {
  public BixolonLabelPrinter mBixolonLabelPrinter;

  BluetoothModule() {
    mBixolonLabelPrinter= new BixolonLabelPrinter(this, null, null);
  }

//  public PrintEventHandler printHandler;




  public void findBluetoothPrinters() {
    mBixolonLabelPrinter.findBluetoothPrinters();
  }

  public void connectPrinter(String address) {
    mBixolonLabelPrinter.connect(address);
  }
}
