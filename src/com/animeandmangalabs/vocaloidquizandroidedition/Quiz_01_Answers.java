package com.animeandmangalabs.vocaloidquizandroidedition;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class Quiz_01_Answers {
	
	public static boolean bT1c = false;
	public static boolean bT2c = false;
	
	public static void Question(Button btn_a,Button btn_b,int iQnum){
		if (iQnum == 0){
			Quiz_01.quiz_question_text.setText(R.string.q1_1);
			Quiz_01.quiz_img_view.setImageResource(R.drawable.miku_2);
			btn_a.setText("Hatsune Miku");
			btn_b.setText("Kagame Rin");
			
	}else if(iQnum == 1){
		Quiz_01.quiz_question_text.setText(R.string.q1_2);
		Quiz_01.quiz_img_view.setImageResource(R.drawable.kagames);
		btn_a.setText("Yagami");
		btn_b.setText("Kagame");
	}else if (iQnum == 2){
		Quiz_01.V2b.setVisibility(View.GONE);
		Quiz_01.V2t.setVisibility(View.VISIBLE);
		Quiz_01.quiz_text_input_1.setFocusableInTouchMode(true);
		Quiz_01.quiz_text_input_2.setFocusableInTouchMode(true);
		Quiz_01.quiz_text_input_1.setFocusable(true);
		Quiz_01.quiz_text_input_2.setFocusable(true);
		Quiz_01.quiz_question_text.setText(R.string.q1_3);
		
		}
	
}
	
	public static void Compare(Button btn_a,Button btn_b,int iQnum,EditText quiz_text_input_1,EditText quiz_text_input_2){
//-----------------------------QUESTION 1-------------------------------------------------		
		if (iQnum == 0){
			if(btn_a.isPressed()){
				Quiz_01.Correct();
			}else if (btn_b.isPressed()){
				Quiz_01.Incorrect();
				
			}
		
			
//-----------------------------QUESTION 2-------------------------------------------------	
		}else if(iQnum == 1){
				if(btn_a.isPressed()){
				Quiz_01.Incorrect();
			}else if(btn_b.isPressed()){
				Quiz_01.Correct();
			}
		
		
//-----------------------------QUESTION 3-------------------------------------------------
		}else if (iQnum == 3){
			
			//Text input 1
			if(quiz_text_input_1.equals("kagame rin")){
				bT1c = true;
			}else if(quiz_text_input_1.equals("Kagame rin")){
				bT1c = true;
			}else if(quiz_text_input_1.equals("kagame Rin")){
				bT1c = true;
			}else if(quiz_text_input_1.equals("Kagame Rin")){
				bT1c = true;
			}else if(quiz_text_input_1.equals("rin kagame")){
				bT1c = true;
			}else if(quiz_text_input_1.equals("Rin kagame")){
				bT1c = true;
			}else if(quiz_text_input_1.equals("rin Kagame")){
				bT1c = true;
			}else if(quiz_text_input_1.equals("Rin Kagame")){
				bT1c = true;
			}else if(quiz_text_input_1.equals("rin")){
				bT1c = true;
			}else if(quiz_text_input_1.equals("Rin")){
				bT1c = true;
			}else{
				bT1c = false;
			}
			//Text input 2
			if(quiz_text_input_2.equals("kagame len")){
				bT2c = true;
			}else if(quiz_text_input_2.equals("Kagame len")){
				bT2c = true;
			}else if(quiz_text_input_2.equals("kagame Len")){
				bT2c = true;
			}else if(quiz_text_input_2.equals("Kageme Len")){
				bT2c = true;
			}else if(quiz_text_input_2.equals("len kagame")){
				bT2c = true;
			}else if(quiz_text_input_2.equals("Len kagame")){
				bT2c = true;
			}else if(quiz_text_input_2.equals("len Kagame")){
				bT2c = true;
			}else if(quiz_text_input_2.equals("Len Kagame")){
				bT2c = true;
			}else if(quiz_text_input_2.equals("len")){
				bT2c = true;
			}else if(quiz_text_input_2.equals("Len")){
				bT2c = true;
			}else{
				bT2c = false;
			}
			if(bT1c == true && bT2c == true){
				Quiz_01.Correct();
			}else{
				Quiz_01.Incorrect();
			}
			}
	
	
	
	}
}
