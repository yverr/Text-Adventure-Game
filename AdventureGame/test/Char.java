package test;

import java.util.Scanner;

public class Char {
    String name, dialogue;
    int mp;

    Char(String name, String dialogue, int mp) {
        this.name = name;
        this.dialogue = dialogue;
        this.mp = mp; 
    }

    void dialogue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unknown: Hello! Are you the adventurer who recently arrived in the village?");
        System.out.println("You: Yes...");
        System.out.println("Unknown: Then, can I have the honor of knowing the name of the famous adventurer?");

        System.out.print("Enter Your name: ");
        name = sc.nextLine();

        System.out.println(name + ": my name is " + name);
        System.out.println(name + ": And you are?");
        System.out.println("Ron: I'm a fellow adventurer, my name is Ron!");
        System.out.println("Ron: Would you like to join me?");
        System.out.println(name + ": Yes, I would like to");

        System.out.println("You Joined The Guild! Your total mp as of now is " + mp + "!");

        sc.close();
    }

    void dungeon() {
        System.out.println("You are now entering a dungeon with Ron. While entering, you've encountered two paths.");
        System.out.println("1. Choose the left path");
        System.out.println("2. Choose the right path");
        System.out.print("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You've entered the spider nest.");
                treasure(scanner);
                break;
            case 2:
                System.out.println("You've entered a path through a mysterious door.");
                treasure(scanner);
                break;
            default:
                System.out.println("Invalid choice. Exiting game.");
                break;
        }
    }

    void treasure(Scanner scanner) {
        System.out.println("You found a treasure!");
        System.out.println("1. Open the box");
        System.out.println("2. Proceed to another path");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You opened the box! You earned 20 points of mana!");
                mp += 20;
                break;
            case 2:
                System.out.println("You proceed to another path and lose 20 mana points!");
                mp -= 20; 
                break;
            default:
                System.out.println("Invalid choice. Exiting game.");
                break;
        }
    }

}
