package com.app;

public class AirplanesMechanic extends Mechanic{

    private int rank;

    public AirplanesMechanic(int m_experience_of_years, int rank) {
        super(m_experience_of_years);
        this.rank = rank;
    }

    @Override
    void repair() {
        System.out.println("Repairing airplane");
    }

    public void checkEngine(){
        System.out.println("Checking the engine");
    }
}
