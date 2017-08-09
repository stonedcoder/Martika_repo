package com.example.andriod.quizapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import static android.R.attr.checked;
import static android.R.attr.displayOptions;
import static android.R.attr.radioButtonStyle;
import static android.os.Build.VERSION_CODES.M;
import static com.example.andriod.quizapp.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    // Declare your variables here too .


    int Score =0;
    int finalScore = 0;
    String Question1RadioButton;

//Radio group and radioButtons for Question #1.


    private RadioButton Q1A1;
    private RadioButton Q1A2;
    private RadioButton Q1A3;
    private RadioButton Q1A4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void Question1RadioButton() {


        Q1A1 = (RadioButton) findViewById(R.id.Q1A1);
        Q1A2 = (RadioButton) findViewById(R.id.Q1A2);
        Q1A3 = (RadioButton) findViewById(R.id.Q1A3);
        Q1A4 = (RadioButton) findViewById(R.id.Q1A4);

        boolean Q1A1Checked = Q1A1.isChecked();
        boolean Q1A2Checked = Q1A2.isChecked();
        boolean Q1A3Checked = Q1A3.isChecked();
        boolean Q1A4Checked = Q1A4.isChecked();


        if (Q1A3Checked)
            Score += + 25;

        else if (Q1A1Checked || Q1A2Checked || Q1A4Checked) {
            Score = Score - 1;

            displayQuestion1(Score);
        }

    }


    public void Question1RadioButton() {


        Q1A1 = (RadioButton) findViewById(R.id.Q1A1);
        Q1A2 = (RadioButton) findViewById(R.id.Q1A2);
        Q1A3 = (RadioButton) findViewById(R.id.Q1A3);
        Q1A4 = (RadioButton) findViewById(R.id.Q1A4);

        boolean Q1A1Checked = Q1A1.isChecked();
        boolean Q1A2Checked = Q1A2.isChecked();
        boolean Q1A3Checked = Q1A3.isChecked();
        boolean Q1A4Checked = Q1A4.isChecked();


        if (Q1A3Checked)
            Score += + 25;

        else if (Q1A1Checked || Q1A2Checked || Q1A4Checked) {
            Score = Score - 1;

            displayQuestion1(Score);
        }

    }
    private int displayQuestion1(int Score) {
        TextView ScoreTextView = (TextView) findViewById(R.id.Score_text_view);
        ScoreTextView.setText("" + Score);
        return Score;
    }




public void buttonOnClick (View v) {

    // Here you'll be going to declare some methods .

        
//
//    //submits score when button is clicked.
//    Button scoreTextButton = (Button) findViewById(R.id.Score_button_view);
//    ((Button) v).setText("Clicked");

}


}