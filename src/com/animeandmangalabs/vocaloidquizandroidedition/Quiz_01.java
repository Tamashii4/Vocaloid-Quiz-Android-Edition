package com.animeandmangalabs.vocaloidquizandroidedition;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class Quiz_01 extends Activity {
	
		//Quiz init[start]
		static Button btn_a;	//Button A and B of the interface
		static Button btn_b;
		static ImageView quiz_img_view;	//ImageView of the interface
		static TextView quiz_question_text;	//TextView's of the interface
		static TextView tCorrect;
		static TextView tIncorrect;
		static int iQnum = 0;
		static int iCorrect = 0;
		static int iIncorrect = 0;
		//Quiz init[end]
	

		public void reset_values(){
			iQnum = 0;
			iCorrect = 0;
			iIncorrect = 0;
			
		}
				
				
			
		
		@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz_01);
		// Show the Up button in the action bar.
		setupActionBar();
		btn_a = (Button) findViewById(R.id.quiz_button_a);
		btn_b = (Button) findViewById(R.id.quiz_button_b);
		quiz_img_view = (ImageView) findViewById(R.id.quiz_image);
		quiz_question_text = (TextView) findViewById(R.id.quiz_question);
		tCorrect = (TextView) findViewById(R.id.tCorrect);
		tIncorrect = (TextView) findViewById(R.id.tIncorrect);
		//Link view items[end]
		reset_values();
		quiz_questions();
		
	}
			
		
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			
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






	public static void Correct(){//When user's correct
	iCorrect = iCorrect +1;
	tCorrect.setText("Correct: " + iCorrect);
	}
	public static void Incorrect(){//When user's incorrect
	iIncorrect = iIncorrect + 1;
	tIncorrect.setText("Incorrect: " + iIncorrect);
	}


	public static void quiz_questions(){

		if(iQnum == 0){//Quiz Question num(1)
		quiz_question_text.setText(R.string.q1_1);
		quiz_img_view.setImageResource(R.drawable.miku_2);
		btn_a.setText("Hatsune Miku");
		btn_b.setText("Kagame Rin");
		
			btn_a.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Correct();
				}
			});
			btn_b.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Incorrect();
				}
			});
		}
	}

	}
	
	
	

	
