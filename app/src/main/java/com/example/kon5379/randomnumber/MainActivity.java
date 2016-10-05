package com.example.kon5379.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int number;

    public void onGuess(View view) {

        System.out.println(" Random Number " + number);
        EditText inputNumber = (EditText) findViewById(R.id.editText);

        String guessedString = inputNumber.toString();
        int guessedNumber = Integer.parseInt(guessedString);
        String message = "";
        if(guessedNumber > number) {
            message = "guessedNumber is greater";
        } else if(guessedNumber < number) {
            message = "guessedNumber is less";
        } else {
            message = "Bravo, You got it RIGHT!!";
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random randomGenerator = new Random();
        number = randomGenerator.nextInt(20);
    }
}
