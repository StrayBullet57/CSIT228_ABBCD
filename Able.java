class Able extends Character{
    Able(){
        super(50,5,2,1,"Able", "Flower Petals", "Healing Light", "Wind Shield");//HP,MP,ATK,DEF,Name
    }
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
    }

    @Override
    public void skillTwo(Character enemy, Character player) {
        System.out.println(player.getName()+" used Healing Light");
    }
    
    @Override
    public void skillThree(Character enemy, Character player) {
        System.out.println(player.getName()+" used Wind Shield");
    }
}