package labyrinth.combat;
/*
 */
public class DamageCalculator {
	
	public static double calculateGenericDamage(double strength, double difesa) {
		/*calcola il danno attraverso la formula x = strength * ( 100 / (100 + defense) )
		 * rendimento decrescente
		 * - evita l'invincibilità, attacker puo sempre fare danno al defender anche se è 0.0123 d danno
		 * - danno calcolato attraverso il percentuale, 10 di difesa -> 9.1% di protezione
		 */
		return strength * (100 / (100  + difesa));
	}
}
