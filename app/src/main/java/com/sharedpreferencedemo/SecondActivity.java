package com.sharedpreferencedemo;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		final TextView txtName = (TextView) findViewById(R.id.activity_second_txt_name);
		final SharedPreferences preferences = getSharedPreferences(
				getString(R.string.app_name), Context.MODE_PRIVATE);
		txtName.setText(preferences.getString("name", ""));
	}

}
