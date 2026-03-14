package lab2.problem2;

public class PieceTest {
	public static void main(String [] args) {
		Knight knight = new Knight(new Position(4, 4));
	    System.out.println(knight);
	    System.out.println("  Move to (5, 6) [L-shape]:     " + knight.isLegalMove(new Position(5, 6)));  
	    System.out.println("  Move to (6, 5) [L-shape]:     " + knight.isLegalMove(new Position(6, 5)));  
	    System.out.println("  Move to (5, 5) [diagonal]:    " + knight.isLegalMove(new Position(5, 5)));  
	    System.out.println("  Move to (4, 6) [horizontal]:  " + knight.isLegalMove(new Position(4, 6)));  
	    System.out.println();
	}
}
