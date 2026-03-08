class Character implements Dialogues{
    private int hp;
    private int mp;
    private final int atk;
    private final int def;
    private final String name;

    Character(int hp, int mp, int atk, int def, String name){
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.def = def;
        this.name = name;
    }
    public void setHP(int hp){ this.hp = hp; }
    public void setMP(int mp){ this.mp = mp; }
    public int getHP(){ return hp; }
    public int getMP(){ return mp; }
    public int getATK(){ return atk; }// Base attack, Anhi ebase ang basic damage; Pag-add lang mog numbers para sa dmg calculation. 🥺🙏
    public int getDEF(){ return def; }// Base defense, E-apil nis damage calculation pls, para naa siyay gamit. 🥺🙏
    public String getName(){ return name; }

    public void attack(Character enemy, Character player){
        enemy.setHP(enemy.getHP() - getATK());
        System.out.println(player.getName() + " beats the shit out of " + enemy.getName() + "!\n");
    }
    public void defend(Character player){
        System.out.println(player.getName() + " defends for the next attack.\n");// Does nothing for now🥺🙏
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
}