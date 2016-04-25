package MyPack;

public class Tablet extends Computer {
	
	String accesories = "stilus";

	Tablet(int powerSuply, int ram, String mainboard, String videocard, String stilus) {
		this.powerSuply = powerSuply;
		this.ram = ram;
		this.mainboard = mainboard;
		this.videocard = videocard;	
		this.accesories = stilus;

		turnOnComputer  = new TurnOnComputerOnDoubleScreenTap();
	}

	@Override
	public void powerSwitch() {
	}
	@Override
	public String toString() {
	        return "Tablet includes: " + powerSuply + "W powerSuply; " + ram + " RAM; " + "Mainboard " + mainboard + "; Videocard " 
					+ videocard + "; and only tablet have " + accesories + " to help working with it";
	}
}
