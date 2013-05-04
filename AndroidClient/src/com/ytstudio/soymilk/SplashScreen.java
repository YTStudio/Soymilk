package com.ytstudio.soymilk;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Window;

public class SplashScreen extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Set content
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		setContentView(R.layout.splash_screen);
		
		new InitializeAsyncTask().execute();
	}
	
	private class InitializeAsyncTask extends AsyncTask<Void, Void, Boolean> {

		@Override
		protected Boolean doInBackground(Void... params) {
			return NativeInitialize();
		}
		
		@Override
		protected void onPostExecute(Boolean success) {
			
		}
	}
	
	/*
	 * Native methods.
	 */
	
	public static native boolean NativeInitialize();
	
	static {
		System.loadLibrary("soymilk");
	}
}
