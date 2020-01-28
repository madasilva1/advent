package com.example.android.adventure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int rand = (int) (Math.random() * 100) + 1;
    int ctr = 0;
    int lefttray = 10;
//protected static final String TAG = MainActivity.class.getSimpleName();
    int desiredValue = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log.v(TAG,"desired value is:" + desiredValue);

    }

    /*
    This method is called when enter Botton is pressed
     */
    public void display(View view) {


        // Get input from User
        EditText nameField = findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        if (!nameEditable.toString().equals("")) {
            String value = nameEditable.toString();
            desiredValue = Integer.parseInt(value);


            //Log.v("Mainactivity","nameEditable!!!!!!!!!!!!!!!!!"+nameEditable);

            if (ctr < 10 && rand > desiredValue) {
                int left = lefttray - ctr;
                displayMessage("You still have " + left + " Tray. " + "\n" + " Tray again, Larger Than That");
                // displayMessage("value entered"+ value);

            }
            if (ctr < 10 && rand < desiredValue) {
                int left = lefttray - ctr;
                displayMessage("You still have " + left + " Tray. " + "\n" + " Try again, Smaller Than That");
            }
            if (ctr < 10 && desiredValue > 100) {
                displayMessage("Number out of range, it should be between 1 ad 100");
            }

            if (ctr < 10 && rand == desiredValue) {
                int left = lefttray - ctr;
                displayMessage(" You had " + left + " tray." + "\n" + " You Won! " + rand + " Is the Number");
            }
            if (ctr == 10) {
                displayMessage("You lost! that's the number " + " " + rand);

            }

            ctr++;
        } else {
          displayMessage("Input not valid");
        }
    }
        private void displayMessage (String message){
            TextView priceTextView = (TextView) findViewById(R.id.number_text_view);
            priceTextView.setText(message);
        }
public void resetBotton(View view){
        rand = (int) (Math.random() * 100) + 1;
        ctr = 1;

        displayMessage("Start it again good lock");

}

    }

