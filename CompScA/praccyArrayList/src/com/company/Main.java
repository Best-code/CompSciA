package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asL{1,2,2,3,3,4,5});
        System.out.println(remDumps());
    }ar

    public static ArrayList<Integer> remDumps(ArrayList<Integer> nums){
        for(int x = 0; x <nums.size() -1; x++){
            if(nums.get(x).equals(nums.get(x+1))){
                nums.remove(x);
                x++;
            }
        }

        return nums;
    }
}

