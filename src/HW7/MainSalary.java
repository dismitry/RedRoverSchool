package HW7;

public class MainSalary {
    public static void main(String[] args) {
    Salary name1 = new Salary();
    name1.name = "Nixon";
    name1.pref = "Mr";
    name1.age = 22;
    name1.sex = "man";
    name1.salary = 1000;

    Salary name2 = new Salary();
    name2.name = "Nexon";
    name2.pref = "Mrs";
    name2.age = 23;
    name2.sex = "woman";
    name2.salary = 1200;

    // Person[] names = {name1, name2};
    // for (int i = 0; i < names.length; i++) {
    //     Person currentPers = names[i];
    //     if (currentPers.pref.equals("Mr")) {
    //         System.out.println(currentPers.name);
    //     }
    // }
    
    Salary[] zpl = {name1, name2};
    for (int i = 0; i < zpl.length; i++) {
    Salary currentSal = zpl[i];
        {
            System.out.println(currentSal.salary++);
    
        }
    }
}
}