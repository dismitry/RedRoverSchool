package HW7;

public class MainEmployee {
    public static void main(String[] args) {

        Employee name1 = new Employee();
        name1.name = "Nixon";
        name1.pref = "Mr";
        name1.age = 22;
        name1.sex = "man";
        name1.salary = 1000;

        
        Employee name2 = new Employee();
        name2.name = "Nexon";
        name2.pref = "Mrs";
        name2.age = 23;
        name2.sex = "woman";
        name2.salary = 1200;

        System.out.println(name1.isSameName(name2));

    }
}
