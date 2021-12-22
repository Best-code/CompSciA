package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	SlotMachine s = new SlotMachine();
	s.playGame();
    }
}

class SlotMachine{
    static int winnings = 0;

    static int spin(){
        int won = 0;
        int same = 0;
        Random rand = new Random();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        int z = rand.nextInt(10);
        System.out.println("You Rolled: " + Integer.toString(x) + Integer.toString(y) + Integer.toString(z));
        if(x==y && y==z)
            same = 3;
        else if(x==y || x == z)
            same += 2;
        else if(y==z)
            same += 2;
        if(same==3)
            won+=1000;
        else if(same==2)
            won+=25;
        else
            won-=15;
        System.out.println((won>0) ? "Congratulations, you made " + won : "You lost " + won);
        return won;
    }

    static void playGame(){
        System.out.println("Welcome to the slot machine!");
        System.out.println("Press any key to spin!");
        Scanner s = new Scanner(System.in);
        s.nextLine();
        winnings+=spin();
        spinAgain();
    }

    static void spinAgain(){
        System.out.println("Your new balance is: " + Integer.toString(winnings));
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play again?\nYes (y) or No (n)");
        String play = scan.nextLine();
        if(play.equals("y"))
            winnings += spin();
        else{
            System.out.print("You ended your session with a balance of: " + Integer.toString(winnings));
            return;
        }
        spinAgain();
    }
}