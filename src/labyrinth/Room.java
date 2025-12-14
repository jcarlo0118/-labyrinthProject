package labyrinth;
import java.util.ArrayList;
import labyrinth.entities.*;

public class Room {
	private ArrayList<LivingEntity> entities;
	private Position position;
	/*
	 * if this room will be in a matrix use Y as well
	 * otherwise only use X if it is a one dimensional array
	 */
	public Room(Position position) {
		this.position = position;
	}
	
	public int getEntitiesNumber() {
		return this.entities.size();
	}
	
	/* checks if there is one or more LivingEntity in a room*/
	public boolean checkRoomStatus() {
		if (getEntitiesNumber() > 1) {return true;} 
		return false;
	}

	public Position getPosition() {return position;}
	public void setPosition(Position position) {this.position = position;}
}
