package module4.homework;


public class EUBank extends Bank {
    public EUBank(Currency currency, long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(currency, id, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    double commission;

    @Override
    int getLimitOfFunding() {
        int limit;
        if (getCurrency() == Currency.EUR) limit = 20000;
        else  limit = 10000;
        return limit;
    }

    @Override
    double getMonthlyRate() {
        return 0;
    }

    @Override
    double getCommission(int summ) {
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) commission = 0.05;
            else commission = 0.07;
        } else if (getCurrency() == Currency.EUR){
            if (summ <= 1000) commission = 0.02;
            else commission = 0.04;
            //return 0;
        }
        return commission;
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 2000;
        else limit = 2200;
        return limit;
    }


}
