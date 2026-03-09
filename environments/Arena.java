package environments;

public class Arena{

    private int chosenArena;

    public void setChosenArena(int chosenArena) {

        if(chosenArena == 1 || chosenArena == 2){
            this.chosenArena = chosenArena;
        } 
    }

    public int getChosenArena() {
        return chosenArena;
    }

    public void welcomeMessage(){

        System.out.println("\n~=~=~=~=~=~=WELCOME!~=~=~=~=~=~=\n");
    }

    public void message(){

        System.out.println("\nPick a world to fight in: ");

        System.out.println("\n[1] Volcano Stage");
        System.out.println("[2] Cyber City Stage\n");
    }

    public void greenValley(){

        System.out.println("\n===================================================================================");
        System.out.print("\nTwo players enter, one leaves as the champion. Let the battle begin!\n");
        System.out.println("\n===================================================================================\n");
    }

}