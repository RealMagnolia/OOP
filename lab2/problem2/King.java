package lab2.problem2;

public class King extends Piece {
	public King(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        if (position.equals(target)) return false;
        int dx = Math.abs(position.getRow() - target.getRow());
        int dy = Math.abs(position.getCol() - target.getCol());
        return dx <= 1 && dy <= 1;
    }
}
