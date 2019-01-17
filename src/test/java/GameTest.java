import Behaviours.CannotAttack;
import Behaviours.IAttack;
import Behaviours.ICannotHeal;
import Behaviours.PhysicalAttack;
import Characters.Enemy;
import Characters.FantasyCharacter;
import Characters.Fighter;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private Fighter fighter;
    private Enemy enemy;
    private PhysicalAttack physicalAttack;
    private ICannotHeal cannotHeal;
    private Game game;
    private ArrayList<FantasyCharacter> playableCharacters;

    @Before
    public void before(){
        physicalAttack = new PhysicalAttack();
        cannotHeal = new ICannotHeal();
        fighter = new Fighter("Hero", 10, 0.4, 10, physicalAttack, cannotHeal);
        playableCharacters = new ArrayList<>();
        playableCharacters.add(fighter);
        game = new Game(playableCharacters);
    }

    @Test
    public void canGenerateRoom() {
        game.generateRoom();
        assertEquals(1, game.getRoomCount());
    }


}
