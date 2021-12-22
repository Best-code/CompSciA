package com.company;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
        distance(2,3);
    }

    public static void distance(double a, double b){
        double result = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(result);
    }


}
