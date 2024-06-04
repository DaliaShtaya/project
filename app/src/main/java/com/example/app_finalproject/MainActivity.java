package com.example.app_finalproject;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rgPaymentMethod;
    private RadioButton Cash, Card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgPaymentMethod = findViewById(R.id.PaymentMethod);
        Cash = findViewById(R.id.Cash);
        Card = findViewById(R.id.Credit_Card);

        rgPaymentMethod.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                   /*     case R.id.Cash:
                        Toast.makeText(MainActivity.this, "Cash selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Credit_Card:
                        Intent intent = new Intent(MainActivity.this, CardDetailsActivity.class);
                        startActivity(intent);
                        break;*/
                }
            }
        });
    }
}
