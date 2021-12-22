package com.company;
import java.util.Arrays;
import java.util.Random;

class nineArray{
    int[] array;
    public nineArray(int[] array){
        this.array = array;
    }
}

class Solver {
    //                    1      |          2      |          3      |          4      |          5      |          6      |          7      |          8      |          9      |
    int[] a1 = {1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    int[] og = {};
    int[] dont = {};
    int[] answer = a1;
    Random rand = new Random();

    public Solver() {

    }

    public void findOg() {
        int x = -1;
        for (int j : a1) {
            x += 1;
            if (j != 0) {
                og = Arrays.copyOf(og, og.length + 1);
                og[og.length - 1] = j; // Assign 40 to the last element
                dont = Arrays.copyOf(dont, dont.length + 1);
                dont[dont.length - 1] = x; // Assign 40 to the last element
            }
        }
        int neededLength = 81-dont.length;
        dont = Arrays.copyOf(dont, dont.length + neededLength);
        System.out.println(Arrays.toString(og) + " og");
        System.out.println(Arrays.toString(dont) + " dont");
    }

    public void stepOne() {
        int i = 0;
        while(i < 81){
            if(i!=dont[i]){
                answer[i] = rand.nextInt(9)+1;
            }
            i++;
        }
        System.out.println(Arrays.toString(answer));
    }

    public void stepTwo(){
        for (int i = 0; i < 9; i+= 9) {
            int[] newAnswer = Arrays.copyOfRange(answer, i, i+9);
            nineArray a = new nineArray(newAnswer);
        }
    }
}

public class Main {
    
    public static void main(String[] args) {

        Solver solver = new Solver();
        solver.findOg();
        solver.stepOne();

    }
}
