package module3.offline_now.task3;

public class Employee extends Person {
    protected String address;
    protected double salary;


    public Employee(boolean gender, String name, String surname, int age, String address, double salary) {
        super(gender, name, surname, age);
        this.address = address;
        this.salary = salary;
    }



}
