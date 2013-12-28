package com.animeandmangalabs.vocaloidquizandroidedition;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.os.Build;
public class Quiz_01 extends Activity {
	
		//Quiz Engine import[start]
		Button btn_a;	//Button A of the interface
		Button btn_b;	//Button B of the interface
		ImageView quiz_img_view;	//ImageView of the interface
		TextView quiz_question_text;	//TextView of the interface
		//Quiz Engine import[end]
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz_01);
		// Show the Up button in the action bar.
		setupActionBar();
		
		//Link view items[start]
		btn_a = (Button) findViewById(R.id.quiz_button_a);
		btn_b = (Button) findViewById(R.id.quiz_button_b);
		quiz_img_view = (ImageView) findViewById(R.id.quiz_image);
		quiz_question_text = (TextView) findViewById(R.id.quiz_question);
		//Link view items[end]
		quiz_engine.quiz_questions(btn_a,btn_b, quiz_img_view, quiz_question_text);
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quiz_01, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
