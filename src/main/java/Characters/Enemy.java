package Characters;

import Behaviours.IAttack;
import Behaviours.IHeal;
import Items.Item;

import java.util.ArrayList;

public class Enemy extends FantasyCharacter{

    public Enemy(String name, int maxHitPoints, double defence, int attackPoints, IAttack attackBehaviour, IHeal healBehaviour) {
        super(name, maxHitPoints, defence, attackPoints, attackBehaviour, healBehaviour);
    }




}
