package com.example.android.quiz;

import android.graphics.Color;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton answer_of_question1, answer_of_question2, answer_of_question3, q1_one, q1_two, q1_three;
    CheckBox option1, option2, option3;
    TextView score;
EditText response;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer_of_question1 = (RadioButton) findViewById(R.id.radioButton_one);
        answer_of_question2 = (RadioButton) findViewById(R.id.q2_r4);
        answer_of_question3 = (RadioButton) findViewById(R.id.radio_three);
        RadioButton q1_one = (RadioButton) findViewById(R.id.q1_r2);
        RadioButton q1_two = (RadioButton) findViewById(R.id.q1_r3);
        RadioButton q1_three = (RadioButton) findViewById(R.id.q1_r4);
        option1 = (CheckBox) findViewById(R.id.que4_checkBox);
        option2 = (CheckBox) findViewById(R.id.que4_checkBox1);
        option3 = (CheckBox) findViewById(R.id.que4_checkBox2);
        score = (TextView) findViewById(R.id.score);
        response=(EditText)findViewById(R.id.et);
    }
    public void submitAnswer(View view) {

        int counter = 0;
        boolean status = answer_of_question1.isChecked();
        boolean status2 = answer_of_question2.isChecked();
        boolean status3 = answer_of_question3.isChecked();
        boolean result = option1.isChecked();
        boolean result1 = option2.isChecked();
        boolean result2 = option3.isChecked();
String et_response=response.getText().toString();
        if (result && result1 && result2) {
            counter++;
        }
        if (status) {
            counter++;
        }
        if (status2) {
            counter++;
        }
        if (status3) {
            counter++;
        }
        if(!et_response.matches("")){
            counter++;
        }
        answer_of_question1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect));
        answer_of_question2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect));
        answer_of_question3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect));
        option1.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect));
        option2.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect));
        option3.setBackgroundDrawable(getResources().getDrawable(R.drawable.rect));
        score.setText("Your score is :: " + counter);


    }
}
