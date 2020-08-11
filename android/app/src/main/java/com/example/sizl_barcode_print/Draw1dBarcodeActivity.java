package com.example.sizl_barcode_print;


import android.util.Log;

import com.bixolon.labelprinter.BixolonLabelPrinter;

public class Draw1dBarcodeActivity {

	private int mBarcodeSelection = BixolonLabelPrinter.BARCODE_CODE128;
	private int mHri = BixolonLabelPrinter.HRI_NOT_PRINTED;

	public void print1dBarcode() {
		String data = "SIZL_DK_TEST";
		int horizontalPosition = 300;
		int verticalPosition = 100;
		int narrowBarWidth = 2;
		int wideBarWidth = 6;
		int height = 100;
		int rotation = BixolonLabelPrinter.ROTATION_NONE;
		int quietZoneWidth = 0;

//        MainActivity.mBixolonLabelPrinter.drawText("75-C51", 50, 1200, BixolonLabelPrinter.FONT_SIZE_24, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, true, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("구리시", 35, 900, BixolonLabelPrinter.FONT_SIZE_KOREAN6, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("인창동", 85, 900, BixolonLabelPrinter.FONT_SIZE_KOREAN6, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//ㅇ
//        MainActivity.mBixolonLabelPrinter.drawText("운송장번호 1026-1287-1927", 160, 1250, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("접수일자   2017/12/31", 190, 1250, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.draw1dBarcode("123456789012", 160, 900, BixolonLabelPrinter.BARCODE_CODE128, 2, 10, 60, BixolonLabelPrinter.ROTATION_270_DEGREES, BixolonLabelPrinter.HRI_NOT_PRINTED, 0);
//
//        MainActivity.mBixolonLabelPrinter.drawText("홍길동                          010-1234-5678", 230, 1200, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("경기 구리시 인창동 3912번지 삼성동해물과백두산", 260, 1200, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("아파트 204 / 702호", 290, 1200, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("나이키 스포츠                     02-468-4317", 330, 1200, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("서울시 종로구 연지동 361-6번지 나이키몰 2층", 360, 1200, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("신용", 410, 1200, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, true, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("에어맥스 GX-100", 440, 1200, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, true, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//
//        MainActivity.mBixolonLabelPrinter.drawText("31-C1", 30, 600, BixolonLabelPrinter.FONT_SIZE_24, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, true, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("구리시", 80, 600, BixolonLabelPrinter.FONT_SIZE_KOREAN6, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("인창동", 120, 600, BixolonLabelPrinter.FONT_SIZE_KOREAN6, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//
//        MainActivity.mBixolonLabelPrinter.drawText("홍길동", 300, 600, BixolonLabelPrinter.FONT_SIZE_KOREAN1, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("010-1234-5678", 330, 550, BixolonLabelPrinter.FONT_SIZE_KOREAN1, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//
//        MainActivity.mBixolonLabelPrinter.drawText("인창동 3912번지 삼성동", 400, 600, BixolonLabelPrinter.FONT_SIZE_KOREAN1, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("해물과백두산아파트 204", 430, 600, BixolonLabelPrinter.FONT_SIZE_KOREAN1, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("702호", 460, 600, BixolonLabelPrinter.FONT_SIZE_KOREAN1, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//
//        MainActivity.mBixolonLabelPrinter.drawText("운송장번호 1026-1287-1927", 50, 400, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("접수일자 2017/12/31", 80, 400, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//
//        MainActivity.mBixolonLabelPrinter.drawText("홍길동 010-1234-5678", 130, 350, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("인창동 3912번지 삼성동", 160, 400, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("해물과백두산아파트 204/702호", 190, 400, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//
//        MainActivity.mBixolonLabelPrinter.drawText("나이키 스포츠", 220, 350, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("02-648-4317", 250, 300, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//        MainActivity.mBixolonLabelPrinter.drawText("에어맥스 GX-100", 280, 380, BixolonLabelPrinter.FONT_SIZE_KOREAN2, 1, 1, 0, BixolonLabelPrinter.ROTATION_270_DEGREES, false, false, BixolonLabelPrinter.TEXT_ALIGNMENT_NONE);
//
//        MainActivity.mBixolonLabelPrinter.drawQrCode("www.bixolon.com", 350, 400, BixolonLabelPrinter.QR_CODE_MODEL2, BixolonLabelPrinter.ECC_LEVEL_15, 4, BixolonLabelPrinter.ROTATION_270_DEGREES);


		MainActivity.mBixolonLabelPrinter.draw1dBarcode(data, horizontalPosition, verticalPosition, mBarcodeSelection, narrowBarWidth, wideBarWidth, height, rotation, mHri, quietZoneWidth);
		MainActivity.mBixolonLabelPrinter.print(1, 1);
		Log.i("JUNGDONGGUN", "PRINTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
	}
}

