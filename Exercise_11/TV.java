package com.app;

public class TV extends ElectricDevice{

    protected float m_size_screen;

    public TV(float m_voltage, float m_size_screen) {
        super(m_voltage);
        this.m_size_screen = m_size_screen;
        this.m_works_on_batteries = false;
    }

    @Override
    void useDevice() {
        System.out.println("watching TV...");
    }

    @Override
    void fixDevice() {
        if(m_is_faulty){
            System.out.println("TV fixing");
            m_is_faulty = false;
        } else {
            System.out.println("This TV is working properly");
        }
    }
}
