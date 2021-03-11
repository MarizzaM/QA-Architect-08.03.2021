package com.app;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//a
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
//b
        System.out.println(numbers);
//c
        System.out.println(numbers.get(0));
//d
        numbers.remove(1);
//e
        System.out.println(numbers.indexOf(9));
    }
}
