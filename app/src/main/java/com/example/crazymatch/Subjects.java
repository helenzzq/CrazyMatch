package com.example.crazymatch;

public interface Subjects {


    /**
     * Register the PhaseTwoObserver object to observe
     * @param obj to register
     */
    void register(Observer obj);

    /**
     * A method to notifyObservers to change
     */
    void notifyObservers();

}
