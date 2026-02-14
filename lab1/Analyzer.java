package lab1;
import java.util.Scanner;

public class Analyzer {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		Data d = new Data();
		
		while(true) {
			System.out.println("Enter number (Q to quit): ");
			String input = s.nextLine();
			
			if(d.hasData()) {
				System.out.println("Average: " + d.getAvg());
				System.out.println("Maximum: " + d.getMax());
			}
			
			try {
				if(input.equals("Q")) break;
				int val = Integer.parseInt(input);
				d.add(val);
			}
			catch (NumberFormatException e) {
				System.err.println("Incorrect value!");
			}
		}
	}
	
}


//1ya zadacha