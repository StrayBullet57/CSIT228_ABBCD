class Kane extends Character{
    Kane(){
        super(10,5,2,1,"Kane");//HP,MP,ATK,DEF,Name
    }
    @Override
    public void whenPicked(){
        System.out.println(getName()+": I'm ready to fight!");
    }
    
    @Override
    public void whenDefeated() {
        System.out.println(getName()+": I will return!");
    }

    @Override
    public void whenVictory(){
        System.out.println(getName()+": Hmm, Easy!");
    }
}