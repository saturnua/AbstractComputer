package MyPack;

public class Desktop extends Computer {

	String monitor = "Monitor";
	
	Desktop(int powerSuply, int ram, String mainboard, String videocard, String monitor){
		super(powerSuply, ram, mainboard, videocard);
		this.monitor = monitor;
	}

	@Override
	void print() {
		System.out.println("Desktop includes: " + powerSuply + "W powerSuply; " + ram + " RAM; " + "Mainboard " + mainboard + "; Videocard " 
	+ videocard + "; and only desktop have standing separately monitor " + monitor);
		
	}

}
