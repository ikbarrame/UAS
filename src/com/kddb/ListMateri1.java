package com.kddb;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class ListMateri1 extends Activity {
	   /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_materi);
    }
    public void onBackPressed(){
		finish();
		System.exit(0);
		}
}