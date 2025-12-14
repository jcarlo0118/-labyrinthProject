package labyrinth.combat;

import labyrinth.UserInteraction.TextUI;
import labyrinth.entities.*;

public class CombatSystem  {
	/* 
	 */
	public void entityAttacks(LivingEntity attacker, LivingEntity defender) { // senza niente( con le mani )
		if (defender.isDead()) {
			TextUI.displayDefenderIsDead();
			return;
		}
			double damageDone = DamageCalculator.calculateGenericDamage(attacker.getStrength(), defender.getDefense());
			defender.takeDamage(damageDone);
	}
  
}