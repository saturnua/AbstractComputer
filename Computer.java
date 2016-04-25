package MyPack;

public abstract class Computer {
	int powerSuply;   
	int ram;

	TurnOnComputer turnOnComputer;
	
	String mainboard; 
	String videocard; 

	public abstract void powerSwitch();
    public abstract String toString();

    public void makeComputerOn(){
    	turnOnComputer.turnOn();
    }
	
}

