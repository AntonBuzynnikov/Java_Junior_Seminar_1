package HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            departments.add(new Department("Department #" + i));
        }
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(new Person(
                    "Person #" + i,
                    ThreadLocalRandom.current().nextInt(20,66),
                    ThreadLocalRandom.current().nextDouble(30_000,100_000),
                    departments.get(ThreadLocalRandom.current().nextInt(0,10))
            ));
        }
        HomeWork.printNamesOrdered(persons);
        System.out.println(HomeWork.printDepartmentOldestPersons(persons));
        System.out.println(HomeWork.findFirstPersons(persons));
        System.out.println(HomeWork.findTopDepartment(persons).orElse(null));
    }
}
