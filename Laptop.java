package MyPack;

public class Laptop extends Computer{
	String bag = "bag";

	Laptop(int powerSuply, int ram, String mainboard, String videocard, String bag) {
		super(powerSuply, ram, mainboard, videocard);
		this.bag = bag;
	}

	@Override
	void print() {
		System.out.println("Laptop includes: " + powerSuply + "W powerSuply; " + ram + " RAM; " + "Mainboard " + mainboard + "; Videocard " 
				+ videocard + "; and only laptop have " + bag + " for its carry");			
				}	
}
