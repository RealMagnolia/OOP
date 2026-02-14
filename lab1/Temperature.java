package lab1;

public class Temperature {
	private double tempValue;
	private char scale;
	
	Temperature(){
		this.tempValue = 0;
		this.scale = 'C';
	}
	
	Temperature(double temp){
		this.scale = 'C';
		this.tempValue = temp;
	}
	
	Temperature(char cOrF){
		this.tempValue = 0;
		this.scale = cOrF;
	}
	
	Temperature(double temp, char cOrF){
		this.tempValue = temp;
		this.scale = cOrF;
	}
	
	public double getC() {
		if(scale == 'F') {
			tempValue = 5 * (tempValue - 32) / 9;
			scale = 'C';
			return tempValue;
		} 
		else return tempValue;
	}
	
	public double getF() {
		if(scale == 'C') {
			tempValue = (9 * (tempValue / 5)) + 32;
			scale = 'F';
			return tempValue;
		} 
		else return tempValue;
	}
	
	public void setVal(double temp) {
		this.tempValue = temp;
	}
	
	public void setScale(char cOrF) {
		this.scale = cOrF;
	}
	
	public void setValAndScale(double temp, char cOrF) {
		this.tempValue = temp;
		this.scale = cOrF;
	}
	
	public char getScale() {
		return scale;
	}
}

