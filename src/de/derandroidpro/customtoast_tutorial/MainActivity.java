package de.derandroidpro.customtoast_tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	public Button btn1;
	public Toast toast1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.button1: {
			
			LayoutInflater toastinflater;
			toastinflater = getLayoutInflater();
			
			View toastview;
			toastview = toastinflater.inflate(R.layout.toastlayout, null);
			
		toast1 = 	Toast.makeText(getApplicationContext(), "Dies ist ein Toast!", Toast.LENGTH_LONG);
		toast1.setGravity(Gravity.CENTER, 100, -300);
		toast1.setView(toastview);
		toast1.show();
			
			break;
		}
		
		
		
		
		}
		
	}


}
