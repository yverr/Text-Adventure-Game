
package TextAdventureGame;
import java.util.Scanner;

public class Character {
    String name, playerClass;
    int choice, hp, mp;

    // Character Level and Title is not included because it is static and already set.  

    Scanner sc = new Scanner(System.in);

    Character(String name, String playerClass, int choice, int hp, int mp ){
        this.name = name;
        this.playerClass = playerClass;
        this.choice = choice;
        this.hp = hp;
        this.mp = mp;
    }

    void statusWindow(){
        System.out.println();
        System.out.print("+=================[Status Window]====================+ \n" + //
                        "\n" + //
                        " Name: " + name + "\n Level: 999 \n Class: " + playerClass + "[Lvl. 99] \n Title: Hero \n HP: "+ hp + "/10000 \n _________ \n MP: " + mp + "/5000 \n ________ \n Active Quest: [Kill the Demon King] \n ------------------------------ \n [ Check Skills ] \n" + //
                        "\n" + //
                        "+====================================================+");
        sc.nextLine();

    }

    void skillWindow(){
        System.out.print("+==================[Skill Window]====================+ \n" + //
                        "\n" + //
                        /* 
                        " Skills: \n >> Regression[5/5]: Upon death, you have the ability \n    to go back in one specific time frame.[more] \n" + //
                        "\n" + //
                        " >> Ressurection[1/1]: You have the ability to \n    ressurect from the dead once.[more] \n" + //
                        "\n" + // 
                          <<--- The Regression and Ressurection Skill will be added in the personal project version --->>
                        */
                        " Skills: \n >> Omnisicient Eye[Special]: You have the \n    ability to see the target's status window. \n" + //
                        "\n" + //
                        " >> Slash Strike[Basic]: A single-target sword attack. \n" + //
                        "\n" + //
                        " >> Power Strike : A charged attack that deals more damage. \n" + //
                        "\n" + // 
                        " >> Whirlwind Slash : A spinning attack that hits multiple enemies around the swordsman. \n A Large AOE Attack. \n" + //
                        "\n" + //
                        "+=====================================================+");
        sc.nextLine();
    }

    void systemNotification(String quest){
        System.out.println();
        System.out.print("+=======================[System Notification]=========================+ \n" + //
                        "\n" + // 
                        quest + "\n" + //
                        "\n" + //
                        "+=====================================================================+");
        sc.nextLine();
    }

    void endGame (){
        System.out.println();
        System.out.println(" [!] You are either too low on mana/hp or your choice is invalid. The Game Over.");
        System.out.println();
    }


}




