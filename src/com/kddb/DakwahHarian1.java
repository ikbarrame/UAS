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

public class DakwahHarian1 extends Activity {
	
	ListView list1;
	String[] menu = new String[] { "1. Sebab-sebab Do'a Tidak Terkabul",
			"2. Birrul Walidain",
			"3. Tahap Pengembangan",
			"4. Tahap Pengembangan",
			"5. Tahap Pengembangan",
			"6. Tahap Pengembangan",
			"7. Tahap Pengembangan",
			"8. Tahap Pengembangan",
			"9. Tahap Pengembangan",
			"10.Tahap Pengembangan",
			
			};
	   
/** Called when the activity is first created. */
    
@Override
    
public void onCreate(Bundle savedInstanceState) {     
 super.onCreate(savedInstanceState);       
 setContentView(R.layout.list_materi);
  showKembali();
 
 list1 = (ListView)findViewById(R.id.listView1);
 list1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu));
 list1.setOnItemClickListener(new OnItemClickListener(){
 	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3){
 		Intent i = null;
 		if (position == 0){
 			i = new Intent(DakwahHarian1.this, DetailDakwahHarianIndo1.class);}
 		else if(position == 1){
 			i = new Intent(DakwahHarian1.this, DetailDakwahHarianIndo2.class);}
 		else if(position == 2){
 			i = new Intent(DakwahHarian1.this, DetailDakwahHarianIndo1.class);}
 		else if(position == 3){
 			i = new Intent(DakwahHarian1.this, DetailDakwahHarianIndo1.class);}
 		else if(position == 4){
 			i = new Intent(DakwahHarian1.this, DetailDakwahHarianIndo1.class);}
 		else if(position == 5){
 			i = new Intent(DakwahHarian1.this, DetailDakwahHarianIndo1.class);}
 		else if(position == 6){
 			i = new Intent(DakwahHarian1.this, DetailDakwahHarianIndo1.class);}
 		else if(position == 7){
 			i = new Intent(DakwahHarian1.this, DetailDakwahHarianIndo1.class);}
 		else if(position == 8){
 			i = new Intent(DakwahHarian1.this, DetailDakwahHarianIndo1.class);}
 		else if(position == 9){
 			i = new Intent(DakwahHarian1.this, DetailDakwahHarianIndo1.class);}
			else{}
 	
 	startActivity(i);
 	}
 });}
private Menu mainMenu;

private void showKembali(){
    Button btnmtb = (Button) findViewById(R.id.button1);
    btnmtb.setOnClickListener(new View.OnClickListener() {
        public void onClick(View arg0) {
        	Intent nextScreen = new Intent(getApplicationContext(), Kategori.class); 
            startActivity(nextScreen);
        }
    });
}

public void onBackPressed(){
	finish();
	System.exit(0);
	}



}


