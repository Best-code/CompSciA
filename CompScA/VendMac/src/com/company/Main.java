package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	 Vender vend = new Vender();
	 System.out.println(vend.selection());

    }
}
class Item{
    String name;
    double price;
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
}
class Vender{
    Item[][] C = {
            {new Item("   Kit kat", 0.75), new Item("              Gum", 1), new Item("      Skittles", 2)},
            {new Item("  Snickers", 1.5), new Item("               M&M", 1.75), new Item("      Reese's", .25)},
            {new Item("Starbursts", .5), new Item("           Doritos", .5), new Item("       Herhsey", .75)},
            {new Item(" Milky-Way", 1.25), new Item("  Three-Musketeer", 1.5), new Item("   Junior Mint", 1.5)},
            {new Item(" Honey Bun", 1.5), new Item("              Coke", .75), new Item("  Fruit-Snack", 1)}
    };
    public Vender() {
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 3; y++){
                System.out.print(C[x][y].name + " - " + C[x][y].price);
            }
            System.out.println("\n");
        }
    }
    public String selection(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select the Column your item is in (1-3)\n");
        int two = sc.nextInt();
        if(two > 3 || two < 1){
            while(two > 3 || two < 1){
                System.out.println("Please Select the Column your item is in (1-3)\n");
                two = sc.nextInt();
            }
        }
        System.out.println("Please Select the Row which your item is in (1-5)\n");
        int one = sc.nextInt();
        if(one > 5 || one < 1){
            while(one > 5 || one < 1){
                System.out.println("Please Select the Row your item is in (1-5)\n");
                one = sc.nextInt();
            }
        }
        System.out.println("You would like to buy a " + C[one-1][two-1].name.strip() + " for $" + C[one-1][two-1].price+".");
        System.out.println("Insert your money now please.");
        double money = sc.nextDouble();
        if(money > 2){
            while(money > 2){
                System.out.println("We can not accept more than $2, please try again. Here is your change: " + money);
                money = sc.nextDouble();
            }
        }
        if(money > C[one-1][two-1].price){
            return("Thank you have a good day. Here is your change: " + (money - C[one-1][two-1].price));
        }else if(money == C[one-1][two-1].price){
            return("Thank yoo have a good day.");
        }else{
            return("This is not enough money sorry. Here is your change: " + money);
        }
    }
}
