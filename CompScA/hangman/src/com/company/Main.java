package com.company;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
	Hangman h = new Hangman(6);
    }
}

class Hangman{

    String[] wordBank;
    int strikes;
    ArrayList<String> guessed;
    String toGuess;
    Scanner guessScan = new Scanner(System.in);
    ArrayList<String> printOut;

    public Hangman(int strikes) throws IOException {
        this.wordBank = new String(Files.readAllBytes(Paths.get("C:\\Users\\Connor\\Desktop\\words.txt"))).split("\n");
        this.strikes = strikes;
        this.guessed = new ArrayList<>();
        selectWord();
    }

    private void selectWord(){
        printOut = new ArrayList<>();
        this.toGuess = wordBank[((int) (Math.random() * wordBank.length))];

        for(int x = 0 ; x < toGuess.length()-1; x++){
            printOut.add("_");
        }
        System.out.println(toGuess);
        guess();
    }

    private void guess(){
        System.out.println("\nYou have " + strikes + " strikes left");
        Collections.sort(guessed);
        System.out.println(Arrays.toString(guessed.toArray()));
        System.out.println(printOut);
        String myGuess = guessScan.next();
        if(guessed.contains(myGuess)){
            System.out.println("You have already guessed this letter try again.");
            guess();
        }else{
            guessed.add(myGuess);
            if(!toGuess.contains(myGuess)){
                strikes -= 1;
            }else{
                System.out.println("Good Guess!");
                if(toGuess.length() - toGuess.replace(myGuess,"").length() == 1){
                    printOut.set((toGuess.indexOf(myGuess)),myGuess);
                }else{
                    int count = toGuess.length() - toGuess.replace(myGuess,"").length();
                    int start = -1;
                    int index;
                    for(int x = 0; x < count; x++){
                        index = toGuess.indexOf(myGuess, start+1);
                        printOut.set(index,myGuess);
                        start = index;
                    }
                }
            }
            if(strikes == 0){
                System.out.println("You Lose!\nThe Word Was " + toGuess);
            }else{
                if(!checkWin()){
                    guess();
                }else{
                    System.out.println("You Won!\nThe Word Was " + toGuess);
                }
            }
        }
    }

    private boolean checkWin(){
        for(String x : printOut){
            if(x.equals("_")){
                return false;
            }
        }
        return true;
    }
}