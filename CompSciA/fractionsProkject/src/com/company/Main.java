package com.company;

import java.util.Scanner;

class fraction{

    int num;
    int den;

    public fraction(int num, int den){
        this.num = num;
        this.den = den;
    }
    public fraction(){
        num = 1;
        den = 2;
    }

    public void add(fraction one, fraction two){
        String words = (one.num + "/" + one.den + " + " + two.num + "/" + two.den + " = ");
        int hold = one.den;
        one.num *= two.den;
        two.num *= hold;
        two.den *= hold;
        int newNum = one.num + two.num;
        String answer = Integer.toString((int)newNum) + "/" + (int)two.den;
        System.out.println(words + answer);
    }


    public void multiply(fraction one, fraction two){
        String words = (one.num + "/" + one.den + " * " + two.num + "/" + two.den + " = ");
        one.den *= two.den;
        one.num *= two.num;
        String answer = Integer.toString((int)one.num) + "/" + (int)one.den;
        System.out.println(words + answer);
    }

    public void divide(fraction one, fraction two){
        String words = (one.num + "/" + one.den + " / " + two.num + "/" + two.den + " = ");
        int hold = two.num;
        two.num = two.den;
        two.den = hold;
        one.den *= two.den;
        one.num *= two.num;
        String answer = Integer.toString((int)one.num) + "/" + (int)one.den;
        System.out.println(words + answer);
    }

    public void sub(fraction one, fraction two){
        String words = (one.num + "/" + one.den + " - " + two.num + "/" + two.den + " = ");
        int hold = one.den;
        one.den *= two.den;
        one.num *= two.den;
        two.num *= hold;
        int newNum = one.num - two.num;
        String answer = Integer.toString((int)newNum) + "/" + (int)one.den;
        System.out.println(words + answer);
    }


}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean userInput;
        System.out.println("Do you want user input (y/n)");
        String input = in.nextLine().toLowerCase();
        if(input.equals("y")){
            System.out.println("Input numerator for fraction one");
            int numA = in.nextInt();
            System.out.println("Input denomenator for fraction one");
            int denA = in.nextInt();
            System.out.println("Input numerator for fraction two");
            int numB = in.nextInt();
            System.out.println("Input denomenator for fraction two");
            int denB = in.nextInt();
            fraction one = new fraction(numA,denA);
            fraction two = new fraction(numB,denB);
            one.sub(one,two);

        }else{
            fraction one = new fraction(); // Defaults to 1 for num and 2 for den
            fraction two = new fraction(1,4);
            System.out.println("See Class Main main method to see why I have a 1/4 for one of the two.");
            one.add(one,two);
        }


    }
}
