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
        int sum = employee.getBalance() + employee.getSalary();
        return sum;
    }


    protected static double withdraw(int summ) {

        double rest;
        if (employee.getBalance() < 1000){
            rest = employee.getBalance() - summ - summ*5/100;
        }
        else rest = employee.getBalance() - summ - summ*10/100;
        return  rest;
    }

    protected static int monthIncreaser(int addMonth){
        int month;

        month = employee.getMonthsOfEmployment() + addMonth;

        return month;

    }


    public static void main(String[] args) {
        System.out.println("The salary is " + paySalary() + " " + employee.getCurrency());
        System.out.println("Rest after comission is " + withdraw(100) + " " + employee.getCurrency());
        System.out.println("Company name Length is " + employee.getCompanyName().length());
        System.out.println("Employment months added to " + monthIncreaser(1));

    }
}
