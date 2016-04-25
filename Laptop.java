package MyPack;

public class Laptop extends Computer {
	String accesories = "bag";

	Laptop(int powerSuply, int ram, String mainboard, String videocard, String bag) {
		this.powerSuply = powerSuply;
		this.ram = ram;
		this.mainboard = mainboard;
		this.videocard = videocard;	
		this.accesories = bag;

		turnOnComputer  = new TurnOnComputerWithLaptopCase();
	}

	@Override
	public void powerSwitch() {

	}
	@Override
	public String toString() {
	        return "Laptop includes: " + powerSuply + "W powerSuply; " + ram + " RAM; " + "Mainboard " + mainboard + "; Videocard " 
					+ videocard + "; and only laptop have " + accesories + " for its carry";
	}
}
