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

public class DakwahHarianIndo extends Activity {
	
	ListView list1;
	String[] menu = new String[] { "1. Sebab-sebab Do'a Tidak Terkabul",
			"2. Birrul Walidain (Berbakti Kepada Orang Tua)",
			"3. Orang Yang Paling Dekat Dengan Nabi SAW di Hari Kiamat ",
			"4. Kebersihan Dan Hadas",
			"5. Etika Terhadap Diri Sendiri",
			"6. Tingkatan Iman",
			"7. Jujur",
			"8. Mensyukuri Nikmat Allah ",
			"9. Titik Kelemahan Umat Muslim Indonesia",
			"10.Pacaran Dalam Pandagnan Islam",
			
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
 			i = new Intent(DakwahHarianIndo.this, DetailDakwahHarianIndo1.class);}
 		else if(position == 1){
 			i = new Intent(DakwahHarianIndo.this, DetailDakwahHarianIndo2.class);}
 		else if(position == 2){
 			i = new Intent(DakwahHarianIndo.this, DetailDakwahHarianIndo3.class);}
 		else if(position == 3){
 			i = new Intent(DakwahHarianIndo.this, DetailDakwahHarianIndo4.class);}
 		else if(position == 4){
 			i = new Intent(DakwahHarianIndo.this, DetailDakwahHarianIndo5.class);}
 		else if(position == 5){
 			i = new Intent(DakwahHarianIndo.this, DetailDakwahHarianIndo6.class);}
 		else if(position == 6){
 			i = new Intent(DakwahHarianIndo.this, DetailDakwahHarianIndo7.class);}
 		else if(position == 7){
 			i = new Intent(DakwahHarianIndo.this, DetailDakwahHarianIndo8.class);}
 		else if(position == 8){
 			i = new Intent(DakwahHarianIndo.this, DetailDakwahHarianIndo9.class);}
 		else if(position == 9){
 			i = new Intent(DakwahHarianIndo.this, DetailDakwahHarianIndo10.class);}
			else{}
 	
 	startActivity(i);
 	}
 });}


public void onBackPressed(){
	finish();
	System.exit(0);
	}



}


