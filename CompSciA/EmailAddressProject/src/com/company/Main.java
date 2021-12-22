package com.company;

import java.util.Scanner;

class Work{
    public String firstName;
    public String middleName;
    public String lastName;
    public String DOB;


    public void getInfo(){
        Scanner keys = new Scanner(System.in);
        System.out.println("What is your First name?");
        firstName = keys.next();
        System.out.println("What is your Middle name?");
        middleName = keys.next();
        System.out.println("What is your Last name?");
        lastName = keys.next();
        System.out.println("What is your Date-Of-Birth? (dd-mm-yyyy)");
        DOB = keys.next();
    }

    public void returnInfo(){
        String userName = (lastName.substring(0,5) + firstName.substring(0,1) + middleName.substring(0,1) + "@sharks.com");
        System.out.println("Email: " + userName);
        String tempPassword = (DOB.replace('-','\u0000'));
        System.out.println("\nTemp Password : " + tempPassword);
        System.out.println("\n*** This temporary password is very insecure . Please change it immediately! ***");
    }
}

public class Main {

    public static void main(String[] args) {
        Work work = new Work();
        work.getInfo();
        work.returnInfo();
    }
}
