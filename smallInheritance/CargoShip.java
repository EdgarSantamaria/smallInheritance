
public class CargoShip extends Ship{

	private int tonnage;
	
	public CargoShip(String n, int y, int t) {
		super(n, y);
		this.tonnage = t;
	}
	
	public String toString() {
		return "Cargo " + super.toString() + " | Tonnage: " + this.tonnage;
	}
}
