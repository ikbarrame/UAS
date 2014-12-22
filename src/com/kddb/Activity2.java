package com.kddb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Activity2 extends Activity {
Button Bkategori,Btentang;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_main2);
		
		
		
		Bkategori=(Button)findViewById(R.id.button2);
		Btentang=(Button)findViewById(R.id.button3);
	
		
		
		Bkategori.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
					Intent intent = new Intent(Activity2.this,Kategori.class);
					startActivity(intent);
			}
		});	
		
		Btentang.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
					Intent intent = new Intent(Activity2.this,Tentang.class);
					startActivity(intent);
			}
		});	
		
	}
}