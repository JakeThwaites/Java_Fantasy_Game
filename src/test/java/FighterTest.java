import Behaviours.CannotAttack;
import Behaviours.IAttack;
import Behaviours.ICannotHeal;
import Behaviours.PhysicalAttack;
import Characters.Enemy;
import Characters.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {
    private Fighter fighter;
    private Enemy enemy;
    private Fighter pacifist;
    private PhysicalAttack physicalAttack;
    private ICannotHeal cannotHeal;
    private CannotAttack cannotAttack;


    @Before
    public void before(){
        physicalAttack = new PhysicalAttack();
        cannotHeal = new ICannotHeal();
        cannotAttack = new CannotAttack();
        fighter = new Fighter("Hero", 10, 0.4, 10, physicalAttack, cannotHeal);
        enemy = new Enemy("Enemy", 10, 0.3, 10, physicalAttack, cannotHeal);
        pacifist = new Fighter("Hero", 10, 0.4, 10, cannotAttack, cannotHeal);
    }

    @Test
    public void canAttack(){
        fighter.attack(enemy);
        assertEquals(0, enemy.getHitPoints());
    }

    @Test
    public void cannotAttack(){
        pacifist.attack(enemy);
        assertEquals(10, enemy.getHitPoints());
    }
}
