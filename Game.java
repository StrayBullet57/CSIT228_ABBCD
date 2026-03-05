import java.util.Scanner;
class Game{
    public void start(){//Main Game Loop happens here.🥺🙏
        Scanner scan = new Scanner(System.in);
        
        //Intro intro = new Intro();  Himoi ninyog introduction section.🥺🙏
        //Intro.start();

        int p1, p2;
        int turn = 1, action;
        Character player1;
        Character player2;

        System.out.println("Choose your character.");//Character Creation🥺🙏
        System.out.println("1. Kane");
        System.out.println("2. Able");
        System.out.println("3. ???");
        System.out.println("4. ???");
        System.out.println("5. ???");// Dunno, add lang unsa inyo ganahan, pede rasad malapas og 5 character.🥺🙏 Erase after change.

        System.out.print("Player 1: ");// Player 1 Character Selection🥺🙏
        p1 = scan.nextInt();
        switch(p1){
            case 1 -> player1 = new Kane();
            case 2 -> player1 = new Able();
            default -> { System.out.println("Invalid input, defaulting to Kane.");   player1 = new Kane(); }
        }

        System.out.print("Player 2: ");// Player 2 Character Selection🥺🙏
        p2 = scan.nextInt();
        switch(p2){
            case 1 -> player2 = new Kane();
            case 2 -> player2 = new Able();
            default -> { System.out.println("Invalid input, defaulting to Kane.");   player2 = new Kane(); }
        }

        while(player1.getHP() > 0 && player2.getHP() > 0){// Battle Loop🥺🙏
            System.out.println("Player 1 HP: " + player1.getHP());
            System.out.println("Player 2 HP: " + player2.getHP());

            if(turn == 1){
                System.out.println("Player 1's Turn.");
                System.out.println("[1] Basic Attack, [2] Defend, [3] Skill 1, [4] Skill 2, [5] Skill 3");
                action = scan.nextInt();
                
                switch(action){// Ilisdi Ika himo sa damage calculation class. 🥺🙏
                    case 1 -> player1.attack(player2, player1);
                    case 2 -> player1.defend(player1);
                    // ATTENTION!!! Kung kinsay mocode sa damage calculation, Himoa para naay damage reduction ika attack ni player2/1🥺🙏
                    default -> { System.out.println("Invalid input, Defending.");   player1.defend(player1); }
                }
                turn = 2;
            }

            else if(turn == 2){
                System.out.println("Player 2's Turn.");
                System.out.println("[1] Basic Attack, [2] Defend, [3] Skill 1, [4] Skill 2, [5] Skill 3");
                action = scan.nextInt();
                
                switch(action){// Ilisdi Ika himo sa damage calculation class. 🥺🙏
                    case 1 -> player2.attack(player1, player2);
                    case 2 -> player2.defend(player2);
                    // ATTENTION!!! Kung kinsay mocode sa damage calculation, Himoa para naay damage reduction ika attack ni player2/1🥺🙏
                    default -> { System.out.println("Invalid input, Defending.");   player2.defend(player2); }
                }
                turn = 1;
            }
        }

        //Gameover End = new Gameover(); Himoi ninyo og Game Over class, Mo show kinsa nkadaug or if Tie ba.🥺🙏
        //End.start();

    }
}

