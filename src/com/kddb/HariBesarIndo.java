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

public class HariBesarIndo extends Activity {
	
	ListView list1;
	String[] menu = new String[] { "1. Isra dan Miraj-1",
			"2. Isra dan Miraj-2",
			"3. Isra dan Miraj-3",
			"4. Isra dan Miraj-4",
			"5. Isra dan Miraj-5",
			"6. Maulid Nabi-1",
			"7. Maulid Nabi-2",
			"8. Maulid Nabi-3",
			"9. Maulid Nabi-4",
			"10.Maulid Nabi-5",
			
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
 			i = new Intent(HariBesarIndo.this, DetailIsraMirajIndo1.class);}
 		else if(position == 1){
 			i = new Intent(HariBesarIndo.this, DetailIsraMirajIndo2.class);}
 		else if(position == 2){
 			i = new Intent(HariBesarIndo.this, DetailIsraMirajIndo3.class);}
 		else if(position == 3){
 			i = new Intent(HariBesarIndo.this, DetailIsraMirajIndo4.class);}
 		else if(position == 4){
 			i = new Intent(HariBesarIndo.this, DetailIsraMirajIndo5.class);}
 		else if(position == 5){
 			i = new Intent(HariBesarIndo.this, DetailMaulidNabiIndo1.class);}
 		else if(position == 6){
 			i = new Intent(HariBesarIndo.this, DetailMaulidNabiIndo2.class);}
 		else if(position == 7){
 			i = new Intent(HariBesarIndo.this, DetailMaulidNabiIndo3.class);}
 		else if(position == 8){
 			i = new Intent(HariBesarIndo.this, DetailMaulidNabiIndo4.class);}
 		else if(position == 9){
 			i = new Intent(HariBesarIndo.this, DetailMaulidNabiIndo5.class);}
			else{}
 	
 	startActivity(i);
 	}
 });}


public void onBackPressed(){
	finish();
	System.exit(0);
	}

}


