package com.company;

/*
Name:Colin Maloney
Project: Void Method
Description: How to make a void method
 */

public class Main {

//    private static void Jhi(String username){
//        System.out.println("Hello " + username + "!");
//        System.out.println("We are glad to see you here today!");
//        System.out.println("Please check your email!");
//    }

    static int updateAge(int tempAge){
        return tempAge+1;
    }

    public static void main(String[] args) {
        //Jhi("Pillow");
        System.out.println(updateAge(10));
    }
}
