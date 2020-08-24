package com.reactlibrarynativeprint;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.ReactInstanceManager;

import android.os.Handler;
import android.os.Message;
import android.os.Looper;

import com.bixolon.labelprinter.BixolonLabelPrinter;

public class RNReactNativeXd5_40tPrinterModule extends ReactContextBaseJavaModule {
    private ReactApplicationContext reactContext;
    private BixolonLabelPrinter mBixolonLabelPrinter;

    /*public Handler mHandler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message message) {
            // This is where you do your work in the UI thread.
            // Your worker tells you in the message what to do.
        }
    };*/


    public RNReactNativeXd5_40tPrinterModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;

        thread.start();
    };

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            Looper.prepare();
            mBixolonLabelPrinter = new BixolonLabelPrinter(null, null, null);
        }
    });


    @Override
    public String getName() {
        return "RNReactNativeXd5_40tPrinter";
    };

    @ReactMethod
    public synchronized void findBluetoothPrinters() {
        mBixolonLabelPrinter.findBluetoothPrinters();
    };

    @ReactMethod
    public synchronized void connectPrinter(String address) {
        mBixolonLabelPrinter.connect(address);
    };

//  @ReactMethod
//  public void draw1dBarcode() {
//    Draw1dBarcodeActivity drawBarcode = new Draw1dBarcodeActivity();
//    boolean status = false;
//
//    try {
//      drawBarcode.print1dBarcode();
//      status = true;
//    } catch (Exception error) {
//      Log.i("react-native-xd5-405-label-printer Error", error.toString());
//    }
//
//
//    Log.i("react-native-xd5-405-label-printer Status", status);
//
//  }
}
