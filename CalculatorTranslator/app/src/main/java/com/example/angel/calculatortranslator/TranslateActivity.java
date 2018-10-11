package com.example.angel.calculatortranslator;

import android.os.Bundle;
import android.app.Activity;

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


    }

}
