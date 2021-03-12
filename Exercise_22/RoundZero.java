package com.app;

public class RoundZero {

    public int round_up(double number){
        if (number < 0 || number > 1){
            return -1;
        }
        if (number == 0){
            return 0;
        } else {
            return 1;
        }
    }

    public static int round_down(double number){
        if (number < 0 || number > 1){
            return -1;
        }
        if (number == 1){
            return 1;
        } else {
            return 0;
        }
    }

    public static int round(double number){
        if (number < 0 || number > 1){
            return -1;
        }
        if (number >= 0 && number <= 0.4){
            return 0;
        } else {
            return 1;
        }
    }
}
