package com.animeandmangalabs.vocaloidquizandroidedition;

import android.content.Context;
import android.content.res.Resources;
import android.provider.ContactsContract.Contacts;
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
			//Quiz Quesitons
			
				
				//static String qsS1,qsS2,qsS3;
				//q1 = "Hello";
				
			
			
			
		
			//Initialization[end]
			
			
			
		public void main(){
		
			//Setting values of the int's[start]
			iQnum = 0;
			iCorrect = 0;
			iIncorrect = 0;
			
			//Setting values of the int's[end]
			
		}
		
	public void Correct(){
		
	}
	public void Incorrect(){
		
	}
	public static void quiz_questions(){
		
			if(iQnum == 0){//Quiz Question num(1)
			//	quiz_question_text.setText(q1);
			}
	}
	
}
