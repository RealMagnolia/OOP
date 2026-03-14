package lab2.problem2;

public abstract class Piece {
	 protected Position position;

	    public Piece(Position position) {
	        this.position = position;
	    }

	    public Position getPosition() {
	        return position;
	    }

	    public abstract boolean isLegalMove(Position target);

	    @Override
	    public String toString() {
	        return getClass().getSimpleName() + " at " + position;
	    }
}
