package lab2.problem2;

public class Knight extends Piece {
	public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        int dx = Math.abs(position.getRow() - target.getRow());
        int dy = Math.abs(position.getCol() - target.getCol());
        return (dx == 1 && dy == 2) || (dx == 2 && dy == 1);
    }
}
