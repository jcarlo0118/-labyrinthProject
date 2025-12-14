package labyrinth.entities;

import labyrinth.combat.CombatSystem;

public class Player extends LivingEntity {
	private CombatSystem combatSystem = new CombatSystem();
	
	public Player(String name, int hp, int maxHp, int strength, int defense) {
		super(name, hp, maxHp, strength, defense);
	}
	
	public void attackEnemy(Enemy enemy) {
		combatSystem.entityAttacks(this, enemy);
	}
	
}
