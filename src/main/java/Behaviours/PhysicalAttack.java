package Behaviours;

import Characters.FantasyCharacter;

public class PhysicalAttack implements IAttack {

    @Override
    public void attack(FantasyCharacter target, int attackPoints) {
        target.removeHitPoints(attackPoints);
    }
}
