package module4.homework;

public class ChinaBank extends Bank {

    public ChinaBank(Currency currency, long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(currency, id, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    double commission;

    @Override
    int getLimitOfFunding() {
        int limit;
        if (getCurrency() == Currency.EUR) limit = 5000;
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
            if (summ <= 1000) commission = 0.03;
            else commission = 0.05;
        } else if (getCurrency() == Currency.EUR){
            if (summ <= 1000) commission = 0.1;
            else commission = 0.11;
            //return 0;
        }
        return commission;
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 100;
        else limit = 150;
        return limit;
    }
}
