package gameController;
import labyrinth.UserInteraction.*;
import labyrinth.entities.*;
import labyrinth.combat.*;
import labyrinth.*;

/* 
 */
public class GameController {
	private Labyrinth labyrinth;
	private BattleController battleController;
	private GameState gameState;
	
	private UserInput input = new UserInput();
	
	
	public void init() {
		TextUI.displayWelcomeScreen();
		
		input.waitForEnter();
		initLabyrinth();
		
		MainMenu();
	}
	
	public void initLabyrinth() {
		System.out.println("Not implemented yet");
		
		//========================TEMPORARY, FOR TESTING=====================================//
		 int row = 3;
		    int column = 3;
		    Room roomStart = new Room(new Position(0,0));
		    Room roomEnd = new Room(new Position(row - 1, column - 1));

		    Labyrinth l1 = new Labyrinth(row, column, roomStart, roomEnd);

		    Enemy e1 = new Enemy("melma", 50, 50, 5, 5, new Position(0,0));
		    Player p1 = new Player("jam", 100, 100, 10, 10, new Position(0,0));

		    this.gameState = new GameState(p1, l1.getGrid());
		    gameState.setPlayer(p1);
		    gameState.setSingleEnemy(e1);

		    // Initialize battle controller here
		    this.battleController = new BattleController();
		  //========================TEMPORARY, FOR TESTING=====================================//


		//crea mostri, player  e mettili nel labirinto
		
		//create game state
		    
		// GameState gs = new GameState(player, l1)
		    
		//run labyrinthLoop(initial game state)
	}

	public void MainMenu() {
		/*
		 * 
		 */
		TextUI.displayMainMenu();
        int choice = 0;
        while (true) {
        	choice = input.selectNumber();
        	
        	switch(choice) {
				case 1 -> initLabyrinth();
				
				case 2 -> System.out.println("Not implemented yet");
				
				case 3 -> { 
							System.out.println("game terminated");
							System.exit(0);
						  }	
				case 4 -> battle();
				
				default -> System.out.println("choose a valid option!!");
        	}	
        }
	}
	
	public void labyrinthLoop(GameState labyrinthState) {
		/* ogni volta che inizia una battaglia lo stato del gioco viene salvato
		 * poi dopo la fine della battaglia lo stato del gioco viene caricato
		 */
		
	}
	
	public void battle() {
		//get enemy
		//boolean battleWinCondition = battleController.initBattle(gameState.getPlayer(), gameState.getEnemyAt(gameState.getPlayer().getPosition()));
		
		//========================TEMPORARY, FOR TESTING=====================================//
		boolean battleWinCondition = battleController.initBattleLoop(gameState.getPlayer(), gameState.getSingleEnemy());
		//========================TEMPORARY, FOR TESTING=====================================//
		
		if (battleWinCondition) {
			System.out.println("The player wins");
			// quel mostro viene rimosso nel labirinto
			//labyrinthLoop();
		} else {
			System.out.println("The player died");
			System.exit(0);
		}
		
	}
}
