package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	System.out.println("Histogram\n---------------------------------------------------------------------------------------------------\n");

        ArrayMaker AM = new ArrayMaker();
        System.out.println(AM.stuff());
    }
}


class ArrayMaker {

    int[] noDupe;
    String[] count = new String[10];


    public ArrayMaker(){
        Arrays.fill(count,"");
        noDupe = new int[new Random().nextInt(50)+51];
        for(int x = 0; x < noDupe.length; x++) {
            noDupe[x] = new Random().nextInt(100) + 1;
        }
    }

    public String stuff(){
        for(int x : noDupe){
            if(x<=10){
                count[0] += "*";
            }
            else if(x<=20){
                count[1] += "*";
            }
            else if(x<=30){
                count[2] += "*";
            }
            else if(x<=40){
                count[3] += "*";
            }
            else if(x<=50){
                count[4] += "*";
            }
            else if(x<=60){
                count[5] += "*";
            }
            else if(x<=70){
                count[6] += "*";
            }
            else if(x<=80){
                count[7] += "*";
            }
            else if(x<=90){
                count[8] += "*";
            }
            else if(x<=100){
                count[9] += "*";
            }
        }

        String retString = "";

        for(int x = 0; x < 10; x++){
            retString += (x * 10 + 1) + (x == 0? "  - ": " - ") + (x * 10 + 10) + (x==9? " | ":"  | ") + count[x] +"\n";

        }

        return retString;
    }

}