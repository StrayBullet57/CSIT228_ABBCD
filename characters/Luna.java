class Luna extends Character {
    public Luna() {
        super();
    }

    @Override
    public String getName() {
        return "Luna";
    }

    // Optional: override skills if you want her to be different
    @Override
    public void skillOne(Character target, Character self) {
        System.out.println(getName() + " uses Moon Slash!");
        target.takeDamage(20); // or whatever damage system you use
    }

    @Override
    public String getSkillOneName() {
        return "Moon Slash";
    }

    @Override
    public void skillTwo(Character target, Character self) {
        System.out.println(getName() + " uses Lunar Shield!");
        self.defend(self); // just as an example
    }

    @Override
    public String getSkillTwoName() {
        return "Lunar Shield";
    }

    @Override
    public void skillThree(Character target, Character self) {
        System.out.println(getName() + " uses Eclipse Strike!");
        target.takeDamage(30);
    }

    @Override
    public String getSkillThreeName() {
        return "Eclipse Strike";
    }
}
