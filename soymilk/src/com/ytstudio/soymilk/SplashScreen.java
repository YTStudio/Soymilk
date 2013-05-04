package com.ytstudio.soymilk;

import android.app.Activity;
import android.os.Bundle;

public class SplashScreen extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		NativeInitialize();
	}
	
	@Override
	protected void onStart() {
		super.onStart();
	}
	
	public static native void NativeInitialize();
	
	static {
		System.loadLibrary("soymilk");
	}

}
