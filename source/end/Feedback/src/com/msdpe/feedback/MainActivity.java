package com.msdpe.feedback;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btnSendFeedback = (Button) findViewById(R.id.btnSendFeedback);
		btnSendFeedback.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {				
				//Start the feedback activity
				Intent intent = new Intent(getApplicationContext(), FeedbackActivity.class);		     
		        startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
