package game;

import characters.Able;
import characters.Character;
import characters.Kane;
import characters.Luna;
import java.util.Scanner;

public class Game{
    public void start(){
        Scanner scan = new Scanner(System.in);
        
        Intro intro = new Intro(); //added by Bolts = 🥺👉👈 
        intro.start();

        
        int p1, p2;
        int turn = 1, action;
        Character player1;
        Character player2;

        System.out.println("Choose your character.");//Character Creation🥺🙏
        System.out.println("1. Kane");
        System.out.println("2. Able");
        System.out.println("3. Luna");
        System.out.println("4. ???");

        System.out.print("Player 1: ");// Player 1 Character Selection🥺🙏
        p1 = scan.nextInt();
        switch(p1){
            case 1 -> {
                player1 = new Kane();
                player1.whenPicked();
            }
            case 2 -> {
                player1 = new Able();
                player1.whenPicked();
            }
            case 3 -> {
                player1 = new Luna();
                player1.whenPicked();
            }
            default -> { System.out.println("Invalid input, defaulting to Kane.");   player1 = new Kane(); }
        }

        System.out.print("Player 2: ");// Player 2 Character Selection🥺🙏
        p2 = scan.nextInt();
        switch(p2){
            case 1 -> {
                player2 = new Kane();
                player2.whenPicked();
            }
            case 2 -> {
                player2 = new Able();
                player2.whenPicked();
            }
            case 3 -> {
                player2 = new Luna();
                player2.whenPicked();
            }
            default -> { System.out.println("Invalid input, defaulting to Able.");   player2 = new Able(); }
        }


        while(player1.getHP() > 0 && player2.getHP() > 0){// Battle Loop🥺🙏
            System.out.println("Player 1("+player1.getName()+") HP: " + player1.getHP());
            System.out.println("Player 2("+player2.getName()+") HP: " + player2.getHP());

            if(turn == 1){
                System.out.println("Player 1's Turn.");
                System.out.println("[1] Basic Attack\n[2] Defend\n[3] "+player1.getSkillOneName()+"\n[4] "+player1.getSkillTwoName()+"\n[5] "+player1.getSkillThreeName()+"\n");
                action = scan.nextInt();
                
                switch(action){
                    case 1 -> player1.attack(player2, player1);
                    case 2 -> player1.defend(player1);// Does not work!🥺🙏
                    case 3 ->player1.skillOne(player2, player1);
                    case 4 ->player1.skillTwo(player2, player1);
                    case 5 ->player1.skillThree(player2, player1);
                    default -> { System.out.println("Invalid input, Defending.");   player1.defend(player1); }// Defend does not work!🥺🙏
                }
                turn = 2;
            }

            else if(turn == 2){
                System.out.println("Player 2's Turn.");
                System.out.println("[1] Basic Attack\n[2] Defend\n[3] "+player2.getSkillOneName()+"\n[4] "+player2.getSkillTwoName()+"\n[5] "+player2.getSkillThreeName()+"\n");
                action = scan.nextInt();
                
                switch(action){
                    case 1 -> player2.attack(player1, player2);
                    case 2 -> player2.defend(player2);// Does not work!🥺🙏
                    case 3 -> player2.skillOne(player1, player2);
                    case 4 -> player2.skillTwo(player1, player2);
                    case 5 -> player2.skillThree(player1, player2);
                    default -> { System.out.println("Invalid input, Defending.");   player2.defend(player2); }// Defend does not work!🥺🙏
                }
                turn = 1;
            }
        }

        Gameover end = new Gameover(); //added by Bolts = 🥺👉👈 
        end.start(player1, player2);

        scan.close();
    }
}
class Intro {

    public void start() {

        System.out.println("====================================");
        System.out.println("      ⚔ EDEN'S FALL: INFERNUM ⚔");
        System.out.println("====================================");
        System.out.println("Two Warriors enter the arena...");
        System.out.println("Only One will emerge victorious.");
        System.out.println();
        System.out.println("Choose your fighter and prepare");
        System.out.println("for an epic battle!");
        System.out.println("====================================");

        try {
            System.in.read();
        } catch (Exception e) {}

        System.out.println();
    }
}
class Gameover {

    public void start(Character p1, Character p2) {

        System.out.println("\n====================================");
        System.out.println("             GAME OVER");
        System.out.println("====================================");

        if (p1.getHP() <= 0 && p2.getHP() <= 0) {
            System.out.println("The battle ended in a TIE!");
        }
        else if (p1.getHP() <= 0) {
            System.out.println("🏆 Player 2 (" + p2.getName() + ") is the WINNER!");
        }
        else if (p2.getHP() <= 0) {
            System.out.println("🏆 Player 1 (" + p1.getName() + ") is the WINNER!");
        }

        System.out.println("====================================");
        System.out.println("Thanks for playing!");
    }
}