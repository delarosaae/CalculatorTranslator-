package com.example.angel.calculatortranslator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    private StringBuilder number;
    private TextView displayNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayNumber = (TextView) findViewById(R.id.ViewOfTotaLNumber);
        number = new StringBuilder();
    }

    public String getNumber()
    {
        return number.toString();
    }

    /**
     *Would have to have the textview update after every button click. Would need to append to
     * last string number
     */

    /**
     *For every onclick, we will send that number to a method that will keep over string. String
     * might need to be global
     */

    public void One(View view)
    {
        number.append("1");
        displayNumber.append("1");
    }

    public void Two(View view)
    {
        number.append("2");
        displayNumber.append("2");
    }

    public void Three(View view)
    {
        number.append("3");
        displayNumber.append("3");
    }

    public void Four(View view)
    {
        number.append("4");
        displayNumber.append("4");
    }

    public void Five(View view)
    {
        number.append("5");
        displayNumber.append("5");
    }

    public void Six(View view)
    {
        number.append("6");
        displayNumber.append("6");
    }

    public void Seven(View view)
    {
        number.append("7");
        displayNumber.append("7");
    }

    public void Eight(View view)
    {
        number.append("8");
        displayNumber.append("8");
    }

    public void Nine(View view)
    {
        number.append("9");
        displayNumber.append("9");
    }

    public void Zero(View view)
    {
        number.append("0");
        displayNumber.append("0");
    }

    //These buttons are for translating it into English or Spanish
    public void English(View view)
    {
        String convertedToString = getNumber();

        Intent english = new Intent(this, TranslateActivity.class);
        english.putExtra("theNumber", convertedToString);
        startActivity(english);
    }

    public void Spanish(View view)
    {
        String convertedToString = getNumber();

        Intent spanish = new Intent(this, SpanishTranslate.class);
        spanish.putExtra("theNumber", convertedToString);
        startActivity(spanish);
    }
}
