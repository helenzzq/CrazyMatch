package com.example.crazymatch;

public class Animal extends Element {
    public Animal(String appearance, int x, int y, String status) {
        super(appearance, x, y, status);

    }

    protected void move() {
        x--;
        y += 2;

    }
}
