package aoc.example.checkboxdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import aoc.example.Activity2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox gym, hospital, market, school, park;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button_send);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                another();
            }
        });


        // initiate views
        gym = (CheckBox) findViewById(R.id.gymCheckBox);
        gym.setOnClickListener(this);
        hospital = (CheckBox) findViewById(R.id.hospitalCheckBox);
        hospital.setOnClickListener(this);
        market = (CheckBox) findViewById(R.id.marketCheckBox);
        market.setOnClickListener(this);
        school = (CheckBox) findViewById(R.id.schoolCheckBox);
        school.setOnClickListener(this);
        park = (CheckBox) findViewById(R.id.parkCheckBox);
        park.setOnClickListener(this);
    }

    private void another() {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.gymCheckBox:
                if (gym.isChecked())
                    Toast.makeText(getApplicationContext(), "Gym Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.hospitalCheckBox:
                if (hospital.isChecked())
                    Toast.makeText(getApplicationContext(), "Hospital Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.schoolCheckBox:
                if (school.isChecked())
                    Toast.makeText(getApplicationContext(), "School Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.marketCheckBox:
                if (market.isChecked())
                    Toast.makeText(getApplicationContext(), "Supermarket Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.parkCheckBox:
                if (park.isChecked())
                    Toast.makeText(getApplicationContext(), "Park Selected", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
