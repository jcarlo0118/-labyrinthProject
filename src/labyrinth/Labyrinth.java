package labyrinth;
//import labyrinth.entities.*;

import java.util.ArrayList;

import labyrinth.entities.*;

public class Labyrinth {
	private int rows, columns;
	private Room[][] grid;
	private ArrayList<Enemy> enemies;
	
	private final Room start;//
	private final Room end;//
	
	public Labyrinth(int rows, int columns, Room start, Room end) {
		this.rows = rows <= 0 ? 1 : rows;
		this.columns = columns <= 0 ? 1 : columns;
		this.start = start;
		this.end = end;
		//this.end.setPosition(new Position(rows - 1, columns - 1));
		
	}
	
	public Room[][] createRooms() {
		Room[][] grid = new Room[this.rows][this.columns];
		int x,y;
		for (x = 0; x < grid.length; x++) {
			for (y = 0; y < grid[x].length; y++) {
					grid[x][y] = new Room(new Position(x,y));
			}	
		}
		return grid;			
	}
	
	//generate enemies
	
	//place enemies
	
	//create enemies
	
	//place player
	
	//get enemies so they can be saved in game state
	
	//get player  so they can be saved in game state

	public int getRows() {return rows;}
	public void setRows(int rows) {this.rows = rows;}
	public int getColumns() {return columns;}
	public void setColumns(int columns) {this.columns = columns;}
	
	public Room getStart() {return start;}
	public Room getEnd() {return end;}
	
	public Room[][] getGrid() {return this.grid;}
	public void setGrid(Room[][] newGrid) {this.grid = newGrid;}
}
