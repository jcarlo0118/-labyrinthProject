package labyrinth.entities;

import labyrinth.combat.CombatSystem;

public class Enemy extends LivingEntity{
	private CombatSystem combatSystem = new CombatSystem();
	
	public Enemy(String name, double hp, double maxHp, double strength, double defense) {
		super(name, hp, maxHp, strength, defense);
	}
	
	public void attackPlayer(Player player) {
		combatSystem.entityAttacks(this, player);
	}
	
}
