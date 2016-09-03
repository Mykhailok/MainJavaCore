package module3.homework.task4;

public class User {
    protected String name;
    protected int balance;
    protected int monthsOfEmployment;
    protected String companyName;
    protected int salary;
    protected String currency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    //Constructor

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }


    //a few constructors
    protected static User employee = new User("Mykhailo", 2000, 6, "InterLink", 1000, "UAH");

    public static int paySalary() {
        int sum = employee.balance + employee.salary;
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(paySalary());

    }
}
