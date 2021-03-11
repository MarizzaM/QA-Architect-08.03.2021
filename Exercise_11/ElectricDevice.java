package com.app;

public abstract class ElectricDevice {

    protected float m_voltage;
    protected Boolean m_works_on_batteries;
    protected Boolean m_is_faulty;

    public ElectricDevice(float m_voltage, Boolean m_works_on_batteries) {
        this.m_voltage = m_voltage;
        this.m_works_on_batteries = m_works_on_batteries;
        this.m_is_faulty = false;
    }

    public ElectricDevice(float m_voltage) {
        this.m_is_faulty = false;
    }

    public void turnOn(){
        System.out.println("Turning device on...");
    }

    public final void insertNewBatteries(){
        if(m_works_on_batteries){
            System.out.println("Inserting new batteries to the device");
        } else {
            System.out.println("!This device doesn’t use batteries");
        }
    }

    abstract void useDevice();

    abstract void fixDevice();
}
