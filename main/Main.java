package main;

import game.Game;
import java.util.Scanner;

public class Main{// GAME TITLE suggestion: EDEN'S FALL: Infernum🥺🙏 || List suggestion ||
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1 for PVP: ");// 1 for PVP, 2 for PVE. ! Ambot lng kung mogana inani na style, para ra ni para makacontribute tanan og 3 ka class. Line 13🥺🙏
        int choice = scan.nextInt();

        if(choice == 1){
            Game game = new Game();
            game.start();
        } else{// Insert else if for PVE mode if added.🥺🙏
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
//
//