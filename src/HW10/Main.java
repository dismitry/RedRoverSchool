package HW10;

public class Main {
    public static void main(String[] args) {

    Manager manager = new Manager();
    manager.setBaseSalary(1000);
    manager.setNumberOfSubordinates(10);

    System.out.println(manager.getSalary());

    Director director = new Director();
    director.setBaseSalary(1000);
    director.setNumberOfSubordinates(10);

    System.out.println(director.getSalary());

    EmployeeUtils employeeUtils = new EmployeeUtils();
    Manager result = employeeUtils.getMinNumberOfSubordinates(new Manager[]{manager, director});
    System.out.println(result.getNumberOfSubordinates());
    }
}
