package AdventureGame;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        // Dialogue d = new Dialogue();
        Scanner sc = new Scanner(System.in);
        
        
        Character c1 = new Character("Ron", "Archer", null, 10000, 5000);
        
        System.out.println("<=========================[Enter to Continue]==============================>");
        System.out.println("> Unknown: Howdy! I've heard that an new adventurer arrived in the village! Is it you?");
        sc.nextLine();

        System.out.println("> You: Yes, I just came here.");
        sc.nextLine();

        System.out.println("> Unknown: Great! I'm also a fellow adventurer and I can show you around! ");
        sc.nextLine();

        System.out.println("> " + c1.name + ": Ah, and by the way, the name's Ron! And you?");
        sc.nextLine();

        System.out.print("[<3] Enter Player Name: ");
        String name = sc.nextLine();

        Character c = new Character(name, "Swordsman", "enter", 10000,5000);

        System.out.println("> " + c.name + ": Hello, My name is " + c.name + ", It's nice to meet you.");
        sc.nextLine();

        System.out.println("> " + c1.name + ": Nice to meet you, " + c.name + "!");
        sc.nextLine();

        sc.close();
        // d.();

        }
}