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

public class HariBesarIng extends Activity {
	
	ListView list1;
	String[] menu = new String[] { "1. Isra and Miraj-1",
			"2. Isra and Miraj-2",
			"3. Isra and Miraj-3",			
			"4. The Birth of The Prophet-1",
			"5. The Birth of The Prophet-2",
			"6. The Birth of The Prophet-3",
			"7. The Birth of The Prophet-4",
			"8. The Birth of The Prophet-5",
			
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
 			i = new Intent(HariBesarIng.this, DetailIsraMirajIng1.class);}
 		else if(position == 1){
 			i = new Intent(HariBesarIng.this, DetailIsraMirajIng2.class);}
 		else if(position == 2){
 			i = new Intent(HariBesarIng.this, DetailIsraMirajIng3.class);}
 		else if(position == 3){ 			
 			i = new Intent(HariBesarIng.this, DetailMaulidNabiIng1.class);}
 		else if(position == 4){
 			i = new Intent(HariBesarIng.this, DetailMaulidNabiIng2.class);}
 		else if(position == 5){
 			i = new Intent(HariBesarIng.this, DetailMaulidNabiIng3.class);}
 		else if(position == 6){
 			i = new Intent(HariBesarIng.this, DetailMaulidNabiIng4.class);}
 		else if(position == 7){
 			i = new Intent(HariBesarIng.this, DetailMaulidNabiIng5.class);}
			else{}
 	
 	startActivity(i);
 	}
 });}


public void onBackPressed(){
	finish();
	System.exit(0);
	}

}


