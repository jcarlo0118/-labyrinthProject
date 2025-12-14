package labyrinth;

//import it.edu.iistommasosalvini.labyrinth.Position;

public final class Position {
	public final int row;
	public final int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

  @Override
  public String toString() {
    return "(" + row + ", " + column + ")";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    
    if (!(o instanceof Position)) return false;
    
    Position other = (Position) o;
    return this.row == other.row && this.column == other.column;
  }

}
