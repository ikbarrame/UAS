package com.kddb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity3 extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_main3);
		showCategory();		
		showAbout();
				
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.button2){
			Intent i = new Intent(this, Main1Activity.class );
			startActivity(i);
		}
	}
	private Menu mainMenu;
	
		
	private void showCategory(){
        Button btnmtb = (Button) findViewById(R.id.button2);
        btnmtb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
            	Intent nextScreen = new Intent(getApplicationContext(), Category.class); 
                startActivity(nextScreen);
            }
        });
	}
	
	private void showAbout(){
        Button btnmtb = (Button) findViewById(R.id.button3);
        btnmtb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
            	Intent nextScreen = new Intent(getApplicationContext(), About.class); 
                startActivity(nextScreen);
            }
        });
	}
	
	private void exit(){
		 Intent startMain = new Intent(Intent.ACTION_MAIN); 
		 startMain.addCategory(Intent.CATEGORY_HOME); 
		 startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
		 startActivity(startMain); 
		 finish(); 
	}
	public void onBackPressed(){
		finish();
		System.exit(0);
		}
	
	

}
	
	



