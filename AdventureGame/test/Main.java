package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Char character = new Char("Default Name", "Default Dialogue", 100);
        
        character.dialogue();
        character.dungeon();

        scanner.close();
        
    }

}
