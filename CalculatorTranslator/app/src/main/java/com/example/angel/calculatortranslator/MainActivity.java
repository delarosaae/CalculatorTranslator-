package com.example.angel.calculatortranslator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private StringBuilder number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }

    public void Two(View view)
    {
        number.append("2");
    }

    public void Three(View view)
    {
        number.append("3");
    }

    public void Four(View view)
    {
        number.append("4");
    }

    public void Five(View view)
    {
        number.append("5");
    }

    public void Six(View view)
    {
        number.append("6");
    }

    public void Seven(View view)
    {
        number.append("7");
    }

    public void Eight(View view)
    {
        number.append("8");
    }

    public void Nine(View view)
    {
        number.append("9");
    }

    public void Zero(View view)
    {
        number.append("0");
    }
}
