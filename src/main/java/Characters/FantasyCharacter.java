package Characters;
import Behaviours.*;
import Items.*;

import java.util.ArrayList;

public abstract class FantasyCharacter {
    private String name;
    private int hitPoints;
    private double defence;
    private int attackPoints;
    private ArrayList<Item> inventory;
    private IAttack attackBehaviour;
    private IHeal healBehaviour;
    private int maxHitPoints;

    public FantasyCharacter(String name, int maxHitPoints, double defence, int attackPoints, IAttack attackBehaviour, IHeal healBehaviour) {
        this.name = name;
        this.hitPoints = maxHitPoints;
        this.maxHitPoints = hitPoints;
        this.defence = defence;
        this.attackPoints = attackPoints;
        this.inventory = new ArrayList<>();
        this.attackBehaviour = attackBehaviour;
        this.healBehaviour = healBehaviour;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMaxHitPoints(){
        return maxHitPoints;
    }

    public void addHitPoints(int hitPoints){
        this.hitPoints += hitPoints;
        if (this.hitPoints > maxHitPoints){
            this.hitPoints = maxHitPoints;
        }
    }

    public void removeHitPoints(int hitPoints){
        this.hitPoints -= hitPoints;
        if (this.hitPoints < 0) {
            this.hitPoints = 0;
        }
    }

    public double getDefence() {
        return defence;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public IAttack getAttackBehaviour() {
        return attackBehaviour;
    }

    public IHeal getHealBehaviour() {
        return healBehaviour;
    }

    public void attack(FantasyCharacter target) {
        attackBehaviour.attack(target, this.attackPoints);
    }

    public void heal(FantasyCharacter character, int hitPoints) {
        getHealBehaviour().heal(character, hitPoints);
    }
}
