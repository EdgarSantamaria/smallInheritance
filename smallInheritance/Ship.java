

public class Ship {
	//variables
	private String name;
	private int year;
	
	//constructor
	public Ship(String n, int y){
		this.name = n;
		this.year = y;
	}
	
	//accessors and mutators
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//toString method returns ship's name and year
	public String toString() {
		return "Ship Name: " + getName() + " | Year: " + getYear();
	}
	
}
