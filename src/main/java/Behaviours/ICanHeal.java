package Behaviours;
import Characters.FantasyCharacter;

public class ICanHeal implements IHeal {

    public void heal(FantasyCharacter character, int healPoints){
        character.addHitPoints(healPoints);
    }
}
