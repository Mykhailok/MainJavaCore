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
        int limit;
        if (getCurrency() == Currency.EUR) limit = 10000;
        else  limit = 0;
        return limit;
    }

    @Override
    double getMonthlyRate() {
        double monthlyRate;
        if (getCurrency() == Currency.USD){
            monthlyRate = 0.01;
        }
            else {
            monthlyRate = 0.02;
        }
        return monthlyRate;
    }

    @Override
    //
    double getCommission(int amount) {
        switch (getCurrency()) {
            case USD:
                return amount <= 1000 ? 0.05 : 0.07;
            case EUR:
                return amount <= 1000 ? 0.06 : 0.08;
        }
        return 0;
    }

//        if (getCurrency() == Currency.USD) {
//            if (amount <= 1000) commission = 0.05;
//            else commission = 0.07;
//        } else if (getCurrency() == Currency.EUR){
//                if (amount <= 1000) commission = 0.06;
//            else commission = 0.08;
//            //return 0;
//        }
//        return 0;

}
