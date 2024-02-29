package aoc.example.googlemapsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{

    CheckBox gym, hospital, market, school , park;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

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

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.parkCheckBox:
                if (park.isChecked())
                    Toast.makeText(getApplicationContext(), "Park selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.gymCheckBox:
                if (gym.isChecked())
                    Toast.makeText(getApplicationContext(), "Gym selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.hospitalCheckBox:
                if (hospital.isChecked())
                    Toast.makeText(getApplicationContext(), "Hospital selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.schoolCheckBox:
                if (school.isChecked())
                    Toast.makeText(getApplicationContext(), "School selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.marketCheckBox:
                if (market.isChecked())
                    Toast.makeText(getApplicationContext(), "Supermarket selected", Toast.LENGTH_LONG).show();
                break;



        }

    }
}
