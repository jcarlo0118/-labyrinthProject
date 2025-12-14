package labyrinth.entities;

import labyrinth.Position;
import labyrinth.combat.CombatSystem;

public class Player extends LivingEntity {
	private CombatSystem combatSystem = new CombatSystem();
	
	public Player(String name, int hp, int maxHp, int strength, int defense, Position position) {
		super(name, hp, maxHp, strength, defense, position);
	}
	
	public void attackEnemy(Enemy enemy) {
		combatSystem.entityAttacks(this, enemy);
	}
	
	public String toString() {
		return "P";
	}
}
