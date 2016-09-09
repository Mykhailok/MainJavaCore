package module4.homework;


public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        double commission = userBank.getCommission(amount);
        if (userBank.getLimitOfWithdrawal() >= amount + amount * commission) {
            //do logic if rules allow
            double newBalance = user.getBalance() - amount - amount * commission;
            if (newBalance >= 0){
                user.setBalance(newBalance);
            }
            else System.out.println("Отрицательный баланс!!!");
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        double commission = userBank.getCommission(amount);
        //if limit is ok - do funding - if no do nothing
        if (userBank.getLimitOfWithdrawal() >= amount + amount * commission) {
            double newBalance = user.getBalance() + amount;
        user.setBalance(newBalance);
    }


    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank fromUserBank = fromUser.getBank();
        Bank toUserBank = toUser.getBank();
        double fromUserCommission = fromUserBank.getCommission(amount);
        double toUserCommission = toUserBank.getCommission(amount);
            if ((fromUserBank.getLimitOfWithdrawal() >= amount + amount*fromUserCommission) &&
                    (toUserBank.getLimitOfFunding() >= amount - amount*toUserCommission) &&
                    (fromUser.getBalance() > 0) ){
                double newBalanceFromUser = fromUser.getBalance() - amount - amount*fromUserCommission;
                    fromUser.setBalance(newBalanceFromUser);

                double newBalanceToUser = toUser.getBalance() + amount;
                    toUser.setBalance(newBalanceToUser);
            }


//            if ((toUserBank.getLimitOfFunding() >= amount - amount*toUserCommission) && (fromUser.getBalance() > 0)) {
//                double newBalanceToUser = toUser.getBalance() + amount;
//                toUser.setBalance(newBalanceToUser);
//            }
      //fromUser balance - amount - commission
        //toUser balance + amount
    }

    @Override
    public void paySalary(User user) {
        //user balance + salary - commision
        //Bank userBank = user.getBank();
        double newBalance = user.getBalance() + user.getSalary(); //- userBank.getCommission(amount);
        user.setBalance(newBalance);
    }





}
