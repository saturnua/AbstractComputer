package MyPack;

public class Main {
	public static void main(String[] args) {
		  
		Desktop desktop = new Desktop(400, 1024, "Asus", "Asus", "NEC");
		   System.out.println(desktop.toString());
		   
		   Laptop laptop = new Laptop(200, 2048, "Acer", "AMD", "Bag");
		   System.out.println(laptop.toString());
		   
		   Tablet tablet = new Tablet(80, 512, "Samsung","Mali", "Stilus");
		   System.out.println(tablet.toString());	    
	}
}
