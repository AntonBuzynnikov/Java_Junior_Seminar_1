package HomeWork;

public class Person {
    private String name;
    private int age;
    private double salary;
    private Department department;

    public Person(String name, int age, double salary, Department department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", salary: " + String.format("%.2f",salary) +
                ", department: " + department +
                '}';
    }
}
