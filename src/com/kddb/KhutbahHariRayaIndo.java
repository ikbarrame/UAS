package com.kddb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class KhutbahHariRayaIndo extends Activity {
	
	ListView list1;
	String[] menu = new String[] { "1. Idul Adha-1",
			"2. Idul Adha-2",
			"3. Idul Adha-3",
			"4. Idul Adha-4",
			"5. Idul Adha-5",
			"6. Idul Fitri-1",
			"7. Idul Fitri-2",
			"8. Idul Fitri-3",
			"9. Idul Fitri-4",
			
			
			};
	   
/** Called when the activity is first created. */
    
@Override
    
public void onCreate(Bundle savedInstanceState) {     
 super.onCreate(savedInstanceState);       
 setContentView(R.layout.list_materi);
  
 
 list1 = (ListView)findViewById(R.id.listView1);
 list1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu));
 list1.setOnItemClickListener(new OnItemClickListener(){
 	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3){
 		Intent i = null;
 		if (position == 0){
 			i = new Intent(KhutbahHariRayaIndo.this, DetailKhutbahIdulAdhaIndo1.class);}
 		else if(position == 1){
 			i = new Intent(KhutbahHariRayaIndo.this, DetailKhutbahIdulAdhaIndo2.class);}
 		else if(position == 2){
 			i = new Intent(KhutbahHariRayaIndo.this, DetailKhutbahIdulAdhaIndo3.class);}
 		else if(position == 3){
 			i = new Intent(KhutbahHariRayaIndo.this, DetailKhutbahIdulAdhaIndo4.class);}
 		else if(position == 4){
 			i = new Intent(KhutbahHariRayaIndo.this, DetailKhutbahIdulAdhaIndo5.class);}
 		else if(position == 5){
 			i = new Intent(KhutbahHariRayaIndo.this, DetailKhutbahIdulFitriIndo1.class);}
 		else if(position == 6){
 			i = new Intent(KhutbahHariRayaIndo.this, DetailKhutbahIdulFitriIndo2.class);}
 		else if(position == 7){
 			i = new Intent(KhutbahHariRayaIndo.this, DetailKhutbahIdulFitriIndo3.class);}
 		else if(position == 8){
 			i = new Intent(KhutbahHariRayaIndo.this, DetailKhutbahIdulFitriIndo4.class);}
 		else if(position == 9){
 			i = new Intent(KhutbahHariRayaIndo.this, DetailKhutbahIdulFitriIndo1.class);}
			else{}
 	
 	startActivity(i);
 	}
 });}


public void onBackPressed(){
	finish();
	System.exit(0);
	}

}


