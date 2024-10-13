package TextAdventureGame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        System.out.println("<=================[Welcome to the Text Adventure Game!]====================>");
        System.out.println("<=========================[Enter to Continue]==============================>");
        sc.nextLine();

        System.out.println();

        System.out.println("+=============================+");
        System.out.print(" Enter Player Name: ");
        String name = sc.nextLine();
        System.out.println("+=============================+");

        Character c = new Character(name, "Swordsman", 0, 9300,4600);

        System.out.println();

        System.out.println();
        System.out.println("<=================[Prologue: Mission | Enter to Start ]====================>");
        sc.nextLine();

        System.out.println();
        System.out.print(">> King: Hero, the Demon King, thought to be sealed for centuries, has returned. And his forces are threatening to consume our lands.");
        sc.nextLine();

        System.out.println();
        System.out.print(">> King: You must journey into the heart of that cursed land and strike down the Demon King before his armies overwhelm our world.");
        sc.nextLine(); 

        System.out.println();
        System.out.print(">> King: Without you, our kingdom has no hope of survival.");
        sc.nextLine(); 

        System.out.println();
        System.out.print(">> [Hero] " + c.name + ": The Dark Continent... no one returns from there. ");
        sc.nextLine(); 

        System.out.println();
        System.out.print(">> [Hero] " + c.name + ": But if it's for the kingdom, I shall go.");
        sc.nextLine(); 

        System.out.println();
        System.out.print(">> King: You will face great dangers, but we have faith in you. Return victorious, and you will be remembered as the greatest of all.");
        sc.nextLine(); 

        System.out.println();
        System.out.print(">> [Hero] " + c.name + ": I seek no glory, only to protect our people. The Demon King will fall, or I shall die trying.");
        sc.nextLine(); 

        System.out.println();
        System.out.print(">> King: Then go, hero. May the gods guide your blade, and may your heart never falter.");
        sc.nextLine();

        System.out.println();
        System.out.println("[ The hero stood at the kingdom's gates as the first light of dawn crept over the horizon. The quiet whispers of the townspeople filled the air, eyes watching with a mixture of hope and fear. The hero's resolve was clear, even as the weight of the task loomed-venture to the Dark Continent and face the Demon King. ]");
        sc.nextLine();
        System.out.println("[ With a final glance at the castle, the hero mounted their horse and began the long ride. The kingdom slowly disappeared behind, and the path ahead was filled with uncertainty. But there was no turning back now. The journey to the dark continent has begun. ]");
        sc.nextLine();
        System.out.println();

        System.out.println("<=================[Chapter 1: The Journey | Enter to Start ]====================>");
        sc.nextLine();

        System.out.println();
        System.out.print("|| As you venture towards your destination, you decided to stop by an inn. Before resting, you decided to check your status window. ");
        sc.nextLine();

        c.statusWindow(); //Shows the player the status window

        System.out.println();

        c.skillWindow(); //Shows the player the skill window

        /* 
        System.out.println();
        System.out.print("|| After checking your status window, you've pondered for a long time before ultimately deciding to place the spawnpoint of the [Regression] skill here. \n ");
        sc.nextLine();

        System.out.println();
        System.out.print("+==================[System Notification]====================+ \n" + //
                        "\n" + // 
                        "     <<Regression[Skill]: 'Time Anchor' has been set. >> \n" + //
                        "\n" + //
                        "+============================================================+");
        sc.nextLine();
        */

        System.out.println();
        System.out.print("|| After settling in, you finally went to rest. ");
        sc.nextLine();

        System.out.println();
        System.out.print("...");
        sc.nextLine();

        System.out.println();
        System.out.print(">> Unknown: Help!");
        sc.nextLine();

        System.out.println();
        System.out.print(">> " + c.name + ": !");
        sc.nextLine();

        //for the regression skill , the do-while loop starts here.

        System.out.println();
        System.out.print("|| You woke up after suddenly hearing a commotion outside.");
        sc.nextLine();

        System.out.println();
        System.out.print("|| You rushed downstairs and saw mosters in the distance-ready to attack!");
        sc.nextLine();

        // System Notification
        String quest = "<< ! [New] Side Quest: Kill all the Demonic Monsters attacking the Inn. >> ";
        c.systemNotification(quest);

        Quest q = new Quest(name, name, 0, 0, 0, true);

        //the if else statements are seperated to check if the user input is valid. If not, the game ends. idk if this is right either

        if (q.continueGame){
            q.questOne();
        } else {
            c.endGame();
        }
        
        if (q.continueGame){
            q.dialoguOne();
            q.questTwo();
            q.dialogueTwo();
        } else if (!q.continueGame || c.hp < 5500 || c.mp < 2000){
            c.endGame();
        }

        if (q.continueGame){
            q.mainQuest();
        }  else if (!q.continueGame || c.hp < 5500 || c.mp < 2000){
            c.endGame();
        }

        sc.close();
    }

}
