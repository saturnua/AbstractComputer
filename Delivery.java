package MyPack;


public class Delivery extends AdditionalService{
    Computer computer;
    public Delivery(Computer computer){this.computer = computer;}
    @Override
    public void powerSwitch() {

    }

    @Override
    public String toString() {
        return computer.toString() + ", With delivery ";
    }
}
