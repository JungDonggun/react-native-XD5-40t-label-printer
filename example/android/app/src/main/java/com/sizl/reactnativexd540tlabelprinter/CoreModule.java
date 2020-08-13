package com.sizl.reactnativexd540tlabelprinter;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.util.Log;
import com.bixolon.labelprinter.BixolonLabelPrinter;

public class CoreModule extends ReactContextBaseJavaModule {
  private static ReactApplicationContext reactContext;
  public static BixolonLabelPrinter mBixolonLabelPrinter;

  CoreModule(ReactApplicationContext context) {
    super(context);
    reactContext = context;

    PrintEventHandler printHandler = new PrintEventHandler();
    mBixolonLabelPrinter = new BixolonLabelPrinter(null, printHandler.mHandler, null);
  }

  public String getName() {
    return "CoreModule";
  }

  @ReactMethod
  public void getPrinters() {
    mBixolonLabelPrinter.findBluetoothPrinters();
  }

  @ReactMethod
  public void connectPrinter(String address) {
    connectPrinter(address);
  }

  @ReactMethod
  public void draw1dBarcode() {
    Draw1dBarcodeActivity drawBarcode = new Draw1dBarcodeActivity();
    boolean status = false;

    try {
      drawBarcode.print1dBarcode();
      status = true;
    } catch (Exception error) {
//      Log.i("react-native-xd5-405-label-printer Error", error.toString());
    }


//    Log.i("react-native-xd5-405-label-printer Status", status);

  }
}
