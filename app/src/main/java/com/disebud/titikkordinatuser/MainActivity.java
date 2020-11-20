package com.disebud.titikkordinatuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.buttonKordinat);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GPSTracker gps = new GPSTracker(MainActivity.this);
                double latitude = gps.getLatitude();
                double longitude = gps.getLongitude();
                textView.setText("Kordinat Anda \n\n Latitude:\n " + latitude + " \n Longitude:\n " +
                        longitude+"\n ");
            }
        });
    }

}