class Able extends Character implements Dialogues{
    Able(){
        super(10,5,2,1,"Able");//HP,MP,ATK,DEF,Name
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
}