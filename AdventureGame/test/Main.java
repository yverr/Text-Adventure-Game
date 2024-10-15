package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Character c = new Character("", 500, 100, false, false);

        // Added System.out.println(); and sc.nextLine(); in every dialogue line for smoother execution

        
        System.out.println();
        System.out.println("<<======[Text Adventure Game | Enter to Start]=======>>");
        sc.nextLine();

        System.out.println();
        System.out.println("Unknown: Hello! Are you the adventurer who recently arrived in the village?");
        sc.nextLine();

        System.out.println();
        System.out.println("You: Yes I just arrived.");
        sc.nextLine();

        System.out.println();
        System.out.println("Unknown: Then, can I have the honor of knowing your name?");
        sc.nextLine();

        System.out.println();
        System.out.print("Enter Your Name: ");
        c.name = sc.nextLine();

        System.out.println();
        System.out.println(c.name + ": It's nice to meet you, my name is " + c.name);
        sc.nextLine();

        System.out.println();
        System.out.println(c.name + ": And you are?");
        sc.nextLine();

        System.out.println();
        System.out.println("Ron: Hello, " + c.name + "! I'm also a fellow adventurer, my name is Ron!");
        sc.nextLine();

        System.out.println();
        System.out.println("Ron: Are you interested in joining me in venturing the dungeons?");
        sc.nextLine();

        System.out.println();
        System.out.println(c.name + ": Sure, why not?");
        sc.nextLine();

        System.out.println();
        System.out.println("You Joined a Guild! Your total total stats as of now is HP: " + c.hp + " MP: " + c.mp + "!");
        sc.nextLine();

        c.dungeon();
        
        if(c.enterNest) {
            c.spiderNest();
        } 
        
        c.mysteriousDoor();
        
        System.out.println();
        System.err.println("Now, your HP is  " + c.hp + " and your MP is " + c.mp + ". So you both decided to continue ahead.");
        sc.nextLine();

        c.treasure();

        c.dungeonBoss();

        System.out.println();
        System.out.println("You finished the game with " + c.hp + " HP and " + " MP. Congratulations!");
        sc.nextLine();

        System.out.println(" << Thank You For Playing, " + c.name + " >>!");

        sc.close();
        
    }

}
