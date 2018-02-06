package com.example.android.hungarianfunfactsquiz;

import android.content.Context;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void CalculateScore() {

        // get views
        RadioButton question1RadioButton = findViewById(R.id.question_1_answer_a);
        RadioButton question2RadioButton = findViewById(R.id.question_2_answer_c);
        EditText question3EditText = findViewById(R.id.question_3_answer);
        CheckBox question4CheckBoxA =findViewById(R.id.question_4_answer_a);
        CheckBox question4CheckBoxB =findViewById(R.id.question_4_answer_b);
        CheckBox question4CheckBoxC =findViewById(R.id.question_4_answer_c);
        EditText question5EditText = findViewById(R.id.question_5_answer);
        RadioButton question6RadioButton = findViewById(R.id.question_6_answer_b);

        // question 1
        if (question1RadioButton.isChecked()) {
            score += 1;
        }

        // question 2
        if (question2RadioButton.isChecked()) {
            score += 1;
        }

        // question 3
        if (question3EditText.getText().toString().toLowerCase().equals("pannonia")) {
            score += 1;
        }

        // question 4
        if (question4CheckBoxA.isChecked() && question4CheckBoxB.isChecked() && question4CheckBoxC.isChecked()) {
            score += 1;
        }


        // question 5

        // set initial value
        int usersAnswer = 0;
        // get the current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        // calculate the age as of today's date
        int question5Answer = currentYear - 895;

        try {
            // get the answer the user entered and handle any formatting errors
            usersAnswer = Integer.parseInt(question5EditText.getText().toString());
        } catch (NumberFormatException e) {

        }

        if (usersAnswer == question5Answer) {
            score += 1;
        }


        // question 6
        if (question6RadioButton.isChecked()) {
            score += 1;
        }

    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public void ShowResult(View view) {

        CalculateScore();

        // show the score
        Context context = getApplicationContext();
        String message = "You scored " + String.valueOf(score) + "/6";
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.show();

        // reset the score
        score = 0;
    }
}
