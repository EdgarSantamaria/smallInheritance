
public class CruiseShip extends Ship{
	private int max;
	
	public CruiseShip(String n, int y, int m) {
		super(n, y);
		this.max  = m;
	}
	
	public String toString() {
		return "Cruise " + super.toString() + " | Passengers: " + this.max;
	}
	
}
