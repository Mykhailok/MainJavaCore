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


    private void paySalary() {
        balance += salary;
    }


    private void withdraw(int summ) {


        if (balance < 1000){
            balance = balance - summ - summ*5/100;
        }
        else balance = balance - summ - summ*10/100;

    }

    private void companyNameLenght() {
        companyName = String.valueOf(companyName.length());
    }

    private void monthIncreaser(int addMonth){

        monthsOfEmployment +=  addMonth;

    }


}
