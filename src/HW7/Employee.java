package HW7;

public class Employee {
    String name;
    String pref;
    int age;
    String sex;     
    int salary;

    public boolean isSameName(Employee employee) {
        return this.name.equals(employee.name);
    }
}


// Задача №2

// Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата. 
// Класс должен иметь метод isSameName(Employee employee) который возвращает true, 
// если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
