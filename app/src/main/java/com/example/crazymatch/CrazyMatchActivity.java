package com.example.crazymatch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class CrazyMatchActivity extends AppCompatActivity {



    /**
     * Set up the background image for each button based on the master list
     * of positions, and then call the adapter to set the view.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crazymatch);
    }

}
