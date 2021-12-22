package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        /*System.out.println("Histogram\n---------------------------------------------------------------------------------------------------\n");

        ArrayMaker AM = new ArrayMaker();
        System.out.println(AM.stuff());

        System.out.println("NoDupe\n---------------------------------------------------------------------------------------------------\n");

         */

        NoDupe x = new NoDupe();

        System.out.println("Clean");
        System.out.println(x.calc());
        System.out.println("\nOriginal");
        System.out.println(Arrays.toString(x.original));

    }
}

/*class ArrayMaker {

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

}*/

class NoDupe{
    Random rand = new Random();
    ArrayList<Integer> duped = new ArrayList<>();

    ArrayList<Integer> now = new ArrayList<>();

    int[] original;

    public NoDupe(){
        original = new int[rand.nextInt(20)+31];
    }

    public ArrayList<Integer> calc(){


        for(int x = 0; x < original.length; x++){
            original[x] = rand.nextInt(30) + 1;
        }
        Arrays.sort(original);

        for(int x = 0; x < original.length; x++){
            if(!Arrays.toString(duped.toArray()).contains((x==0?"": (Integer.toString(original[x]).length() > 1? " ":"")) + original[x])){
                now.add(original[x]);
                duped.add(original[x]);
            }
        }
        Collections.sort(now);
        return now;
    }
}