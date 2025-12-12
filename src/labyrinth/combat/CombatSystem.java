package labyrinth.combat;

import labyrinth.UserInteraction.TextUI;
import labyrinth.entities.*;

public class CombatSystem  {
	/* osservazione:
	 * conviene controllare anche, se attacker ha hp < 0?
	 * perche se è 0 non puo attaccare proprio e quindi la battaglia non può iniziare.
	 *  Invece se DIVENTA 0 i mostri hanno vinto.
	 *  
	 * da questo osservazione possiamo concludere che dobbiamo separare il controllo 
	 * "come lo fa(attaccare)"
	 * 
	 */
	public void entityAttacks(LivingEntity attacker, LivingEntity defender) { // senza niente( con le mani )
		if (defender.isDead()) {
			TextUI.displayDefenderIsDead();
			return;
		}
			double damageDone = DamageCalculator.calculateGenericDamage(attacker.getStrength(), defender.getDefense());
			defender.takeDamage(damageDone);
	}
	
	public void initiateBattleLoop(){
		
	}
  
}