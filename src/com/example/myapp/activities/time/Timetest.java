package com.example.myapp.activities.time;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class Timetest extends Activity {

	@Override
	protected void onCreate(Bundle bundle) {
		// TODO Auto-generated method stub
		super.onCreate(bundle);
		LinearLayout view = new LinearLayout(this);
		setContentView(view);
		Button button = new Button(this);
		button.setText("时间控件");
		view.addView(button);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent =new Intent();
				intent.setClass(getApplicationContext(), ChronoDemo.class);
				startActivity(intent);
			}
		});
	}

}
