package labyrinth.combat;
import java.util.Scanner;
import labyrinth.entities.*;

public class CombatSystem  {

	public void entityAttacks(LivingEntity attacker, LivingEntity defender) { // senza niente( con le mani )
		if (defender.getHp() <= 0) {
			System.out.println("defender is dead");
		}
			double damageDone = DamageCalculator.calculateGenericDamage(attacker.getStrength(), defender.getDefense());
			defender.takeDamage(damageDone);
	}
	
	public void initiateBattleLoop(){
		
	}
  
}