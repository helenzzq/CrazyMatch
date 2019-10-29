package com.example.crazymatch;

//Citation :https://www.journaldev.com/1739/observer-design-pattern-in-java

public interface Observer {

    /**
     * Update accordingly after subject calls notifyObservers()
     */
    void update();

    /**
     * Set the subject to be obsevred
     * @param subject to be observed
     */
    void setSubject(Subjects subject);
}