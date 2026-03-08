class Able extends Character{
    Able(){
        super(50,5,2,1,"Able", "Flower Petals", "Healing Light", "Wind Shield");//HP,MP,ATK,DEF,Name
    }
    // added skill strings- ray🥺🙏
    @Override
    public void whenPicked(){
        System.out.println(getName()+": Let's goo!");
    }
    
    @Override
    public void whenDefeated() {
        System.out.println(getName()+": I tried my best!");
    }

    @Override
    public void whenVictory(){
        System.out.println(getName()+": Rock and roll!");
    }

     @Override
    public void skillOne(Character enemy, Character player) {
        System.out.println(player.getName()+" used Flower Petals");
        enemy.setHP(enemy.getHP()-(player.calculateDamage()*2)-enemy.getDEF()); // multiplier placeholders - ray
    }

    @Override
    public void skillTwo(Character enemy, Character player) {
        System.out.println(player.getName()+" used Healing Light");
        player.setHP(player.getHP()+player.calculateHeal());
    }
    
    @Override
    public void skillThree(Character enemy, Character player) {
        System.out.println(player.getName()+" used Wind Shield");
        player.setDEF(getDEF()+1);
    }
}