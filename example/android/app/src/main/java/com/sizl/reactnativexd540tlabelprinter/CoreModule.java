package com.sizl.reactnativexd540tlabelprinter;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.util.Log;

public class CoreModule extends ReactContextBaseJavaModule {
  CoreModule(ReactApplicationContext context) {
    super(context);
    reactContext = context;
  }

  private static ReactApplicationContext reactContext;
  final BluetoothModule bluetooth = new BluetoothModule(reactContext);

  public String getName() {
    return "CoreModule";
  }

  @ReactMethod
  public void getPrinters() {
    bluetooth.findBluetoothPrinters();
  }

  @ReactMethod
  public void connectPrinter(String address) {
    bluetooth.connectPrinter(address);
  }

  @ReactMethod
  public void draw1dBarcode() {
    boolean status = false;

    try {
      Draw1dBarcodeActivity drawBarcode = new print1dBarcodeDraw1dBarcodeActivity();
      drawBarcode.print1dBarcode(reactContext);
      status = true;
    } catch (Exception error) {
//      Log.i("react-native-xd5-405-label-printer Error", error.toString());
    }


//    Log.i("react-native-xd5-405-label-printer Status", status);

  }
}
