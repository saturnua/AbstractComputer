package MyPack;

public class Cart {


    Computer computer = new Desktop(400, 1024, "Asus", "Asus", "NEC");

    Computer computer1 = new AdditionalGuarantees(new Laptop(200, 2048, "Acer", "AMD", "Bag"));

    Computer computer2 = new Delivery(new Tablet(80, 512, "Samsung","Mali", "Stilus"));

    Computer computer3 = new AdditionalGuarantees(new Delivery(new Desktop(400, 1024, "Asus", "Asus", "NEC")));

}
