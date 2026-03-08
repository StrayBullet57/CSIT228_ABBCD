class Kane extends Character{
    Kane(){
        super(50,5,2,1,"Kane", "Flame Strike", "Shadow Step", "Wind Slash");//HP,MP,ATK,DEF,Name
    }
    // added skill strings- ray🥺🙏
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

    //SKILLS
    @Override
    public void skillOne(Character enemy, Character player) {
        System.out.println(player.getName()+"has used Flame Strike");
        enemy.setHP(enemy.getHP()-(player.calculateDamage()*2)-enemy.getDEF()); // multiplier placeholders - ray
    }

    @Override
    public void skillTwo(Character enemy, Character player) {
        System.out.println(player.getName()+"has used Shadow Step");
        enemy.setHP(enemy.getHP()-(player.calculateDamage()*3)-enemy.getDEF()); // multiplier placeholders - ray
    }
    
    @Override
    public void skillThree(Character enemy, Character player) {
        System.out.println(player.getName()+"has used Wind Slash");
        enemy.setHP(enemy.getHP()-(player.calculateDamage()*4)-enemy.getDEF()); // multiplier placeholders - ray
    }

    
}