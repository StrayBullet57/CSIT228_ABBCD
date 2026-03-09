package characters;

public class Luna extends Character {
    public Luna(){ // added by Bolts = 🥺👉👈
        super(60, 8, 3, 1, "Luna", "Moon Slash", "Lunar Shield", "Eclipse Strike"); // HP,MP,ATK,DEF,Name
    }

    @Override
    public void whenPicked(){
        System.out.println(getName()+": The moon guides me!");
    }
    
    @Override
    public void whenDefeated() {
        System.out.println(getName()+": The darkness prevails...");
    }

    @Override
    public void whenVictory(){
        System.out.println(getName()+": I shine bright!");
    }

    @Override
    public void skillOne(Character enemy, Character player) {
        System.out.println(player.getName()+" used "+getSkillOneName());
        enemy.setHP(enemy.getHP()-(player.calculateDamage()*2)-enemy.getDEF());
    }

    @Override
    public void skillTwo(Character enemy, Character player) {
        System.out.println(player.getName()+" used "+getSkillTwoName());
        player.setDEF(player.getDEF() + 2); // boost defense
    }

    @Override
    public void skillThree(Character enemy, Character player) {
        System.out.println(player.getName()+" used "+getSkillThreeName());
        enemy.setHP(enemy.getHP()-(player.calculateDamage()*3));
    }
}
