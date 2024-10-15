package test;

import java.util.Scanner;

public class Character {

    String name;
    int hp, mp;
    boolean enterNest = false, tryAgain = false, enterDoor = false, key = false;

    Scanner sc = new Scanner(System.in);

    Character(){
        this.name = "";
        this.hp = 500;
        this.mp = 100; 
        this.enterNest = false;
        this.enterDoor = false;
    }

    Character(String name, int hp, int mp, boolean enterNest, boolean enterDoor) {
        this.name = name;
        this.hp = hp;
        this.mp = mp; 
        this.enterNest = enterNest;
        this.enterDoor = enterDoor;
    }

    void dungeon() {

        // Added Do-while loop so the question repeats when the inputed choice is invalid.
        do{
            System.out.println();
            System.out.println("You are now entering a dungeon with Ron. While entering, you've encountered two paths.");
            System.out.println("1. Choose the left path ");
            System.out.println("2. Choose the right path");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("You've entered a spider nest.");
                    sc.nextLine();

                    /* we don't need the treasure(scanner), theres a more efficient way 
                    which is calling c.treasure(); in main.class below c.dungeon(); */

                    enterNest = true; //to enter the spider nest 
                    tryAgain = false; //declared in every case to avoid infinite do-while loop
                    break;
                case 2:
                    System.out.println();
                    System.out.println("You've entered a path through a mysterious door.");
                    sc.nextLine();

                    enterDoor = true;
                    tryAgain = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Try Again.");
                    sc.nextLine();
                    tryAgain = true;
            }

        } while(tryAgain);

    }

    //Case 1: Enter The Spider Nest
    void spiderNest(){
        do{

            System.out.println();
            System.out.println("[You've encountered a Giant Spider!]");
            sc.nextLine();

            System.out.println();
            System.out.print("How will you attack? \n1. Ambush it \n2. Flee instead \nEnter Your Choice:");
            int choice = sc.nextInt();


            switch(choice){
                case 1:
                    System.out.println();
                    System.out.println("You ambushed the giant spider and killed it on the spot!");
                    sc.nextLine();

                    System.out.println();
                    System.err.println("You've lost some 20 MP from the attack, but you gained a mysterious key which could be useful!");
                    sc.nextLine();

                    mp -= 20;
                    key = true;

                    System.out.println();
                    System.err.println("You're MP is now currently " + mp + ".");
                    sc.nextLine();
                    tryAgain = false;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("While trying to flee, You got trapped into a spider web and got poisoned! You've lost 100 HP.");
                    sc.nextLine();

                    hp -= 100;
                    mp -= 40;

                    System.out.println();
                    System.out.println("With Ron's help, you managed to escape and together decided to attack it head-on. You succesfully killed it but lost 40 MP in the process. \nYour HP is currently " + hp + " and your MP is " + mp + ".");
                    sc.nextLine();

                    System.out.println("After killing the Giant Spider, it dropped a key. You decided to give it to Ron because he helped you.");
                    sc.nextLine();
                    tryAgain = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Try Again.");
                    sc.nextLine();
                    tryAgain = true;
            }

        }while(tryAgain);
       
    }

    void mysteriousDoor(){

        System.out.println();
        System.out.println("You and Ron entered the mysterious door and ended up in a place full of monsters! \nYou both barely escaped unscathed, You lost 300 HP and 40 HP.");
        sc.nextLine();

        hp -= 250;
        mp -= 40;

        System.out.println();
        System.err.println("Your HP is now currently " + hp + " and your MP is " + mp + ".");
        sc.nextLine();

        System.out.println();
        System.out.println("After recovering for a while, You and Ron healed 65 HP and 15 MP.");
        sc.nextLine();

        hp += 65;
        mp += 15;

    }

    void treasure() {
        
        do{

            System.out.println();
            System.out.println(" After venturing for a while, you found two treasure chests! But one of the two was locked.");
            System.out.println("1. Open the first treasure chest");
            System.out.println("2. Try to open the locked chest");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("You opened the treasure chest and earned 20 points of mana!");
                    sc.nextLine();
                    mp += 20;
                    tryAgain = false;
                    break;
                case 2:
                    if(!key){
                        System.out.println();
                        System.out.println("[You do not have the key to this treasure chest.]");
                        sc.nextLine();
                        tryAgain = true;
                    } else if(key){
                        System.out.println();
                        System.out.println("You've earned 100 HP and 25 MP!");
                        sc.nextLine();

                        hp += 100;
                        mp += 25;

                        System.out.println();
                        System.err.println("Your HP is now currently " + hp + " and your MP is " + mp + ".");
                        sc.nextLine();

                        System.out.println();
                        System.err.println("Meanwhile, Ron opened the other treasure chest and got 20 MP. You both were both satisfied and continued your journey.");
                        sc.nextLine();
                        tryAgain = false;
                    }
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Try  Again.");
                    sc.nextLine();
                    tryAgain = true;
            }
        }while(tryAgain);
    }

    void dungeonBoss(){
        System.out.println();
        System.out.println("You and Ron finally found the Dungeon Boss Room.");
        sc.nextLine();

        System.out.println();
        System.out.println("The boss is a giant serpent! with repeated bangs, the serpent smashed everything in it's surroundings, causing a massive earthquake.  ");
        sc.nextLine();

        System.out.println();
        System.out.println("And at the same time, dozens of dozens monsters suddenly appeared! You lost 250 HP while fighting.");
        sc.nextLine();

        hp -= 200;

        if(hp<=0){
            System.out.println(" You've lost all HP.");
            System.out.println("  << Game Over >>");
        } else {
            System.out.println();
            System.out.println("Ron suggested that he take care of the mosters while you take kill the dungeon boss.");
            sc.nextLine();

            System.out.println();
            System.out.println("As Ron took care of the monsters, you poured all your MP in order to kill the boss.");
            sc.nextLine();

            System.out.println();
            System.out.println("The Giant Serpent died and both you and Ron successfully finished the dungeon!");
            sc.nextLine();
        }
    }

}
