package com.app;

public abstract class Mechanic {

    private int m_experience_of_years;

    public Mechanic(int m_experience_of_years) {
        this.m_experience_of_years = m_experience_of_years;
    }

    abstract void repair();

    public void useScrewdriver(){
        System.out.println("Using screwdriver to open this screw");
    }
}