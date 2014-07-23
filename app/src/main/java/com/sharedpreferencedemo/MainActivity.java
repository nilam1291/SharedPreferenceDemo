package com.sharedpreferencedemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText editName = (EditText) findViewById(R.id.activity_main_edit_name);
		final Button btnSubmit = (Button) findViewById(R.id.activity_main_btn_login);
		final SharedPreferences preferences = getSharedPreferences(
				getString(R.string.app_name), Context.MODE_PRIVATE);

		btnSubmit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				final Editor editor = preferences.edit();
				editor.putString("name", editName.getText().toString().trim());
				editor.commit();
				startActivity(new Intent(MainActivity.this,
						SecondActivity.class));
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
