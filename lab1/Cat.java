package lab1;

public class Cat {
	private static int numOfKittens;
	private final String name;
	private Color color;
	
	{
		numOfKittens++;
	}
	
	Cat(Color color){
		this.name = "Myshyq";
		this.color = color;
	}
	
	Cat(String name, Color color){
		this.name = name;
		this.color = color;
	}
	
	public int getNumOfKittens() {
		return numOfKittens;
	}
	
	public String getName() {
		return name;
	}
	
	public Color getColor() {
		return color;
	}
	
}
