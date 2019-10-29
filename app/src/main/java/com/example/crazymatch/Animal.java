package com.example.crazymatch;

import android.widget.ImageView;

public class Animal extends Element {
    public Animal(ImageView appearance, int x, int y, String status) {
        super(appearance, x, y, status);

    }

    protected void move() {
        x--;
        y += 2;

    }
}
