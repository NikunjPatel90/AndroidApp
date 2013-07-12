package com.example.patelnikunjandroidapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class HomeScreen extends Activity
{
	 private static final int INPUT_REQUEST=0;
	 
	 public void onCreate(Bundle savedInstanceState)
	 {
		
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.homescreen);
		   
		  
		  final Button configuration = (Button)findViewById(R.id.Configbtn);
	//	  configuration.setOnClickListener(new ButtonHandler());
		    
		  configuration.setOnClickListener(new Button.OnClickListener(){
	     public void onClick(View v)
		      {
		    	  try
		    	  {
		    		  
		    		  startActivityForResult(new Intent(v.getContext(), Configuration.class),
		    		  INPUT_REQUEST);
		    		
		    	  } 
		    	  catch (Exception e)
		    	  {
		    		  
		    	  }
		      }
		      

		    });
		
	 }
	
/*	  private static final int INPUT_REQUEST=0;
	
	  public class ButtonHandler implements View.OnClickListener
	  {
		 

		  public void onClick(View v)
		  {
			  handleButtonClick();
		  }
	  }
	  private void handleButtonClick()
	  {
		  startActivityForResult(new Intent(this,Configuration.class), INPUT_REQUEST);
	  }	
		*/
	 public void onActivityResult(int requestCode, int resultCode, Intent data)
	 {
		 
		 super.onActivityResult(requestCode, resultCode, data);
		 
		
		 if(resultCode==Activity.RESULT_CANCELED)
		 {
			 Toast.makeText(this, "activity cancelled", Toast.LENGTH_LONG).show();
		 }
		 else if(resultCode==Activity.RESULT_OK)
		 {
		    //	String input1 = data.getStringExtra("input");
		 		Toast.makeText(this,"settings saved for "+ data.getData().toString(), Toast.LENGTH_SHORT).show();
		 		
		 }
		 
		 		
	 }

}
