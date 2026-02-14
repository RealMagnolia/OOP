package lab1;

public class Data {
	private int cnt;
	private double sum;
	private double max;
	
	public void add(int val) {
		cnt++;
		sum += val;
		
		if(val > max) max = val;
	}
	
	public double getAvg() {
		if(cnt == 0) return 0;
		return sum/cnt;
	}
	
	public double getMax() {
		return max;
	}
	
	public boolean hasData() {
		return cnt > 0;
	}
}

//1ya zadacha