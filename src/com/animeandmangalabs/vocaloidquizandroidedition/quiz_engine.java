package com.animeandmangalabs.vocaloidquizandroidedition;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class quiz_engine {
	
			//Initialization[start]
			public static int iQnum,iCorrect,iIncorrect;
			static Button btn_a = Quiz_01.btn_a;
			static Button btn_b = Quiz_01.btn_b;
			static TextView quiz_question_text = Quiz_01.quiz_question_text;
			static TextView tCorrect = Quiz_01.tCorrect;
			static TextView tIncorrect = Quiz_01.tIncorrect;
			static ImageView quiz_img_view = Quiz_01.quiz_img_view;
			
			//Initialization[end]
			
			
			
		public static void main(){
		
			//Setting values of the int's[start]
			iQnum = 0;
			iCorrect = 0;
			iIncorrect = 0;
			//Setting values of the int's[end]
			tCorrect.setText("Correct: " + iCorrect);
			tIncorrect.setText("Incorrect: " + iIncorrect);
			btn_a.setText("A");
			btn_b.setText("B");
			quiz_questions();
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
