package lab2.problem2;

public class Rook extends Piece {
	public Rook(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        if (position.equals(target)) return false;
        return position.getRow() == target.getRow() || position.getCol() == target.getCol();
    }
}
