package lab2.problem2;

public class Pawn extends Piece {
	public Pawn(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        int dRow = target.getRow() - position.getRow();
        int dCol = Math.abs(target.getCol() - position.getCol());

        if (dRow == 1 && dCol == 0) return true;

        if (dRow == 1 && dCol == 1) return true;

        return false;
    }
}
