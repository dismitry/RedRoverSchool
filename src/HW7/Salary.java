package HW7;

public class Salary {
    String name;
    String pref;
    int age;
    String sex;     
    double salary;

    static double getSum(Employee[] employeeArray) {
        double result = 0.0;
        for (int i = 0; i < employeeArray.length; i++) {
            result += employeeArray[i].salary;
        }
        return result;
    }
}



// Задача №3

// Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray), 
// метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
