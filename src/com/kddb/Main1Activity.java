package com.kddb;



import android.app.Activity; 
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent; 
import android.os.Bundle; 
import android.view.Menu;
import android.view.View; 
import android.view.View.OnClickListener;
import android.widget.Button; 


public class Main1Activity extends Activity { 
	Button Bindonesia,Binggris;

	public void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_main1); 
		
		Bindonesia=(Button)findViewById(R.id.button1);
		Binggris=(Button)findViewById(R.id.button2);
		
		Bindonesia.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
					Intent intent = new Intent(Main1Activity.this,Activity2.class);
					startActivity(intent);
			}
		});	
	

		Binggris.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
					Intent intent = new Intent(Main1Activity.this,Activity3.class);
					startActivity(intent);
			}
		});
	}
		
		//Jika Tekan Tombol back
				public void onBackPressed() {
					 exit();//Pergi ke method exit 
				}
				private void exit() {
					AlertDialog.Builder builder = new AlertDialog.Builder(this);
					builder.setMessage("Are You Sure Want to Exit?")
					.setCancelable(false)//tidak bisa tekan tombol back
					//jika pilih yess
					.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							finish();
						}
					})
					//jika pilih no
					.setNegativeButton("No", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.cancel();
						}
					}).show();

		
	}
}