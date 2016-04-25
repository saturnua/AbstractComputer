package MyPack;

public class Desktop extends Computer {

	String monitor = "Monitor";
	
	Desktop(int powerSuply, int ram, String mainboard, String videocard, String monitor){
		this.powerSuply = powerSuply;
		this.ram = ram;
		this.mainboard = mainboard;
		this.videocard = videocard;	
		this.monitor = monitor;

		turnOnComputer  = new TurnOnComputerWithPowerOnButton();
	}
	
	@Override
	public void powerSwitch() {

	}

	@Override
	public String toString() {
	        return "Desktop includes: " + powerSuply + "W powerSuply; " + ram + " RAM; " + "Mainboard " + mainboard + "; Videocard " 
	+ videocard + "; and only desktop have standing separately monitor " + monitor;
	}
}
