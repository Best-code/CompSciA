package com.company;

/*
Name:Colin Maloney
Project: Random
Description: making objects
 */

import java.util.Random;

class Spinner {
    private int options;

    public Spinner() {
        options = 4;
    }
    public int getOptions(){
        return options;
    }

    public String spin(int numSpun) {
        Random spin = new Random();
        int youSpun = spin.nextInt(options) + 1;
        return "On turn " + Integer.toString(numSpun) + " you spun a " + youSpun;
    }
}

public class Main {

    public static void main(String[] args) {
        Spinner spinnerOne = new Spinner();
        System.out.println("This spinner has " + spinnerOne.getOptions() + " sections.");
        System.out.println(spinnerOne.spin(1));
    }
}
