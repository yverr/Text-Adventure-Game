package AdventureGame;
public class Character {
    String name, role, choice;
    int hp, mp;

    Character(String name, String role, String choice, int hp, int mp ){
        this.name = name;
        this.role = role;
        this.choice = choice;
        this.hp = hp;
        this.mp = mp;
    }

    Character(){
        this.name = "";
        this.role = "";
        this.choice = "";
        this.hp = 0;
        this.mp = 0;
    }

}
