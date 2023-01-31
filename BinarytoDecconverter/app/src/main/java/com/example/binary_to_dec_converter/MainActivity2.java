package com.example.binary_to_dec_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        // Giving name to the variables for two EditTexts and two Buttons
        // input is where the user will input the decimal number
        // output is where the user will get the output in the form of binary number
        // submit is the button created to submit the decimal number entered by the user
        // clear is the button to clear the answer
        EditText input, Binoutput2, Octaoutput2;
        Button submit2, reset2, bin, octa;

        // Calling the EditText by id which we gave in xml file
        input = (EditText) findViewById(R.id.editText2);
        Binoutput2 = (EditText) findViewById(R.id.Binoutput2);
        Octaoutput2 = (EditText) findViewById(R.id.Octaoutput2);

        submit2 = (Button) findViewById(R.id.submit2);

        // It is set so that when the user clicks on submit button, the data
        // gets send in the function created below which will convert it and then
        // show the answer to the user in the output
        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Creating a string method argument
                String string = input.getText().toString();

                // Here, we are parsing a string method
                // argument into an integer object
                int i = Integer.parseInt(string, 10);

                // Converts and stores it in the form of string
                String binary = Integer.toBinaryString(i);
                String octa = Integer.toOctalString(i);
                // It will show the output in the second edit text that we created
                Binoutput2.setText(binary);
                Octaoutput2.setText(octa);
            }
        });

        // Here, we will define a function which will
        // clear the whole text and reset it
        reset2 = (Button) findViewById(R.id.reset2);
        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                Binoutput2.setText("");
                Octaoutput2.setText("");
            }
        });

        bin = (Button) findViewById(R.id.bin);
        bin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
            }
        });

        octa = (Button) findViewById(R.id.octa);
        octa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
            }
        });

    }
}