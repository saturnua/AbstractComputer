package MyPack;

public class Main {
	public static void main(String[] args) {
		  
		Desktop desktop = new Desktop(400, 1024, "Asus", "Asus", "NEC");
		desktop.makeComputerOn();

		Laptop laptop = new Laptop(200, 2048, "Acer", "AMD", "Bag");
		laptop.makeComputerOn();

		Tablet tablet = new Tablet(80, 512, "Samsung","Mali", "Stilus");
		tablet.makeComputerOn();


	}
}
