package labyrinth.entities;

import labyrinth.Position;
import labyrinth.combat.CombatSystem;

public class Enemy extends LivingEntity{
	private CombatSystem combatSystem = new CombatSystem();
	
	public Enemy(String name, double hp, double maxHp, double strength, double defense,Position position) {
		super(name, hp, maxHp, strength, defense, position);
	}
	
	public void attackPlayer(Player player) {
		combatSystem.entityAttacks(this, player);
	}
	
	public String toString() {
		return "E";
	}

}
