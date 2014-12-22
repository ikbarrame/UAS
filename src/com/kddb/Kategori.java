package com.kddb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.os.Bundle;

public class Kategori  extends Activity{
	
	
		ListView list1;
	String[] menu = new String[] { "1. Khutbah Jum'at ",
			"2.  Khutbah Hari Raya",
			"3.  Dakwah Harian",
			"4.  Dakwah Hari Besar Islam"
			};
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategori);
        
        
   	
        list1 = (ListView)findViewById(R.id.listView1);
        list1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu));
        list1.setOnItemClickListener(new OnItemClickListener(){
        	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3){
        		Intent i = null;
        		if (position == 0){
        			i = new Intent(Kategori.this, KhutbahJumat1.class);}
        		else if(position == 1){
        			i = new Intent(Kategori.this, KhutbahHariRayaIndo.class);}
        		else if(position == 2){
        			i = new Intent(Kategori.this, DakwahHarianIndo.class);}
        		else if(position == 3){
        			i = new Intent(Kategori.this, HariBesarIndo.class);}
        		      		
    			else{}
        	
        	startActivity(i);
        	}
        });}
	
	
	
	
	

	public void onBackPressed(){
		finish();
		System.exit(0);
		}
}