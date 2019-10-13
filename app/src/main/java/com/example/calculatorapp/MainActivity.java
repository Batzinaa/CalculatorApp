package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private Button buttonNumberOne, buttonNumberTwo, buttonNumberThree, buttonNumberFour, buttonNumberFive, buttonNumberSix, buttonNumberSeven, buttonNumberEight,
            buttonNumberNine, buttonNumberZero, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonBackSpace, buttonClear, buttonPercentage, buttonDot;
   private TextView displayEditText;
   private String resultOnDisplay="0";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiallizeComponents();
        displayEditText.setText(resultOnDisplay);
    }

    public void initiallizeComponents(){
        buttonNumberOne = (Button) findViewById(R.id.one);
        buttonNumberTwo = (Button) findViewById(R.id.two);
        buttonNumberThree = (Button) findViewById(R.id.three);
        buttonNumberFour = (Button) findViewById(R.id.four);
        buttonNumberFive = (Button) findViewById(R.id.five);
        buttonNumberSix = (Button) findViewById(R.id.six);
        buttonNumberSeven = (Button) findViewById(R.id.seven);
        buttonNumberEight = (Button) findViewById(R.id.eight);
        buttonNumberNine = (Button) findViewById(R.id.nine);
        buttonNumberZero = (Button) findViewById(R.id.zero);
        buttonDot = (Button) findViewById(R.id.dot);
        buttonAdd = (Button) findViewById(R.id.add);
        buttonSub = (Button) findViewById(R.id.sub);
        buttonMul = (Button) findViewById(R.id.mul);
        buttonDiv = (Button) findViewById(R.id.div);
        buttonEqual = (Button) findViewById(R.id.equal);
        buttonBackSpace = (Button) findViewById(R.id.backSpace);
        buttonClear = (Button) findViewById(R.id.clear);
        buttonPercentage = (Button) findViewById(R.id.percentage);
        displayEditText = (TextView) findViewById(R.id.displayResult);
    }

    public void updateScreen(){
        displayEditText.setText(resultOnDisplay);
    }
    
    public void onClickNumber(View v){
        Button b = (Button) v;
        if(!displayEditText.getText().toString().equals("0")){
            resultOnDisplay += b.getText();
        }else {
            resultOnDisplay = b.getText().toString();
        }
        updateScreen();
    }

    public void onClickDot(View v){
        Button b = (Button) v;
        if(!resultOnDisplay.endsWith(b.getText().toString())) {
            resultOnDisplay += b.getText();
        }
        updateScreen();
    }

    public void onClickClear(View v){
        Button b = (Button) v;
        resultOnDisplay = "0";
        updateScreen();
    }

    public void onClickBackSpace(View v){
        if(resultOnDisplay.length()>0) {
            String text = displayEditText.getText().toString();
            resultOnDisplay = text.substring(0, text.length() - 1);
            if(resultOnDisplay.length()==0){
                resultOnDisplay = "0";
            }
        }
        updateScreen();
    }

    public void onClickOperator(View v){
        Button operator = (Button) v;
      String cases[] = {"+","-","*","/"};

      if(displayEditText.getText().toString().endsWith(cases[0]) || displayEditText.getText().toString().endsWith(cases[1]) || displayEditText.getText().toString().endsWith(cases[2]) || displayEditText.getText().toString().endsWith(cases[3])){
          resultOnDisplay = resultOnDisplay.substring(0,resultOnDisplay.length()-1) + operator.getText().toString();
      }else {
            resultOnDisplay += operator.getText().toString();
        }
        updateScreen();
    }



    public void onClickEqual(View v){
    Button kapa = (Button) v;

    }
    
    


}
