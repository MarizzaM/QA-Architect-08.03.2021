package com.app;

public class StudioApartment extends Apartment {

    private float m_numbers_of_rooms;

    public StudioApartment(String m_address, float m_size, float m_numbers_of_rooms) {
        super(m_address, m_size);
        this.m_numbers_of_rooms = m_numbers_of_rooms;
    }

    @Override
    public String toString() {
        return "StudioApartment{" +
                "m_numbers_of_rooms=" + m_numbers_of_rooms +
                "} " + super.toString();
    }
}
