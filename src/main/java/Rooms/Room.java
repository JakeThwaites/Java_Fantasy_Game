package Rooms;


import Characters.Enemy;
import Characters.FantasyCharacter;
import Items.Item;

import java.util.ArrayList;

public class Room {
    private ArrayList<FantasyCharacter> playableCharacters;
    private ArrayList<Enemy> enemiesInRoom;
    private ArrayList<Item> itemsInRoom;

    public Room(ArrayList<FantasyCharacter> playableCharacters) {
        this.playableCharacters = playableCharacters;
        this.enemiesInRoom = new ArrayList<>();
        this.itemsInRoom = new ArrayList<>();
    }

    public void addEnemy(Enemy enemy){
        enemiesInRoom.add(enemy);
    }

    public void addItem(Item item){
        itemsInRoom.add(item);
    }

    public ArrayList<FantasyCharacter> getPlayableCharacters() {
        return playableCharacters;
    }

    public ArrayList<Enemy> getEnemiesInRoom() {
        return enemiesInRoom;
    }

    public ArrayList<Item> getItemsInRoom() {
        return itemsInRoom;
    }
}
