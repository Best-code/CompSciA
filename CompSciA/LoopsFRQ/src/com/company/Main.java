package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        APCalendar apc = new APCalendar();
        Halistone noon = new Halistone(5);
        StringManip sm = new StringManip("racecar");
        System.out.println("String Manip");
        System.out.println(sm.removeSpaces());
        System.out.println(sm.reverseNoLibraries());
        System.out.println(sm.bPalindrome());
        System.out.println("\nHALISTONE");
        System.out.println(noon.returnN());
        System.out.println(noon.returnNLength());
        System.out.println(noon.bIsLong());
        System.out.println(noon.propSeq());
        System.out.println("\nCALENDAR");
        System.out.println(Boolean.toString(apc.isLeapYear(2004))+'\n'+
        apc.numberOfLeapYears(2003,2009) +'\n'+
        apc.firstDayOfYear(2018) +'\n'+
        apc.dayOfYear(3,1,2016) +'\n'+
        apc.dayOfWeek(1,1,2021));

    }
}

class APCalendar   {
    /** Returns true if year is a leap year and falseotherwise */
    boolean isLeapYear(int year)     {
        return(year%4==0);
    }     /** Returns the number of leap years between year1 andyear2, inclusive.*  Precondition: 0 <= year1 <= year2*/
    int numberOfLeapYears(int year1, int year2)     {
        int c = 0;
        for(int x = year1;x<year2;x++){
            if(isLeapYear(x))
                c++;
        }
        return c;
    }     /** Returns the value representing the day of the weekfor the first day of year,*  where 0 denotes Sunday, 1 denotes Monday, ..., and 6denotes Saturday.*/
    int firstDayOfYear(int year)     {
        if(isLeapYear(year))
            return(((year*365)+(year*1/4))%7-2);
        return(((year*365)+(year*1/4))%7-1);
    }     /** Returns , where month, day, and year specify the dayof the year.*  Returns 1 for January 1 (month = 1, day = 1) of any year.*
     Precondition: The date represented by month, day, year isa valid date.*/
    int dayOfYear(int month, int day, int year)     {
        return((month-1)*30+day);
    }     /** Returns the value representing the day of the weekfor the given date*  (month, day, year), where 0 denotes Sunday, 1 denotesMonday, ...,*  and 6 denotes Saturday.*  Precondition: The date represented by month, day, year isa valid date.*/
    int dayOfWeek(int month, int day, int year)     {
        int x = firstDayOfYear(year);
        return(x+=(month-1)*30+day-1);
    }     // There may be instance variables, constructors, andother methods not shown.
}

class Halistone{

    int n;
    Stack<Integer> ints = new Stack<Integer>();

    Halistone(int n){
        this.n = n;

        while(n!=1) {
            ints.push(n);
            if (n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;
        }
        ints.push(1);
    }

    Stack<Integer> returnN(){
        return ints;
    }

    int returnNLength(){
        return ints.toArray().length;
    }

    boolean bIsLong(){
        if(this.returnNLength()>ints.get(0)){
            return true;
        }
        return false;
    }

    double propSeq(){
        double count = 0;
        for (int x: ints) {
            if(x>ints.get(0))
                count++;
        }
        return (Double.parseDouble(Double.toString(count/ints.toArray().length).substring(0,4)));
    }

}

class StringManip{

    String toManip;

    StringManip(String toManip){
        this.toManip = toManip;
    }

    String removeSpaces(){
        this.toManip = toManip.replace(" ","");
        return toManip.replace(" ","");
    }

    String reverseString(){
        StringBuilder sb = new StringBuilder(removeSpaces()).reverse();
        return(sb.toString());
    }

    String reverseNoLibraries(){
        String reversed = "";
        String spaceLess = removeSpaces();
        for(int x = spaceLess.length();x>0;x--){
            reversed += spaceLess.substring(x-1,x);
        }
        return reversed;
    }

    boolean bPalindrome(){
        if(reverseString().equals(toManip)){
            return true;
        }
        return false;
    }

}
