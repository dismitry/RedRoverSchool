package HW10;

public class EmployeeUtils {

    public Employee findEmployeeByName(Employee[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())) {
                return arr[i];
            }
        }
        return null;
    }

    public Employee findEmployeeBySubName(Employee[] arr, String subName) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().contains(subName)) {
                return arr[i];
            }
        }
        return null;
    }

    public int getSalary(Employee[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i].getSalary();
        }
        return sum;
    }

    public Employee getMinSalary(Employee[] arr) {
        Employee result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (result.getSalary() > arr[i].getSalary()) {
                result = arr[i];
            }
        }
        return result;
    }

    public Manager getMinNumberOfSubordinates(Manager[] arr) {
        Manager result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (result.getNumberOfSubordinates() > arr[i].getNumberOfSubordinates()) {
                result = arr[i];
            }
        }
        return result;
    }

    
}
