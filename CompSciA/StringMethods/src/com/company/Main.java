package com.company;

/*
Name:Colin Maloney
Project: String Methods
Description: toLower toUpper Length IndexOf Substring
 */

public class Main {

    public static void main(String[] args) {
        String stringNum = "12345678910";
        String stringLet = "aBcDeFgHiJkLmNoPqRsTuV";
        System.out.println(stringLet.toUpperCase());
        System.out.println(stringLet.toLowerCase());
        System.out.println(stringNum.indexOf("5"));
        System.out.println(stringNum.substring(2,8));
        System.out.println(stringNum.substring(4));
        System.out.println(stringLet + 123);
    }
}
