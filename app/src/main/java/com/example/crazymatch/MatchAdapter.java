package com.example.crazymatch;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MatchAdapter extends BaseAdapter {



    private Context context;
    public MatchAdapter (Context context){
        this.context = context;

    }
    @Override
    public int getCount() {
        return 16;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;
        if (convertView == null){
            imageView = new ImageView((this. context));
            imageView.setLayoutParams((new GridView.LayoutParams(350,350)));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        else
            imageView = (ImageView)convertView;
            imageView.setImageResource(R.drawable.planet);
            return imageView;


    }
}
