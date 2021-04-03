package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonZero;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonPoint;
    private Button buttonDivision;
    private Button buttonEquals;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiplication;
    private Button buttonDel;

    int firstArg = 0;
    int secondArg = 0;
    int operationResult;
    char operationSign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        argBehaviour();
        operationBehaviour();
        countValue();

        buttonDel.setOnClickListener(v -> {
            operationSign = 0;
            firstArg = 0;
            secondArg = 0;
            operationResult = 0;
            textView.setText("0");
        });


    }

    private void findViews() {
        textView = findViewById(R.id.textView);
        buttonZero = findViewById(R.id.button_0);
        buttonOne = findViewById(R.id.button_1);
        buttonTwo = findViewById(R.id.button_2);
        buttonThree = findViewById(R.id.button_3);
        buttonFour = findViewById(R.id.button_4);
        buttonFive = findViewById(R.id.button_5);
        buttonSix = findViewById(R.id.button_6);
        buttonSeven = findViewById(R.id.button_7);
        buttonEight = findViewById(R.id.button_8);
        buttonNine = findViewById(R.id.button_9);
        buttonPoint = findViewById(R.id.button_point);
        buttonDivision = findViewById(R.id.button_division);
        buttonEquals = findViewById(R.id.button_equals);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMinus = findViewById(R.id.button_minus);
        buttonMultiplication = findViewById(R.id.button_multiplication);
        buttonDel = findViewById(R.id.button_del);

    }

    private void argBehaviour() {

        buttonZero.setOnClickListener(v -> {
            choiceArg(0);

            textView.setText("0");
        });

        buttonOne.setOnClickListener(v -> {
            choiceArg(1);

            textView.setText("1");
        });

        buttonTwo.setOnClickListener(v -> {
            choiceArg(2);
            textView.setText("2");
        });

        buttonThree.setOnClickListener(v -> {
            choiceArg(3);
            textView.setText("3");
        });

        buttonFour.setOnClickListener(v -> {
            choiceArg(4);
            textView.setText("4");
        });

        buttonFive.setOnClickListener(v -> {
            choiceArg(5);
            textView.setText("5");
        });

        buttonSix.setOnClickListener(v -> {
            choiceArg(6);
            textView.setText("6");
        });

        buttonSeven.setOnClickListener(v -> {
            choiceArg(7);
            textView.setText("7");
        });

        buttonEight.setOnClickListener(v -> {
            choiceArg(8);
            textView.setText("8");
        });

        buttonNine.setOnClickListener(v -> {
            choiceArg(9);
            textView.setText("9");
        });

    }

    private void choiceArg(int numberButton) {
        if (firstArg == 0) firstArg = numberButton;
        else secondArg = numberButton;
    }


    private void operationBehaviour() {

        buttonPlus.setOnClickListener(v -> {
            operationSign = '+';
            textView.setText("+");
        });

        buttonMinus.setOnClickListener(v -> {
            operationSign = '-';
            textView.setText("-");
        });

        buttonMultiplication.setOnClickListener(v -> {
            operationSign = '*';
            textView.setText("*");
        });

        buttonMultiplication.setOnClickListener(v -> {
            operationSign = '*';
            textView.setText("*");
        });

        buttonDivision.setOnClickListener(v -> {
            operationSign = '/';
            textView.setText("/");
        });

    }


    private void countValue() {

        buttonEquals.setOnClickListener(v -> {

            if (operationSign == '+') operationResult = firstArg + secondArg;
            if (operationSign == '-') operationResult = firstArg - secondArg;
            if (operationSign == '*') operationResult = firstArg * secondArg;
            if (operationSign == '/') {
                if (secondArg == 0) operationResult = 0;
                else operationResult = firstArg / secondArg;
            }

            textView.setText(Integer.toString(operationResult));

        });

    }


}