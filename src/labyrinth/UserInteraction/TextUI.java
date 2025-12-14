package labyrinth.UserInteraction;
import java.util.InputMismatchException;

import labyrinth.*;
import labyrinth.entities.LivingEntity;

public class TextUI {
	public void displayBattleInitiation() { }
	public void displayMenu() { }
    public void displayAttack() { }
    
    public static void displayWelcomeScreen() {
    	System.out.println("-----------------------------------------");
        System.out.println("|                                       |");
        System.out.println("|              W E L C O M E            |");
        System.out.println("|                                       |");
        System.out.println("|           ╔═════╦═╗ ╔═╦═════╗         |");
        System.out.println("|           ║ ╔═╗ ║ ║ ║ ║ ╔═╗ ║         |");
        System.out.println("|           ║ ║ ║ ╚═╝ ╚═╝ ║ ║ ║         |");
        System.out.println("|           ║ ╚═╝ ╔═╦═╗ ╔═╝ ║ ║         |");
        System.out.println("|           ║ ╔═══╝ ║ ║ ╚═══╝ ║         |");
        System.out.println("|           ╚═╝     ╚═╝     ╔═╝         |");
        System.out.println("|                                       |");
        System.out.println("|            LABYRINTH R P G            |");
        System.out.println("|                                       |");
        System.out.println("|         Press ENTER to start...       |");
        System.out.println("|                                       |");
        System.out.println("-----------------------------------------");
	}
    
    public static void displayMainMenu() {
    	System.out.println("=========================================");
        System.out.println("             ** MAIN MENU ** ");
        System.out.println("=========================================");
        System.out.println("| 1. Start Adventure                    |");
        System.out.println("| 2. Configure Settings                 |");
        System.out.println("| 4. battle simulation	                |");
        System.out.println("| 3. Exit (Terminate Game)              |");
        System.out.println("=========================================");
        System.out.print("Enter your choice (1-3): ");
    }
    
    public static void battleMenu() {
  	  System.out.println("What will the player do?");
  	  
  	  System.out.println("1.attack 2.run");
    }
    
    public static void displayEnterName() {
    	System.out.println("Enter your character's name: ");
    }
    
    public static void displayDefenderHealth(LivingEntity defender) {
    	System.out.println("Defender's health" + Math.floor(defender.getHp()));
    	
    }
    
    public static void displayAttackerHealth(LivingEntity attacker) {
    	System.out.println("Attacker's health" + Math.floor(attacker.getHp()));
    	
    }
    
	public static void displayDefenderIsDead() {
		System.out.println("Defender is dead");
		
	}
    
    public static void clearScreen() {
        System.out.print("\033\143");
        System.out.flush();
    }
    
    
    
    /*from labyrinth-game, prof. dario latini*/
    public static void printLabyrinth(Labyrinth l) {
    	int rows = l.getRows();
    	int columns = l.getColumns();
    	
        for (int r = 0; r < rows; r++) {

            // each cell is 5 text lines tall
            for (int line = 0; line < 5; line++) {

                for (int c = 0; c < columns; c++) {

                    boolean northDoor = r > 0;
                    boolean southDoor = r < rows - 1;
                    boolean westDoor  = c > 0;
                    boolean eastDoor  = c < columns - 1;

                    switch (line) {
                        case 0 -> {
                            System.out.print("====");
                            System.out.print(northDoor ? "-" : "=");
                            System.out.print("====");
                        }
                        case 1, 3 -> {
                            System.out.print("║       ║");
                        }
                        case 2 -> {
                            System.out.print(westDoor ? "|  " : "║  ");
                            System.out.print(" M ");
                            System.out.print(eastDoor ? "  |" : "  ║");
                        }
                        case 4 -> {
                            System.out.print("====");
                            System.out.print(southDoor ? "-" : "=");
                            System.out.print("====");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}

