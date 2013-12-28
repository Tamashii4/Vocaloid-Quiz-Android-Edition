package com.animeandmangalabs.vocaloidquizandroidedition;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class quiz_engine {
	
			//Initialization[start]
			public static int iQnum,iCorrect,iIncorrect;
	
			//static Context context;
			//static Resources res = context.getResources();
			//public static String[] questions_1 = res.getStringArray(R.array.Quiz_Questions_1);
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
	public static void quiz_questions(Button btn_a,Button btn_b,ImageView quiz_img_view,TextView quiz_question_text){
		
			if(iQnum == 0){//Quiz Question num(1)
				quiz_question_text.setText("HEY");
			}
	}
	
}
