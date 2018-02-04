package com.example.android.hungarianfunfactsquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    RadioButton question1RadioButton = findViewById(R.id.question_1_answer_b);
    RadioButton question2RadioButton = findViewById(R.id.question_2_answer_c);
    EditText question2EditText = findViewById(R.id.question_3_answer);
    CheckBox question4CheckBoxA =findViewById(R.id.question_4_answer_a);
    CheckBox question4CheckBoxB =findViewById(R.id.question_4_answer_b);
    CheckBox question4CheckBoxC =findViewById(R.id.question_4_answer_c);
    EditText question5EditText = findViewById(R.id.question_5_answer);
    RadioButton question6RadioButton = findViewById(R.id.question_6_answer_b);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalculateScore() {
        // question 1
        if () {
            
        }

    }


    public void ShowResult(View view) {

        CalculateScore();

        // show the score
        Context context = getApplicationContext();
        String message = "You scored " + String.valueOf(score) + "/6";
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        toast.show();

        // reset the score
        score = 0;
    }
}
