package com.sizl.reactnativexd540tlabelprinter;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.bixolon.labelprinter.BixolonLabelPrinter;

import java.util.Set;

public class PrintEventHandler {
  @Override
  public  Handler mHandler = new Handler() {
    @Override
    public void handleMessage(Message msg) {
      switch (msg.what) {
        case BixolonLabelPrinter.MESSAGE_STATE_CHANGE:
          switch (msg.arg1) {
            case BixolonLabelPrinter.STATE_CONNECTED:
              Log.i("JUNGDONGGUN", "@@@@@@@@STATE_CONNECTED LOG");

//                            setStatus(getString(R.string.title_connected_to, mConnectedDeviceName));
//                            mListView.setEnabled(true);
//                            mIsConnected = true;
//                            invalidateOptionsMenu();
//                            MainActivity.mBixolonLabelPrinter.setOrientation(BixolonLabelPrinter.ORIENTATION_TOP_TO_BOTTOM);
              break;

            case BixolonLabelPrinter.STATE_CONNECTING:
              Log.i("JUNGDONGGUN", "@@@@@@@@STATE_CONNECTING LOG");
//                            setStatus(R.string.title_connecting);
              break;

            case BixolonLabelPrinter.STATE_NONE:
              Log.i("JUNGDONGGUN", "@@@@@@@@STATE_NONE LOG");

//                            setStatus(R.string.title_not_connected);
//                            mListView.setEnabled(false);
//                            mIsConnected = false;
//                            invalidateOptionsMenu();
              break;
          }
          break;

        case BixolonLabelPrinter.MESSAGE_READ:
          Log.i("JUNGDONGGUN", "@@@@@@@@MESSAGE_READ LOG");
//                    MainActivity.this.dispatchMessage(msg);
          break;

        case BixolonLabelPrinter.MESSAGE_DEVICE_NAME:
          Log.i("JUNGDONGGUN", "@@@@@@@@MESSAGE_DEVICE_NAME LOG");

//                    mConnectedDeviceName = msg.getData().getString(BixolonLabelPrinter.DEVICE_NAME);
//                    Toast.makeText(getApplicationContext(), mConnectedDeviceName, Toast.LENGTH_LONG).show();
          break;

        case BixolonLabelPrinter.MESSAGE_TOAST:
          Log.i("JUNGDONGGUN", "@@@@@@@@MESSAGE_TOAST LOG");
//                    mListView.setEnabled(false);
//                    Toast.makeText(getApplicationContext(), msg.getData().getString(BixolonLabelPrinter.TOASwT), Toast.LENGTH_SHORT).show();
          break;

        case BixolonLabelPrinter.MESSAGE_LOG:
          Log.i("JUNGDONGGUN", "@@@@@@@MESSAGE LOG");

//                    Toast.makeText(getApplicationContext(), msg.getData().getString(BixolonLabelPrinter.LOG), Toast.LENGTH_SHORT).show();
          break;

        case BixolonLabelPrinter.MESSAGE_BLUETOOTH_DEVICE_SET:
          if (msg.obj == null) {
            Log.i("JUNGDONGGUN", "No paired device");
          } else {
            Set<BluetoothDevice> devices = (Set<BluetoothDevice>) msg.obj;


            Log.i("JUNGDONGGUN", "LIST@@@@@@@@@@@@@@@@@@@LIST:" + devices);

//            return devices;
          }
          break;

        case BixolonLabelPrinter.MESSAGE_USB_DEVICE_SET:
          if (msg.obj == null) {
            Log.i("JUNGDONGGUN", "@@@@@@@@MESSAGE_USB_DEVICE_SET LOG");
//                        Toast.makeText(getApplicationContext(), "No connected device", Toast.LENGTH_SHORT).show();
          } else {
//                        DialogManager.showUsbDialog(MainActivity.this, (Set<UsbDevice>) msg.obj, mUsbReceiver);
          }
          break;

        case BixolonLabelPrinter.MESSAGE_NETWORK_DEVICE_SET:
          if (msg.obj == null) {
            Log.i("JUNGDONGGUN", "@@@@@@@@MESSAGE_NETWORK_DEVICE_SET LOG");

//                        Toast.makeText(getApplicationContext(), "No connectable device", Toast.LENGTH_SHORT).show();
          }
//                    DialogManager.showNetworkDialog(MainActivity.this, msg.obj.toString());
          break;

      }
    }
  };
}
