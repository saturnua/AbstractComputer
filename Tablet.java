package MyPack;

public class Tablet extends Computer{
	String stilus = "stilus";

	Tablet(int powerSuply, int ram, String mainboard, String videocard, String stilus) {
		super(powerSuply, ram, mainboard, videocard);
		this.stilus = stilus;
	}

	@Override
	void print() {
		System.out.println("Tablet includes: " + powerSuply + "W powerSuply; " + ram + " RAM; " + "Mainboard " + mainboard + "; Videocard " 
				+ videocard + "; and only tablet have " + stilus + " to help working with it");	
		
	}

}
