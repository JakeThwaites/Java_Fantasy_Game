package Characters;

import Behaviours.IAttack;
import Behaviours.IHeal;

public class Fighter extends FantasyCharacter{

    public Fighter(String name, int maxHitPoints, double defence, int attackPoints, IAttack attackBehaviour, IHeal healBehaviour) {
        super(name, maxHitPoints, defence, attackPoints, attackBehaviour, healBehaviour);
    }
}
