package com.example.angel.calculatortranslator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SpanishTranslate extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish_translate);

        Bundle number = getIntent().getExtras();
        String numbertwo = number.getString("theNumber");

        int numberInNumberForm = Integer.parseInt(numbertwo);


        String showTranslatedNumber = getNumberInStringForm(numberInNumberForm);


        final TextView showNum = (TextView) findViewById(R.id.showNumber);
        showNum.setText(showTranslatedNumber);
    }

    public static String getNumberInStringForm(int userNumber)
    {
        String translatedNumber = "";

        if(userNumber >= 1000)
        {
            int firstDigit = (userNumber / 1000);
            translatedNumber = firstNumber(firstDigit);
            userNumber = userNumber % 1000;
        }

        if(userNumber >= 100)
        {
            int secondDigit = (userNumber / 100);
            translatedNumber = translatedNumber + " " + secondNumber(secondDigit);
            userNumber = userNumber % 100;
        }

        if(userNumber >= 30)
        {
            int thirdDigit = (userNumber / 10);
            translatedNumber = translatedNumber + " " + thirdNumber(thirdDigit);
            userNumber = userNumber % 10;
        }

        if(userNumber >= 20)
        {
            int optionalThird = userNumber;
            translatedNumber = translatedNumber + " " + twenty(optionalThird);
            userNumber = userNumber - userNumber;
        }

        if(userNumber >= 10)
        {
            int optionalFourth = userNumber;
            translatedNumber = translatedNumber + " " + tens(optionalFourth);
            userNumber = userNumber - userNumber;
        }

        if(userNumber > 0)
        {
            translatedNumber = translatedNumber + " y " + fourthNumber(userNumber);
        }

        return translatedNumber;
    }

    public static String firstNumber(int digit)
    {
        if(digit == 1)
        {
            return "mil";
        }
        else if(digit == 2)
        {
            return "dos mil";
        }
        else if(digit == 3)
        {
            return "tres mil";
        }
        else if(digit == 4)
        {
            return "quatro mil";
        }
        else if(digit == 5)
        {
            return "cinco mil";
        }
        else if(digit == 6)
        {
            return "seis mil";
        }
        else if(digit == 7)
        {
            return "Seven mil";
        }
        else if(digit == 8)
        {
            return "siete mil";
        }
        else
        {
            return "nueve mil";
        }
    }


    public static String secondNumber(int digit)
    {
        if(digit == 1)
        {
            return "cien";
        }
        else if(digit == 2)
        {
            return "doscientos";
        }
        else if(digit == 3)
        {
            return "trescientos";
        }
        else if(digit == 4)
        {
            return "cuatrocientos";
        }
        else if(digit == 5)
        {
            return "quinientos";
        }
        else if(digit == 6)
        {
            return "seiscientos";
        }
        else if(digit == 7)
        {
            return "setecientos";
        }
        else if(digit == 8)
        {
            return "ochocientos";
        }
        else
        {
            return "novecientos";
        }

    }

    public static String thirdNumber(int digit)
    {

        if(digit == 3)
        {
            return "treinta";
        }
        else if(digit == 4)
        {
            return "cuarenta";
        }
        else if(digit == 5)
        {
            return "cincuenta";
        }
        else if(digit == 6)
        {
            return "sesenta";
        }
        else if(digit == 7)
        {
            return "setenta";
        }
        else if(digit == 8)
        {
            return "ochenta";
        }
        else
        {
            return "noventa";
        }
    }

    public static String twenty(int digit)
    {

        if(digit == 20)
        {
            return "veinte";
        }
        else if(digit == 21)
        {
            return "veintiuno";
        }
        else if(digit == 22)
        {
            return " veintidós";
        }
        else if(digit == 23)
        {
            return "veintitrés";
        }
        else if(digit == 24)
        {
            return "veinticuatro";
        }
        else if(digit == 25)
        {
            return "veinticinco";
        }
        else if(digit == 26)
        {
            return "veintiséis";
        }
        else if(digit == 27)
        {
            return "veintisiete";
        }
        else if(digit == 28)
        {
            return "veintiocho";
        }
        else
        {
            return "veintinueve";
        }
    }

    public static String tens(int digit)
    {

        if(digit == 10)
        {
            return "diez";
        }
        else if(digit == 11)
        {
            return "once";
        }
        else if(digit == 12)
        {
            return " doce";
        }
        else if(digit == 13)
        {
            return "trece";
        }
        else if(digit == 14)
        {
            return "catorce";
        }
        else if(digit == 15)
        {
            return "quince";
        }
        else if(digit == 16)
        {
            return "dieciséis";
        }
        else if(digit == 17)
        {
            return "diecisiete";
        }
        else if(digit == 18)
        {
            return "dieciocho";
        }
        else
        {
            return "diecinueve";
        }
    }


    public static String fourthNumber(int digit)
    {

        if(digit == 1)
        {
            return "uno";
        }
        else if(digit == 2)
        {
            return "dos";
        }
        else if(digit == 3)
        {
            return "tres";
        }
        else if(digit == 4)
        {
            return "cuatro";
        }
        else if(digit == 5)
        {
            return "cinco";
        }
        else if(digit == 6)
        {
            return "seis";
        }
        else if(digit == 7)
        {
            return "siete";
        }
        else if(digit == 8)
        {
            return "ocho";
        }
        else
        {
            return "nueve";
        }
    }

}
