package com.app;

import java.time.LocalTime;

public class CarsMechanic extends Mechanic{

    private String m_car_types_i_can_repair;

    public CarsMechanic(int m_experience_of_years, String m_car_types_i_can_repair) {
        super(m_experience_of_years);
        this.m_car_types_i_can_repair = m_car_types_i_can_repair;
    }

    @Override
    void repair() {
        if (LocalTime.now().getHour() > 17 || LocalTime.now().getHour() < 7 ){
            System.out.println("Garage is closed");
        } else {
            System.out.println("Repairing car");
        }
    }

    public void replaceWheel(){
        if (LocalTime.now().getHour() > 17 || LocalTime.now().getHour() < 7 ){
            System.out.println("Garage is closed");
        } else {
            System.out.println("Replacing the damaged wheel");
        }
    }
}