package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	TwoDimArray td = new TwoDimArray();
	td.fill();
	td.print(td.twoD);
	System.out.println(td.sumRow(td.twoD,7));
	System.out.println(td.sumCol(td.twoD,2));

    }
}


class TwoDimArray{

    int rows, cols;
    int[][] twoD;

    public TwoDimArray(){
        rows = (int)(Math.random()*7)+2;
        cols = (int)(Math.random()*7)+2;

        twoD = new int[rows][cols];
    }


    public int[][] fill(){
        for(int r = 0; r<rows; r++){
            for(int c = 0; c<cols;c++){
                twoD[r][c] = (int)(Math.random()*21)-10;
            }
        }
        return twoD;
    }

    public int sumRow(int[][] arr, int row){

        int s = 0;
        try{
            s+=arr[row][0];
        }catch(Exception e){
            System.out.println(e);
            return -1;
        }

        s = 0;
        for(int i :arr[row]){
            s+=i;
        }
        return s;
    }

    public int sumCol(int[][] arr, int col){

        int s = 0;
        try{
            s+=arr[0][col];
        }catch(Exception e){
            System.out.println(e);
            return -1;
        }

        s = 0;
        for(int i = 0; i < rows; i++){
            s+=arr[i][col];
        }
        return s;
    }

    public static void print(int[][] arr){
        System.out.println(Arrays.deepToString(arr));
    }
}
