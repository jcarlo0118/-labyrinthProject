package labyrinth;
import labyrinth.entities.*;

public class Labyrinth {
	private int height, width;
	private int[][] grid;
	
	
	
	
	public int[][] getGrid() {
		return this.grid;
	}
	public void setGrid(int height, int width) {
		int[][] rooms = new int[height][width];	
	}
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	
	
}
