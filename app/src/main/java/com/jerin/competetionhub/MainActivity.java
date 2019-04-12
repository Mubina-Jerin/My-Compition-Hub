package com.jerin.competetionhub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView myTextView;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myTextView = findViewById(R.id.myTextView);
        myButton = findViewById(R.id.myButton);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // so


                Abstract jerin = new Abstract("Jerimn", "151", "Bonosri", "017");
                Abstract juboraj = new Abstract("Juboraj", "151-15-270", "Uttara", "019");

                Toast.makeText(MainActivity.this, juboraj.getId(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
