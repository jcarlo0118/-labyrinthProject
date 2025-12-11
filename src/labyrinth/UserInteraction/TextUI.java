package labyrinth.UserInteraction;

public class TextUI {
	public void displayBattleInitiation() { }
	public void displayBattleMenu() { }
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
    
    public static void displayEnterName() {
    	System.out.println("Enter your character's name: ");
    }
}
