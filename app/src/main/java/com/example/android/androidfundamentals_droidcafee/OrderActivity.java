package com.example.android.androidfundamentals_droidcafee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.sameday_radioButton:
                if(checked)
                    displayToast(getString(R.string.same_day_messenger_service));
                break;
            case R.id.nextday_radioButton:
                if(checked)
                    displayToast(getString(R.string.next_day_ground_delivery));
                break;
            case R.id.pickup_radioButton:
                if(checked)
                    displayToast(getString(R.string.pickup));
                break;
            default :
                break;
        }
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}