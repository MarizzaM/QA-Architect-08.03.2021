package com.app;

public class Apartment {
    private String m_address;
    private float m_size;

    public Apartment(String m_address, float m_size) {
        this.m_address = m_address;
        this.m_size = m_size;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "m_address='" + m_address + '\'' +
                ", m_size=" + m_size +
                '}';
    }
}
