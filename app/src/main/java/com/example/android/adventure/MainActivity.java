package com.example.android.adventure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }
    public void IncreaseValue(View view){
       quantity = quantity + 1;

       displayQuantity(quantity);
    }
    public void DecreaseValue(View view){
        quantity = quantity - 1;
        displayQuantity(quantity);
    }
    public void ResetValue(View view){
        quantity = 0;
        displayQuantity(quantity);
    }
}
