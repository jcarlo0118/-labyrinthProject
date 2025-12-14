package labyrinth;
import java.util.ArrayList;
import labyrinth.entities.*;

public class Room {
	private ArrayList<LivingEntity> entities;
	
	public int getEntitiesNumber() {
		return this.entities.size();
	}
	
	/* checks if there is one or more entity in a room*/
	public boolean checkRoomStatus() {
		if (getEntitiesNumber() > 1) {return true;} 
		return false;
	}
}
