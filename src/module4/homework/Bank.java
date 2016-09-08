package module4.homework;

public abstract class Bank {
    Currency currency;
    long id;
    String bankCountry;
    int numberOfEmployees;
    double avrSalaryOfEmployee;
    long rating;
    long totalCapital;

    //Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    //End Getters and Setters

    //Contructor --->


    public Bank(Currency currency, long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.currency = currency;
        this.id = id;
        this.bankCountry = bankCountry;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    // ---> End Constructor

    public Currency getCurrency() {
        return currency;
    }

    abstract int getLimitOfFunding();

    abstract int getMonthlyRate();

    double moneyPaidMonthlyForSalary() {
        return 0;
    }

    abstract int getCommission(int summ);

    abstract int getLimitOfWithdrawal();


    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "currency=" + currency +
                '}';
    }
}
