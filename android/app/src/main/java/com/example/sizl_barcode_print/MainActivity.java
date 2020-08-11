package com.example.sizl_barcode_print;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.bixolon.labelprinter.BixolonLabelPrinter;

public class MainActivity extends AppCompatActivity {
    static BixolonLabelPrinter mBixolonLabelPrinter;
    PrintEventHandler printHandler = new PrintEventHandler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBixolonLabelPrinter = new BixolonLabelPrinter(this, printHandler.mHandler, null);


        final Draw1dBarcodeActivity test = new Draw1dBarcodeActivity();
        final FindBluetoothPrinter bluetooth = new FindBluetoothPrinter();

        bluetooth.findPrinter();

        Button donggunButton = (Button) findViewById(R.id.donggunButton);
        Button bluetoothButton = (Button) findViewById(R.id.donggunBluetooth);

        donggunButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("JUNGDONGGUN", "DONGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
//                test.print1dBarcode();
                boolean isConnected = mBixolonLabelPrinter.isConnected();

                if (isConnected) {
                    Log.i("JUNGDONGGUN", "Device is Connected!");
                    test.print1dBarcode();
                } else {
                    Log.i("JUNGDONGGUN", "Device Connect is failed");
                }

            }
        });

        bluetoothButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                bluetooth.connectPrinter("74:F0:7D:ED:66:95");
            }
        });

    }
}
