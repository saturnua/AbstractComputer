package MyPack;

public class AdditionalGuarantees extends AdditionalService{
    Computer computer;

    public AdditionalGuarantees (Computer computer){this.computer = computer;}

    @Override
    public void powerSwitch() {

    }

    @Override
    public String toString() {
        return computer.toString() + ", With Additional Guarantees 3 years!!";
    }
}
