package lab2.problem2;

public class Queen extends Piece {
	 public Queen(Position position) {
	        super(position);
	    }

	    @Override
	    public boolean isLegalMove(Position target) {
	        if (position.equals(target)) return false;
	        int dx = Math.abs(position.getRow() - target.getRow());
	        int dy = Math.abs(position.getCol() - target.getCol());
	        return position.getRow() == target.getRow()
	            || position.getCol() == target.getCol()
	            || dx == dy;
	    }
}
