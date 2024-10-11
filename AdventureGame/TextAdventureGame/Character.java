
package TextAdventureGame;
import java.util.Scanner;

public class Character {
    String name, playerClass, choice;
    int hp, mp;

    Scanner sc = new Scanner(System.in);

    Character(String name, String playerClass, String choice, int hp, int mp ){
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
                        " Skills: \n >> Regression[5/5]: Upon death, you have the ability \n    to go back in one specific time frame.[more] \n" + //
                        "\n" + //
                        " >> Ressurection[1/1]: You have the ability to \n    ressurect from the dead once.[more] \n" + //
                        "\n" + //
                        " >> Omnisicient Eye[Special]: You have the \n    ability to see the target's status window. \n" + //
                        "\n" + //
                        "+=====================================================+");
        sc.nextLine();











    }

}


