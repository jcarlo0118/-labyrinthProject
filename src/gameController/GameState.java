package gameController;
/*
 * stato del gioco:
 * Scenario: the player encounters an enemy in the same room,
 * 1. a battle loop will be initiated
 * 1a. the game state gets saved
 * 
 * 2. after the battle is over
 * 2a. the player loses: gameover the game gets terminated
 * 2b. the enemy loses: it gets removed from the labyrinth and the arraylist that contains the monster and their positions
 * 
 * 3. the game state loads
 * 
 * 
 */

import java.util.ArrayList;
import java.util.List;

import labyrinth.*;
import labyrinth.entities.*;

public class GameState {
	public Player player;
	public Room[][] grid;
	public Enemy enemy;
	//public List<Enemy> enemy;
	
	public GameState(Player player, Room[][] grid) {
		this.player = player;
		this.grid = grid;
		//this.enemy = new ArrayList<>();
	}
	
	/*public Enemy getEnemyAt(Position pos) {
		for (Enemy e: enemy) {
			if (e.isAlive() && e.getPosition().equals(pos)) {
				return e;
			}
		}
		return null;
	}*/
	
	//========================TEMPORARY, FOR TESTING=====================================//
	public Enemy getSingleEnemy() {
		return this.enemy;
	}
	
	public void setSingleEnemy(Enemy enemy) {
		this.enemy = enemy;
	}
	//========================TEMPORARY, FOR TESTING=====================================//
	
	public Player getPlayer() {
		return this.player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public GameState load() {// to be implemented
		return null;
	}
	
	public GameState save(Player player, Room[][] grid, List<Enemy> enemy) {// to be implemented
		return null;
	}
	
}
