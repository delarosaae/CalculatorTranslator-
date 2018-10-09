package com.example.angel.calculatortranslator;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private String number = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String getNumber()
    {
        return number;
    }

    /**
     *Would have to have the textview update after every button click. Would need to append to
     * last string number
     */

    /**
     *For every onclick, we will send that number to a method that will keep over string. String
     * might need to be global
     */
}
