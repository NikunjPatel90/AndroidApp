package com.example.patelnikunjandroidapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Configuration extends Activity {
	
	private class ButtonHandler implements View.OnClickListener
	{
		public void onClick(View v)
		{
			handleButtonClick();
		}
	}
	private void handleButtonClick()
	{
		Intent data= new Intent();
	
		 EditText email = (EditText)findViewById(R.id.EmailEditTxt);
		 data.setData(Uri.parse(email.getText().toString()));
	//	data.putExtra("input", email.getText().toString());

		setResult(Activity.RESULT_OK, data);
		finish();
	}      
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.configuration);
		final Button savesettings = (Button)findViewById(R.id.SaveSettingsbtn);
		savesettings.setOnClickListener(new ButtonHandler());
	}
	
/*	private class ButtonHandler implements View.OnClickListener
	{
		public void onClick(View v)
		{
			handleButtonClick();
		}
	}
	private void handleButtonClick()
	{
		Intent data= new Intent();
	
		final EditText email = (EditText)findViewById(R.id.EmailEditTxt);
		data.putExtra("input", email.getText().toString());
		setResult(Activity.RESULT_OK, data);
		finish();
	}  
*/
}