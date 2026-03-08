public interface Action {
    public void attack(Character enemy, Character player);
    public void defend(Character player);
    public void skillOne(Character enemy, Character player);
    public void skillTwo(Character enemy, Character player);
    public void skillThree(Character enemy, Character player);
}
