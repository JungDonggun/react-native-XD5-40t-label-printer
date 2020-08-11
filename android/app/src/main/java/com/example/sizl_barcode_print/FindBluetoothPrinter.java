package com.example.sizl_barcode_print;

import android.util.Log;

import com.bixolon.commonlib.BXLCommonConst;
import com.bixolon.labelprinter.BixolonLabelPrinter;

public class FindBluetoothPrinter {
    public void findPrinter () {
        MainActivity.mBixolonLabelPrinter.findBluetoothPrinters();
    }

    public void connectPrinter(String address) {
        MainActivity.mBixolonLabelPrinter.connect(address);

        Log.i("JUNGDONGGUN", "Connected@@@@@@@@@@@@@@@");
    }

}
