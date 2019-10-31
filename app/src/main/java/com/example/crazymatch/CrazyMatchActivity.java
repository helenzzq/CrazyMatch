package com.example.crazymatch;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class CrazyMatchActivity extends AppCompatActivity {


    /**
     * Set up the background image for each button based on the master list
     * of positions, and then call the adapter to set the view.
     */
    ImageView currView = null;
    private int countPair = 0;
    final int[] drawable = new int[]{R.drawable.chicken, R.drawable.cow, R.drawable.fox, R.drawable.reindeer,
            R.drawable.snail, R.drawable.owl, R.drawable.lion, };

    int[] pos = {0, 1, 2, 3, 4, 5, 6, 0, 1, 2, 3, 4, 5, 6};
    int currentPos = -1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crazymatch);
        GridView gridView = findViewById(R.id.gridview);
        MatchAdapter matchAdapter = new MatchAdapter(this);
        gridView.setAdapter(matchAdapter);
        setItemClickListener(gridView);


    }
    public void setItemClickListener(GridView gridView){
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (currentPos < 0) {
                    currentPos = position;
                    currView = (ImageView) view;
                    ((ImageView) view).setImageResource(drawable[pos[position]]);
                } else {
                    if (currentPos == position) {
                        ((ImageView) view).setImageResource(R.drawable.planet);
                    } else if (pos[currentPos] != pos[position]) {
                        currView.setImageResource(R.drawable.planet);
                        Toast.makeText(getApplicationContext(), "Animals does not match", Toast.LENGTH_SHORT).show();

                    } else {
                        ((ImageView) view).setImageResource(drawable[pos[position]]);
                        countPair++;
                        if (countPair == 0) {
                            Toast.makeText(getApplicationContext(), "Congrats, you win", Toast.LENGTH_SHORT).show();
                        }

                    }
                    currentPos = -1;

                }
            }
        });
    }

}
