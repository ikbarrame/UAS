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

public class DakwahHarianIng extends Activity {
	
	ListView list1;
	String[] menu = new String[] { "1. Youth Generation That Brings Alteration",
			"2. Islamic Brotherhood",
			"3. Virtue Greetings",
			"4. Learning Is Worship",
			"5. I Love Islam Is The Best Choice",
			"6. The Science Is Very Useful",
			
			
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
 			i = new Intent(DakwahHarianIng.this, DetailDakwahHarianIng1.class);}
 		else if(position == 1){
 			i = new Intent(DakwahHarianIng.this, DetailDakwahHarianIng2.class);}
 		else if(position == 2){
 			i = new Intent(DakwahHarianIng.this, DetailDakwahHarianIng3.class);}
 		else if(position == 3){
 			i = new Intent(DakwahHarianIng.this, DetailDakwahHarianIng4.class);}
 		else if(position == 4){
 			i = new Intent(DakwahHarianIng.this, DetailDakwahHarianIng5.class);}
 		else if(position == 5){
 			i = new Intent(DakwahHarianIng.this, DetailDakwahHarianIng6.class);}
 		else if(position == 6){
 			i = new Intent(DakwahHarianIng.this, DetailDakwahHarianIng1.class);}
 		else if(position == 7){
 			i = new Intent(DakwahHarianIng.this, DetailDakwahHarianIng1.class);}
 		else if(position == 8){
 			i = new Intent(DakwahHarianIng.this, DetailDakwahHarianIng1.class);}
 		else if(position == 9){
 			i = new Intent(DakwahHarianIng.this, DetailDakwahHarianIng1.class);}
			else{}
 	
 	startActivity(i);
 	}
 });}


public void onBackPressed(){
	finish();
	System.exit(0);
	}

}


