package com.zijunlin.Zxing.Demo;

import android.graphics.Bitmap;
import android.os.Handler;

import com.google.zxing.Result;
import com.zijunlin.Zxing.Demo.decoding.CaptureActivityHandler;
import com.zijunlin.Zxing.Demo.view.ViewfinderView;

public interface CaptureHandlerInterface {
	public void handleDecode(final Result obj, Bitmap barcode);

	public void onResultUrl(String url);

	public void onResultMsg(Object obj);

	public void drawViewfinder();
	public ViewfinderView getViewfinderView();
	public CaptureActivityHandler getHandler();
}
