package lab2.problem1;

public class LibraryItemTest {
	public static void main(String [] args) {
		Book firstBook = new Book("The Shining", "Stephen King", 1977, 210);
	    Book secondBook = new Book("The Alchemist ", "Paulo Coelho", 1988, 288);
	    Book thirdBook = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997, 400);
	
	    System.out.println(firstBook);
	    System.out.println(secondBook);
	    System.out.println(thirdBook);
	}
}
