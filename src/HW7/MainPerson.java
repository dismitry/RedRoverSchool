package HW7;

// import java.util.*;

public class MainPerson{

    public static void main(String[] args) {

        Person name1 = new Person();
        name1.name = "Nixon";
        name1.pref = "Mr";
        name1.age = 22;
        name1.sex = "man";
        
        Person name2 = new Person();
        name2.name = "Nexon";
        name2.pref = "Mrs";
        name2.age = 23;
        name2.sex = "woman";

        Person[] names = {name1, name2};
        for (int i = 0; i < names.length; i++) {
            Person currentPers = names[i];
            if (currentPers.pref.equals("Mr")) {
                System.out.println(currentPers.name);
            }
        }

    }
}
