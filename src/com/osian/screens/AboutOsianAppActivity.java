package com.osian.screens;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.osian.main.R;

public class AboutOsianAppActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_osian_app);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}
}
