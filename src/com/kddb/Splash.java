package com.kddb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class Splash extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.splash);

		Thread timer = new Thread() {
			public void run() {
				try {
					
					sleep(3000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				} finally {
					
					Intent i = new Intent(Splash.this,Main1Activity.class);
					startActivity(i);
				    Splash.this.finish();
				}
			}
		};
		timer.start();
	}
}

