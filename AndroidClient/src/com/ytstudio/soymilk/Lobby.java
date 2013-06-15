package com.ytstudio.soymilk;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Lobby extends Activity implements OnClickListener{
	
	Button mButtonSinglePlayer;
	Button mButtonSetting;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		setContentView(R.layout.lobby);
		mButtonSinglePlayer = (Button)findViewById(R.id.button_single_player);
		mButtonSinglePlayer = (Button)findViewById(R.id.button_setting);
		
		mButtonSinglePlayer.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		if (view.getId() == mButtonSinglePlayer.getId())
		{
		}
		else if (view.getId() == mButtonSetting.getId())
		{			
		}
		
	}
}
