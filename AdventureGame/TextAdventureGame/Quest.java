package TextAdventureGame;
import java.util.Scanner;

public class Quest extends Character {

    public boolean continueGame, itemClaimed;
    String quest;


    Quest(String name, String playerClass, int choice, int hp, int mp, boolean continueGame) {
        super(name, playerClass, choice, hp, mp);
        this.continueGame = continueGame;
    }

    public boolean isContinueGame() {
        return continueGame;
    }

    Character c = new Character(name, playerClass, choice, 10000, 5000);



    Scanner sc = new Scanner(System.in);

    void questOne(){

        String enemy1 = "planning to ambush you";
        
        System.out.println();
        System.out.print("|| A large Demonic Centataur is rapidly advancing to your way!");
        sc.nextLine();

        System.out.println();
        System.out.println(">> What will you do? \n 1. Attack the Demonic Centataur with a [Slash Strike]. (Consumes 100 MP) \n 2. Move aside and dodge it ");
        System.out.print("Enter Your Choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println();
                System.out.println( "|| Swish! You pulled out your sword and slashed the Demonic Centataur in half, immediately killing it on the spot. <<-220 MP>> ");
                System.out.println();
                c.mp -= 220;
                enemy1 = "planning to ambush you ";
                continueGame = true;
                break;
            case 2:
                System.out.println();
                System.out.println("|| You moved aside to dodge the Demonic Centataur. It then ended up crashing into the inn's entrance. \nYou have yet to pain about the damage when another enemy suddenly ambushed you from behind! << -1210 HP>>");
                System.out.println();
                c.hp -= 1210;
                enemy1 = "who ambushed you ";
                continueGame = true;
                break;
            default:
                c.endGame();
                continueGame = false;
        }

        if(continueGame){

            System.out.print("|| You turned behind and looked at the enemy " + enemy1 + "and ended it with a [Power Strike]. \n" + //
                            "\n");
            sc.nextLine();

            System.out.println("");
            System.out.print("|| Seeing the other enemies gathering in one spot, you decided to deal with them all at once!");
            sc.nextLine();

            System.out.println();
            System.out.print("|| With [Whirlwind Slash], you successfully killed all the enemies.");
            sc.nextLine();
            
            quest = "<< [!] Side Quest: Kill all the Demonic Monsters attacking the Inn. [Completed] >>";
            c.systemNotification(quest);
        }
    
    }

    void dialoguOne(){
        System.out.println();
        System.out.print("|| The people who were in hiding came out and cheered. Meanwhile, you decided to stop staying in the and contine your journey.");
        sc.nextLine();

        System.out.println();
        System.out.print("|| You left the inn and went ahead.");
        sc.nextLine();

        System.out.println();
        System.out.print("|| After a long journey, some battles here and there, and meeting new people, you finally reached the Dark Continent.");
        sc.nextLine();

        System.out.println();
        System.out.print("|| Throughout the journey, you lost and gained some of your HP and MP. ");
        sc.nextLine();

        //I definetely didn't get too lazy to make 5 more quests, and where did these deductions come from? don't know either
        c.hp -= 3256;
        c.mp -= 1610;

        c.statusWindow();

        System.out.println();
        System.out.print("|| After checking your status window, you continued you journey.");
        sc.nextLine();

        System.out.println();
        System.out.print("|| It didn't take long for you to encounter enemies who are trying to stop you from advancing to the palace.");
        sc.nextLine();


    }

    void questTwo(){

        //system notif quest start
        quest = "<< [New] Side Quest: Kill the Highest Duke and the Crown Prince. >>";
        c.systemNotification(quest);

        System.out.println();
        System.out.print(">> " + c.name + ": ...");
        sc.nextLine();

        System.out.println();
        System.out.print(">> " + c.name + ": 'A Duke and  Prince... Their status is second only to the Demon King, I must not let my guard down.' ");
        sc.nextLine();

        System.out.println();
        System.out.print(">> Highest Duke : For you, a human to have come this far, you have my acknowledgement. ");
        sc.nextLine();

        System.out.println();
        System.out.print(">> Crown Prince : You may have been strong enough to survive until now, but your journey ends here! ");
        sc.nextLine();

        System.out.println();
        System.out.print("|| You had no patience to hear any more of their yapping and decided to attack."); //inaantok nako hellp
        sc.nextLine();

        //The special skill was never in the skill window, im too lazy to add it now
        System.out.println();
        System.out.print("1. Attack the Duke with a special skill. (Consumes 800 MP) \n 2. Attack the Crown Prince with a special skill. (Consumes 800 MP) \n Enter Your Choice: "); 
        choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println();
                System.out.print("|| Bwam! You attacked the Duke without warning and the Prince was too stunned to react."); //what kind of attack was that? a slap?
                sc.nextLine();

                System.out.println();
                System.out.print("|| The Duke didn't die, but he ended up being heavily injured.");
                sc.nextLine();

                System.out.println();
                System.out.print(">> Crown Prince: D-despicable! Why would you suddenl-");
                sc.nextLine();

                System.out.println();
                System.out.print("|| Bwam! You did the same to the prince, and he too suffered the same blow.");
                sc.nextLine();
                break;
            case 2:
                System.out.println();
                System.out.print("|| Bwam! You attacked the Crown Prince without warning and he ended up suffering a heavy blow."); 
                sc.nextLine();

                System.out.println();
                System.out.print("|| But the Duke did not stand on ceremony and attacked you!."); 
                sc.nextLine();

                System.out.println();
                System.out.print("|| You tried to shield yourself, but it was too late. <<-2500 HP"); 
                sc.nextLine();

                System.out.println();
                System.out.print("|| You did not backed down and attacked the both of them! "); 
                sc.nextLine();

                System.out.println();
                System.out.print("|| Bam! They both ended up heavily injured."); 
                sc.nextLine();
                break;
            default:
                c.endGame();
                continueGame = false;
        }

        //both choices deducts 800 MP, so it's outside the switch-case
        c.mp -= 800; 

        System.out.println();
        System.out.print(">> " + c.name + ": ...");
        sc.nextLine();

        System.out.println();
        System.out.print("|| After these short exchange of blows, you couldn't help but be speechless."); 
        sc.nextLine();

        System.out.println();
        System.out.print(">> " + c.name + ": '...Are the Duke and Prince really this weak...' "); //Def not because I'm too lazy to drag this on ...
        sc.nextLine();

        System.out.println();
        System.out.print("|| While the were both stunned, you didn't stand by and attacked once again."); 
        sc.nextLine();

        System.out.println();
        System.out.print("|| You and the enemy continued exchanging blows. Until they were both too exhausted of mana to continue. Thus, you ended up winning in the end."); 
        sc.nextLine();

        //system notif quest complete
        quest = "<< [!] Side Quest: Kill the Highest Duke and the Crown Prince. [Completed]";
        c.systemNotification(quest);

    }

    void dialogueTwo(){
        System.out.println();
        System.out.print("|| As you were about to proceed, another notification popped up."); 
        sc.nextLine();

        //the variable shouldn't be named quest this time but its too much trouble to change it
        quest = "<< [!] Mysterious Item [Obtained] : The Duke holds a mysterious item that even the Demon King doesn't know about.>>";

        System.out.println();
        System.out.println(">> Claim the item or no? \n 1. Claim the item. \n 2. Do not claim the item, it may be dangerous."); 
        choice = sc.nextInt();

        switch(choice){
            case 1: 
                itemClaimed = true;
                quest = "<<[!] You have claimed the [Mysterious Item].>>";
                c.systemNotification(quest);

                System.out.println();
                System.out.print("|| You tried to check the item but it couldn't be opened yet."); 
                sc.nextLine();
                break;
            case 2:
                itemClaimed = true;
                quest = "<<[!] The item was no claimed.>>";
            default:
                c.endGame();
                continueGame = false;
        }

        System.out.println();
        System.out.print("|| Putting that matter aside... Now, it was finally time to face the Demon King."); 
         sc.nextLine();

        System.out.println();
    }

    void mainQuest(){
        System.out.println();
        System.out.print("<=================[Epilogue: Kill The Demon King | Enter to Start ]====================>");
        sc.nextLine();

        System.out.println();
        System.out.print("[As the heavy doors of the fortress creaked open, an ominous glow spilled out, illuminating the chamber within. \n At the center stood the Demon King, draped in shadows, his eyes burning with malice. \n His presence was suffocating, an aura of darkness that seemed to suck the very light from the room.]"); 
        sc.nextLine();
        
        System.out.println();
        System.out.println(">> Demon King: Brave Hero, you've come far, but your journey ends here. This realm belongs to me, and you are but a fleeting spark in my shadow.”");
        sc.nextLine();

        System.out.println();
        System.out.print(">> " + c.name + ": 'Deja vu?'");
        sc.nextLine();

        System.out.println();
        System.out.print(">> " + c.name + ": I've faced your darkness, and I will not falter. This ends now!");
        sc.nextLine();

        System.out.println();
        System.out.print("[With a roar that shook the walls, the Demon King summoned dark tendrils that lashed out like whips, \n intent on ensnaring the hero. But the hero, fueled by determination, swung the holy sword, the blade \n glowing brightly as it cut through the darkness.]");
        sc.nextLine();

        System.out.println();
        System.out.print("[The clash of light and shadow reverberated through the chamber, a battle between hope and \n despair. Each strike sent shockwaves of energy, illuminating the dark corners of the fortress. The hero \n fought with all their might, every ounce of strength focused on defeating the embodiment of evil \n that threatened their world.]");
        sc.nextLine();

        System.out.println();
        System.out.print("[As the battle raged on, the hero remembered the faces of those who \n believed in them—those who had suffered under the Demon King's reign. With a final, powerful swing of the sword, the hero \n charged forward, determined to banish the darkness once and for all.]");
        sc.nextLine();

        if(itemClaimed){
            System.out.println();
            System.out.print("[At that moment, the [Mysterious Item] that you claimed suddenly shone brightly and illuminated everything.]");
            sc.nextLine();

            quest = "<<[!] You Have Successfully defeated the demon king!>>";
            c.systemNotification(quest);


            quest = "<< The [Legendary Quest]: Kill The Demon King Has Been Completed. >>";
            c.systemNotification(quest);

            System.out.println();
            System.out.print("<=================[ The End ]====================>");
            sc.nextLine();

            System.out.println();
            System.out.print("Thank you for playing, " + c.name + "!]");
            sc.nextLine();

        } else if(!itemClaimed){
            System.out.println();
            System.out.print("[In that moment, light and darkness collided.]");
            sc.nextLine();

            System.out.println();
            System.out.print("[But light was far too weak, and the darkness overtook everything.]");
            sc.nextLine();

            System.out.println();
            System.out.print("[The Demon King became triumph and evil took over the world.]");
            sc.nextLine();

            System.out.println();
            System.out.print("<< Game Over >> ");
            sc.nextLine();
        }
    }

}
