package com.app;

public class Main {

    public static void main(String[] args) {

        CarsMechanic carsMechanic = new CarsMechanic(15, "all types");

        carsMechanic.repair();
        carsMechanic.replaceWheel();

        AirplanesMechanic airplanesMechanic = new AirplanesMechanic(1,1);

        airplanesMechanic.checkEngine();
        airplanesMechanic.repair();
    }
}