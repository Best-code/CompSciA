package com.company;

import java.util.Random;

//class phoneNumber{
//    String firstThree = "";
//    String midThree = "";
//    String lastFour = "";
//    String all = "";
//
//    void create(){
//
//        for (int i = 0; i < 3; i++) {
//            Random rand = new Random();
//            int x = rand.nextInt(8);
//            firstThree += Integer.toString(x);
//        }
//        for (int i = 0; i < 3 ; i++) {
//            Random rand = new Random();
//            int x = rand.nextInt(10);
//            if (i == 0 && x > 7){
//                x = rand.nextInt(7);
//            }
//            if (i == 1 && midThree.equals("7") && x > 4){
//                x = rand.nextInt(4);
//            }
//            if (i == 1 && midThree.equals("74") && x > 1){
//                x = rand.nextInt(2);
//            }
//            midThree += Integer.toString(x);
//        }
//        for (int i = 0; i < 4; i++) {
//            Random rand = new Random();
//            int x = rand.nextInt(8);
//            lastFour += Integer.toString(x);
//        }
//        all = (firstThree + "-" + midThree + "-" + lastFour);
//        System.out.println(all);
//
//    }
//}

public class Main {

    public static void main(String[] args) {
//	phoneNumber l = new phoneNumber();
//	l.create();
        Random rand = new Random();
        int firstNum = rand.nextInt(7);
        int second = rand.nextInt(7);
        int third = rand.nextInt(7);
        String first = Integer.toString(firstNum) + Integer.toString(second) + Integer.toString(third);
        int middle = rand.nextInt(742);
        int last = rand.nextInt(10000);

        String all = (first + "-" + middle + "-" + last);
        System.out.println(all);


    }
}
