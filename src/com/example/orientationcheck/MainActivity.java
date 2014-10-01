package com.example.orientationcheck;

import android.os.Bundle;
import android.app.Activity;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//For getting Current Screen Orientation 
		Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
	    int orientation = display.getOrientation();
	    
		switch (orientation) 
		
		{
		//Coditions for orientation check 
		case Surface.ROTATION_0:
			Toast.makeText(MainActivity.this,"The screen is in Portrait Mode", Toast.LENGTH_LONG).show();
			break;
		case Surface.ROTATION_90:
			Toast.makeText(MainActivity.this,"The screen is in Landscape Mode", Toast.LENGTH_LONG).show();
			break;
		case Surface.ROTATION_180:
			Toast.makeText(MainActivity.this,"The screen is in Reverse Landscape Mode", Toast.LENGTH_LONG).show();
			break;
		case Surface.ROTATION_270:
			Toast.makeText(MainActivity.this,"The screen is in Reverse Portarit Mode", Toast.LENGTH_LONG).show();
			break;
		default:
			Toast.makeText(MainActivity.this,"The screen is in Portrait Mode", Toast.LENGTH_LONG).show();
			break;
		}
	}



}
