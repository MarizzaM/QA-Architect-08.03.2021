
package com.app;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Apartment apartment = new Apartment("B7", 210);
        StudioApartment studioApartment = new StudioApartment("Haifa", 120, 2.5f);

        System.out.println(apartment);
        System.out.println(studioApartment);
    }
}