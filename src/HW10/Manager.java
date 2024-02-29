package HW10;

public class Manager extends Worker {
    private int numberOfSubordinates;
    protected int getValue(){
        return 3;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0){
            return super.getSalary();
        } else{
            return (int)(getBaseSalary()*(getNumberOfSubordinates() / 100.0 * getValue()));
        }
    }

    
}
