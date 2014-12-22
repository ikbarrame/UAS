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

public class KhutbahJumat1 extends Activity {
	
	ListView list1;
	String[] menu = new String[] { "1. 6 Prinsip Penting Islami",
			"2. Shalat",
			"3. Meneladani Kisah Rasulullah SAW",
			"4. Buah Kesabaran",
			"5. Menggapai Keberkahan Hidup",
			"6. Menyambut Awal Syawal",
			"7. Manisnya Iman",
			"8. Sudah Terujikah Iman Kita",
			"9. Jihad Di Jalan Allah",
			"10.Kalian Adalah Umat Yang Terbaik",
			
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
 			i = new Intent(KhutbahJumat1.this, DetailKhutbahJumatIndo1.class);}
 		else if(position == 1){
 			i = new Intent(KhutbahJumat1.this, DetailKhutbahJumatIndo2.class);}
 		else if(position == 2){
 			i = new Intent(KhutbahJumat1.this, DetailKhutbahJumatIndo3.class);}
 		else if(position == 3){
 			i = new Intent(KhutbahJumat1.this, DetailKhutbahJumatIndo4.class);}
 		else if(position == 4){
 			i = new Intent(KhutbahJumat1.this, DetailKhutbahJumatIndo5.class);}
 		else if(position == 5){
 			i = new Intent(KhutbahJumat1.this, DetailKhutbahJumatIndo6.class);}
 		else if(position == 6){
 			i = new Intent(KhutbahJumat1.this, DetailKhutbahJumatIndo7.class);}
 		else if(position == 7){
 			i = new Intent(KhutbahJumat1.this, DetailKhutbahJumatIndo8.class);}
 		else if(position == 8){
 			i = new Intent(KhutbahJumat1.this, DetailKhutbahJumatIndo9.class);}
 		else if(position == 9){
 			i = new Intent(KhutbahJumat1.this, DetailKhutbahJumatIndo10.class);}
			else{}
 	
 	startActivity(i);
 	}
 });}


public void onBackPressed(){
	finish();
	System.exit(0);
	}

}


