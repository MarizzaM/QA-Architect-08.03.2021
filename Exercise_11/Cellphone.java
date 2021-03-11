package com.app;

public class Cellphone extends ElectricDevice {

    protected String brand;

    public Cellphone(float m_voltage, String brand) {
        super(m_voltage);
        this.brand = brand;
        this.m_works_on_batteries = true;
    }

    @Override
    void useDevice() {
        System.out.println("Talking on the phone");
    }

    @Override
    void fixDevice() {
        if(m_is_faulty){
            System.out.println("fixing cellphone");
            m_is_faulty = false;
        } else {
            System.out.println("This cellphone is working properly");
        }
    }
}
