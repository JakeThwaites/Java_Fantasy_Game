import Behaviours.IAttack;
import Behaviours.ICannotHeal;
import Behaviours.IHeal;
import Behaviours.PhysicalAttack;
import Characters.Enemy;
import Characters.FantasyCharacter;
import Items.Item;
import Rooms.Room;

import java.util.ArrayList;

public class Game {

    private ArrayList<FantasyCharacter> playableFantasyCharacters;
    private ArrayList<Room> rooms;

    public Game(ArrayList<FantasyCharacter> playableFantasyCharacters) {
        this.playableFantasyCharacters = playableFantasyCharacters;
        this.rooms = new ArrayList<>();
    }

    public ArrayList<FantasyCharacter> getPlayableFantasyCharacters() {
        return playableFantasyCharacters;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int getRoomCount() {
        return rooms.size();
    }

    public void generateRoom() {
        Room room = new Room(this.playableFantasyCharacters);
        if (Math.round(Math.random()) == 1) {
            Item item = new Item("Potion");
            room.addItem(item);
        } else {
            //TODO: make random enemy
            IAttack physicalAttack = new PhysicalAttack();
            IHeal cannotHeal = new ICannotHeal();
            Enemy enemy = new Enemy("Enemy", 10, 0.3, 10, physicalAttack, cannotHeal);
            room.addEnemy(enemy);

        }
        addRoom(room);
    }

    public
}