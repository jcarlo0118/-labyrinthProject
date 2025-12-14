package gameController;
import labyrinth.UserInteraction.*;
import labyrinth.entities.*;
import labyrinth.combat.*;

/* 
 * conterrà i metodi che svolgono il gioco
 * 
 * 
 */
public class GameController {
	private Player player;
	private Enemy enemy;
	private BattleController battleController;
	
	private UserInput input = new UserInput();
	
	
	public void init() {
		TextUI.displayWelcomeScreen();
		
		input.waitForEnter();
		//init.labyrinth();
		//crea mostri e mettili nel labirinto
		createPlayer();
		MainMenu();
	}
	

	public void MainMenu() {
		/*
		 * 
		 * start adventure dovrebbe iniziare il labirinto ma per adesso inizia il combattimento
		 */
		TextUI.displayMainMenu();
        int choice = 0;
        while (true) {
        	choice = input.selectNumber();
        	
        	if ( choice == 1){ 
        		
        	}
        		
        	if ( choice == 2) { 
        		
        	}
        		
        	if ( choice == 3) { 
        		
        	}
        }
	}
	
	public void createPlayer() {
		TextUI.displayEnterName();
		String playerName = input.enterString();
		player = new Player(playerName, 100 ,100 ,20, 0);
	}
}
