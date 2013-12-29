package com.animeandmangalabs.vocaloidquizandroidedition;

import java.util.Locale;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class Quiz_01_Answers {
	
	public static boolean bT1c = false;
	public static boolean bT2c = false;
	public static String s1up;
	public static String s2up;
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
		Quiz_01.quiz_text_input_1.setFocusableInTouchMode(true);
		Quiz_01.quiz_text_input_1.setVisibility(View.VISIBLE);
		Quiz_01.quiz_text_input_2.setVisibility(View.VISIBLE);
		Quiz_01.btn_submit.setVisibility(View.VISIBLE);
		}
	}
	
	

	
	
	@SuppressLint("DefaultLocale")
	public static void Compare(Button btn_a,Button btn_b,Button btn_submit,int iQnum,EditText quiz_text_input_1,EditText quiz_text_input_2){
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
		}else if (iQnum == 2){
			
			if(btn_submit.isPressed()){
					// TODO Auto-generated method stub
					s1up = Quiz_01.quiz_text_input_1.getText().toString();
					s2up = Quiz_01.quiz_text_input_2.getText().toString();
					if(s1up.toUpperCase() == "KAGAME RIN"){
						bT1c = true;
					}else if(s1up.toUpperCase() == "RIN KAGAME"){
						bT1c = true;
					}else if(s1up.toUpperCase() == "RIN"){
						bT1c = true;
					}else{
						bT1c = false;
					}
					
					if(s2up.toUpperCase() == "KAGAME LEN"){
						bT2c = true;
					}else if(s2up.toUpperCase() == "LEN KAGAME"){
						bT2c = true;
					}else if(s2up.toUpperCase() == "LEN"){
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
	}
		
