package mainMethod;
import gameController.GameController;
import labyrinth.UserInteraction.*;
import labyrinth.*;

public class Main {
    public static void main(String[] args) {
    	
    	GameController game1 = new GameController();
    	game1.init();
    	/*int row = 3;
    	int column = 3;
    	Room roomStart = new Room(new Position(0,0));
    	Room roomEnd = new Room(new Position(row - 1, column - 1));
    	
    	Labyrinth l1 = new Labyrinth(row,column, roomStart, roomEnd);*/
    	/*Room[][] gridTest = l1.createRooms();
    	
    	int x;
    	int y; 
    	for ( x = 0; x < gridTest.length ; x++) {
    		System.out.println("\n");
    		for (y = 0; y < gridTest[x].length; y++) {
    			System.out.print("	" + gridTest[x][y]);
    		}
    		
    	}*/
    	
    	//TextUI.printLabyrinth(l1);
    	/*Player p1 = new Player("Jhames", 100, 100, 20, 0);
    	Melma m1 = new Melma();
    	
    	//String.format("%.xf", m1.getHp()) tronca il valore del double, con x a quanti posti decimali vuoi troncare
    	p1.attackEnemy(m1);
    	System.out.println(String.format("%.2f", m1.getHp()));
    	p1.attackEnemy(m1);
    	System.out.println(String.format("%.2f", m1.getHp()));
    	p1.attackEnemy(m1);
    	System.out.println(String.format("%.2f", m1.getHp()));
    	p1.attackEnemy(m1);
    	System.out.println(String.format("%.2f", m1.getHp()));*/
    }
}