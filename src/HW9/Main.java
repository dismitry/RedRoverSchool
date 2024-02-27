package HW9;

import HW9.employees.*;
import HW9.months.MonthUtils;
import HW9.plates.*;

public class Main {
    public static void main(String[] args) {
        Employee jim = new Employee();
        jim.setName("Jim Halper");
        jim.setDailySalary(100.0);
        System.out.println(jim.getSalary(MonthUtils.SUMMER));

        Manager michael = new Manager();
        michael.setName("Michael Scott");
        michael.setDailySalary(100.0);
        michael.setNumberOfSubordinates(5);
        System.out.println(michael.getSalary(MonthUtils.SUMMER));

        LicensePlateMaker nyMaker = new LicensePlateMaker("NY", 1000);
        // LicensePlate plate1 = nyMaker.makeNextPlate();
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
    }
}
