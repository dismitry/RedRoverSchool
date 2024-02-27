package HW9.plates;

public class LicensePlateMaker {
    private String prefix;
    private int lastUsedNumber;

    public LicensePlateMaker(String prefix, int lastUsedNumber){
        this.prefix = prefix;
        this.lastUsedNumber = lastUsedNumber;
    }

    public LicensePlate makeNextPlate(){
        int nextNumber = lastUsedNumber +1;
        lastUsedNumber = nextNumber;
        return new LicensePlate(prefix + "-" + nextNumber);
    }
}
