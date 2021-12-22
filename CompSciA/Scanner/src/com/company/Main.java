package com.company;
import java.util.Scanner;

/*
Name:Colin Maloney
Project: FromUser
Description: User input with scanners
 */

public class Main {

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        //creates an input device to get info from the keys
        System.out.println("What is your full name?");
        String fullName = keys.nextLine();
        System.out.println("How old are you?");
        int userAge = keys.nextInt();
        System.out.println("Full name: " + fullName +"\nAge: "+userAge);
        keys.close();
    }
}
