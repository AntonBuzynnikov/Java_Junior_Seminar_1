package HomeWork;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HomeWork {
    public static void printNamesOrdered(List<Person> persons){
        persons.stream().sorted(Comparator.comparing(x->x.getName())).forEach(x-> System.out.println(x.getName()));
    }
    public static Map<Department,Person> printDepartmentOldestPersons(List<Person> persons){
        return persons.stream()
                .collect(Collectors.toMap(Person::getDepartment,Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(x->x.getAge()))));
    }
    public static List<Person> findFirstPersons(List<Person> persons){
        return persons.stream()
                .filter(person -> person.getAge() < 30)
                .filter(person -> person.getSalary() > 50000.0).limit(10).toList();
    }

    public static Optional<Department> findTopDepartment(List<Person> persons) {
        return persons.stream()
                .collect(Collectors.groupingBy(
                        Person::getDepartment,
                        Collectors.summingDouble(Person::getSalary)))
                .entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }
}
