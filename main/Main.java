package main;

import environments.Arena;
import environments.CyberCityStage;
import environments.VolcanoStage;
import game.Game;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

       Arena arena = new Arena();
       
       VolcanoStage arena1 = new VolcanoStage();
       CyberCityStage arena2 = new CyberCityStage();

       arena.welcomeMessage();

        arena.message();// Stage Selection🤔🧐

        System.out.print("\nEnter your choice: ");
        int chocie1 = scan.nextInt();

        arena.setChosenArena(chocie1);

        switch (arena.getChosenArena()) { // Conditon for picking arena/world🤔🧐

            case 1:
                System.out.println("You have chosen the Volcano Stage!\n");
                arena1.message();
                break;

             case 2:
                System.out.println("You have chosen the Cyber City Stage!\n");
                arena2.message();
                break;

            default:
                System.out.println("\nDefault: Welcome to Green Valley! Stage.\n");
                arena.greenValley();
                break;
        }

        System.out.print("Enter 1 for PVP: ");// 1 for PVP, 2 for PVE. ! para makacontribute tanan og 3 ka class.🥺🙏
        int choice = scan.nextInt();

        if(choice == 1){

            Game game = new Game();
            game.start();
        } else{// Insert here for PVE or other.🥺🙏
            System.out.println("Invalid input.");
        }
        scan.close();
    }
}
// Members:
// Butngi ninyog emoji ang mga codes, etc. + mga parts na gichange ninyo :D 🥺🙏
// StrayBullet57 = 🥺🙏
// Dogface0518 = 🥺👉👈 
// Heartie123 = 🤓👆 
// Chardy2610 = 🤔🧐
//