package com.example.crazymatch;

import java.util.List;

/**
 * A class representaion of all the elements in the CrazyMatch Game
 */
public abstract class Element {

/**
 * The appearance of the element
 */
protected String appearance;
    /**
     * The x-coordinates of the elements
     */
protected int x;
    /**
     * The y-coordinates of the elements
     */
protected int y;
    /**
     * The status of the elements indicating whether the animal is saved
     */
protected String status;


Element(String appearance, int x, int y, String status){
    this.appearance = appearance;
    this.x = x;
    this.y = y;
    this.status = status;
}

protected abstract void move();
}
