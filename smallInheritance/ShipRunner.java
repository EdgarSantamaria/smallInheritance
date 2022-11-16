import java.util.*;
public class ShipRunner {

	public static void main(String[] args) {
		ArrayList<Ship> ships = new ArrayList();
		ships.add(new CruiseShip("Titanic", 1911, 3320));
		ships.add(new CargoShip("Ever Given", 2018, 220940));
		ships.add(new Ship("My Boat", 2022));
		ships.add(new CruiseShip("Mardi Gras", 2020, 6500));
		
		for (int i = 0; i < ships.size(); i++) {
			  System.out.println(ships.get(i).toString());
		}
	}

}
