package Spells;

public class Spell {
    private String name;
    private int damage;

    public Spell(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}