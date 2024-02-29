package aoc.example.checkbox2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox gym, hospital, market, school , park;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // initiate views
        gym = (CheckBox) findViewById(R.id.gymCheckBox);
        gym.setOnClickListener(this);
        hospital = (CheckBox) findViewById(R.id.hospitalCheckBox);
        hospital.setOnClickListener(this);
        market = (CheckBox) findViewById(R.id.marketCheckBox);
        market.setOnClickListener(this);
        school = (CheckBox) findViewById(R.id.schoolCheckBox);
        school.setOnClickListener(this);
        park = (CheckBox) findViewById(R.id.schoolCheckBox);
        park.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.gymCheckBox:
                if (gym.isChecked())
                    Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_LONG).show();
                break;
            case R.id.hospitalCheckBox:
                if (hospital.isChecked())
                    Toast.makeText(getApplicationContext(), "Java", Toast.LENGTH_LONG).show();
                break;
            case R.id.schoolCheckBox:
                if (school.isChecked())
                    Toast.makeText(getApplicationContext(), "PHP", Toast.LENGTH_LONG).show();
                break;
            case R.id.marketCheckBox:
                if (market.isChecked())
                    Toast.makeText(getApplicationContext(), "Python", Toast.LENGTH_LONG).show();
                break;
            case R.id.parkCheckBox:
                if (park.isChecked())
                    Toast.makeText(getApplicationContext(), "Unity 3D", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
