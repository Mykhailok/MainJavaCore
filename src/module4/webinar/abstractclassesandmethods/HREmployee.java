package module4.webinar.abstractclassesandmethods;

public class HREmployee extends Employee {
    @Override
    void paySalary() {
        double k = 1.1;
        balance += salary * k;
    }
}
