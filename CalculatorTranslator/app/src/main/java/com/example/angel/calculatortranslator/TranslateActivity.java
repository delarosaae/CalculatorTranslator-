package com.example.angel.calculatortranslator;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TranslateActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
        /**
         * I am pretty sure that it would have to be before the setContect but lets try both
         */

        Bundle number = getIntent().getExtras();
        String numbertwo = number.getString("theNumber");

        int numberInNumberForm = Integer.parseInt(numbertwo);


        String showTranslatedNumber = getNumberInStringForm(numberInNumberForm);
        //Toast showNumber = Toast.makeText(getApplicationContext(), showTranslatedNumber, Toast.LENGTH_LONG);
        //showNumber.show();

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

        if(userNumber > 10)
        {
            int thirdDigit = (userNumber / 10);
            translatedNumber = translatedNumber + " " + thirdNumber(thirdDigit);
            userNumber = userNumber % 10;
        }

        if(userNumber > 0)
        {
            translatedNumber = translatedNumber + " " + fourthNumber(userNumber);
        }

        return translatedNumber;
    }

    public static String firstNumber(int digit)
    {
        if(digit == 1)
        {
           return "One thousand";
        }
        else if(digit == 2)
        {
            return "Two thousand";
        }
        else if(digit == 3)
        {
            return "Three thousand";
        }
        else if(digit == 4)
        {
            return "Four thousand";
        }
        else if(digit == 5)
        {
            return "Five thousand";
        }
        else if(digit == 6)
        {
            return "Six thousand";
        }
        else if(digit == 7)
        {
            return "Seven thousand";
        }
        else if(digit == 8)
        {
            return "Eight thousand";
        }
        else
        {
            return "Nine thousand";
        }
    }


    public static String secondNumber(int digit)
    {
        if(digit == 1)
        {
            return "one hundred";
        }
        else if(digit == 2)
        {
            return "two hundred";
        }
        else if(digit == 3)
        {
            return "three hundred";
        }
        else if(digit == 4)
        {
            return "four hundred";
        }
        else if(digit == 5)
        {
            return "five hundred";
        }
        else if(digit == 6)
        {
            return "six hundred";
        }
        else if(digit == 7)
        {
            return "seven hundred";
        }
        else if(digit == 8)
        {
            return "eight hundred";
        }
        else
        {
            return "nine hundred";
        }

    }

    public static String thirdNumber(int digit)
    {
        if(digit == 2)
        {
            return "twenty";
        }
        else if(digit == 3)
        {
            return "thirty";
        }
        else if(digit == 4)
        {
            return "fourty";
        }
        else if(digit == 5)
        {
            return "fifty";
        }
        else if(digit == 6)
        {
            return "sixty";
        }
        else if(digit == 7)
        {
            return "seventy";
        }
        else if(digit == 8)
        {
            return "eighty";
        }
        else
        {
            return "ninty";
        }
    }

    public static String fourthNumber(int digit)
    {
        if(digit == 1)
        {
            return "one";
        }
        else if(digit == 2)
        {
            return "two";
        }
        else if(digit == 3)
        {
            return "three";
        }
        else if(digit == 4)
        {
            return "four";
        }
        else if(digit == 5)
        {
            return "five";
        }
        else if(digit == 6)
        {
            return "six";
        }
        else if(digit == 7)
        {
            return "seven";
        }
        else if(digit == 8)
        {
            return "eight";
        }
        else if(digit == 9)
        {
            return "nine";
        }
        else
        {
            return "ten";
        }
    }

}
