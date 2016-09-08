package module4.homework;

public class USBank extends Bank {

    public USBank(Currency currency, long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(currency, id, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    //
    int getCommission(int amount) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000) commission = 5;
            else commission = 7;
        } else {
            //if (amount < 1000) commission = 5;
            //else commission = 7;
            return 0;
        }
        return commission;
    }
}
