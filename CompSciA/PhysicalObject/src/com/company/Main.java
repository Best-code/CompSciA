package com.company;

import java.util.Random;

class Dice {
    int sides;
    Random rand = new Random();

    public Dice(int sides){
        this.sides = sides;
    }

    public String returnRoll(){
        int roll = rand.nextInt(sides)+1;
        String words = "You rolled a " + roll + "!";
        return words;
    }

}

public class Main {

    public static void main(String[] args) {
	    Dice six = new Dice(6);
        System.out.println(six.returnRoll());
    }
}
