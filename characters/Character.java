package characters;
import combat.Action;
import combat.DamageCalculations;
import combat.Dialogues;

public class Character implements Dialogues, Action, DamageCalculations{
    private int hp;
    private int mp;
    private final int atk;
    private int def; // removed string kay naay skills mo increase def - ray 🤓👆
    private final String name;
    private final String skillOneName;
    private final String skillTwoName;
    private final String skillThreeName;
    // added skill strings- ray🤓👆
    Character(int hp, int mp, int atk, int def, String name, String skillOneName, String skillTwoName, String skillThreeName){
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.def = def;
        this.name = name;
        this.skillOneName = skillOneName;
        this.skillTwoName = skillTwoName;
        this.skillThreeName=skillThreeName;
    }
    public void setHP(int hp){ this.hp = hp; }
    public void setMP(int mp){ this.mp = mp; }
    public void setDEF(int def){this.def = def;}
    public int getHP(){ return hp; }
    public int getMP(){ return mp; }
    public int getATK(){ return atk; }// Base attack, Anhi ebase ang basic damage; Pag-add lang mog numbers para sa dmg calculation. 🥺🙏
    public int getDEF(){ return def; }// Base defense, E-apil nis damage calculation pls, para naa siyay gamit. 🥺🙏
    public String getName(){ return name; }
    public String getSkillOneName(){return skillOneName;}
    public String getSkillTwoName(){return skillTwoName;}
    public String getSkillThreeName(){return skillThreeName;}

    @Override
    public void attack(Character enemy, Character player){
        enemy.setHP(enemy.getHP() - getATK());
        System.out.println(player.getName() + " beats the shit out of " + enemy.getName() + "!\n");
    }

    @Override
    public void defend(Character player){
        System.out.println(player.getName() + " defends for the next attack.\n");// Does nothing for now🥺🙏
    }

    @Override
    public void skillOne(Character enemy, Character player){
        System.out.println(player.getName()+" Used skill one");
    }

    @Override
    public void skillTwo(Character enemy, Character player){
        System.out.println(player.getName()+" Used skill Two");
        
    }
    @Override
    public void skillThree(Character enemy, Character player){
        System.out.println(player.getName()+" Used skill Three");
        
    }
    

    @Override
    public void whenDefeated() {
        System.out.println("test");
    }
    @Override
    public void whenPicked() {
        System.out.println("test");
    }
    @Override
    public void whenVictory() {
        System.out.println("test");
    }


    public int calculateHeal(){
               return atk*2;
     }
    public int calculateDefense(){
               return def;
     }
    public int calculateDamage(){
               return atk;
     }
}