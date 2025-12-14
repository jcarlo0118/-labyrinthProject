package labyrinth.combat;
import labyrinth.entities.*;
import labyrinth.UserInteraction.*;

public class BattleController {

	private CombatSystem combat = new CombatSystem();
	private UserInput input = new UserInput();
	
	/*init battle should be used when the player encounters an enemy in the the same room*/
	public boolean initBattleLoop(Player player, Enemy enemy) {
		System.out.println("The hero encounters a monster");
		while(player.isAlive() && enemy.isAlive()) {
			TextUI.battleMenu();
			
			int choice = input.selectNumber();
			
			switch(choice) {
			//========================TEMPORARY, FOR TESTING=====================================//
				case 1 -> { 
							System.out.println("The player attacks the enemy");
							combat.entityAttacks(player, enemy); 
							TextUI.displayDefenderHealth(enemy);
							
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							
							System.out.println("\nThe enemy attacks the back!!");
							combat.entityAttacks(enemy, player);
							TextUI.displayAttackerHealth(player);
				}
			//========================TEMPORARY, FOR TESTING=====================================//
				case 2 -> System.out.println("The hero runs away!!"); //(trap choice) the monster chases the hero and the hero dies
				default -> System.out.println("choose a valid option!!");
			}			
		}
		
		return player.isAlive(); // if hero is alive return true and he can proceed to escaping the labyrinth
							  //if false, the hero is dead and it is game over
	}
	
}
