package module4.homework;

public class Main {
    public static void main(String[] args) {
        //BankSystemImpl -> User -> Bank
        Bank usBankEUR = new USBank(Currency.EUR, 111, "USA", 10, 1000, 1, 100000);
        Bank usBankUSD = new USBank(Currency.USD, 112, "USA1", 11, 1001, 2, 100001);
        Bank euBankEUR = new EUBank(Currency.EUR, 113, "USA2", 12, 1002, 3, 100002);
        Bank euBankUSD = new USBank(Currency.USD, 114, "USA3", 13, 1003, 4, 100003);
        Bank chinaBankEUR = new USBank(Currency.EUR, 115, "USA4", 14, 1004, 5, 100004);
        Bank chinaBankUSD = new USBank(Currency.USD, 116, "USA5", 15, 1005, 6, 100005);


        User userUSBankEUR = new User();
        userUSBankEUR.setBalance(1000);
        userUSBankEUR.setBank(usBankEUR);
        userUSBankEUR.setId(001);
        userUSBankEUR.setCompanyName("Company1");
        userUSBankEUR.setMonthsOfEmployment(1);
        userUSBankEUR.setName("userUSBankEUR");
        userUSBankEUR.setSalary(500);
        //System.out.println(userUSBankEUR);

        User userUSBankUSD = new User();
        userUSBankUSD.setBalance(2000);
        userUSBankUSD.setBank(usBankUSD);
        userUSBankUSD.setId(002);
        userUSBankUSD.setCompanyName("Company2");
        userUSBankUSD.setMonthsOfEmployment(2);
        userUSBankUSD.setName("userUSBankUSD");
        userUSBankUSD.setSalary(1000);
        //System.out.println(userUSBankUSD);

        User userEUBankEUR = new User();
        userEUBankEUR.setBalance(3000);
        userEUBankEUR.setBank(euBankEUR);
        userEUBankEUR.setId(003);
        userEUBankEUR.setCompanyName("Company3");
        userEUBankEUR.setMonthsOfEmployment(3);
        userEUBankEUR.setName("userEUBankEUR");
        userEUBankEUR.setSalary(1500);
        //System.out.println(userEUBankEUR);

        User userEUBankUSD = new User();
        userEUBankUSD.setBalance(4000);
        userEUBankUSD.setBank(euBankUSD);
        userEUBankUSD.setId(004);
        userEUBankUSD.setCompanyName("Company4");
        userEUBankUSD.setMonthsOfEmployment(4);
        userEUBankUSD.setName("userEUBankUSD");
        userEUBankUSD.setSalary(2000);
        //System.out.println(userEUBankUSD);

        User userChinaBankEUR = new User();
        userChinaBankEUR.setBalance(5000);
        userChinaBankEUR.setBank(chinaBankEUR);
        userChinaBankEUR.setId(005);
        userChinaBankEUR.setCompanyName("Company5");
        userChinaBankEUR.setMonthsOfEmployment(5);
        userChinaBankEUR.setName("userChinaBankEUR");
        userChinaBankEUR.setSalary(2500);
        //System.out.println(userChinaBankEUR);

        User userChinaBankUSD = new User();
        userChinaBankUSD.setBalance(6000);
        userChinaBankUSD.setBank(chinaBankUSD);
        userChinaBankUSD.setId(006);
        userChinaBankUSD.setCompanyName("Company6");
        userChinaBankUSD.setMonthsOfEmployment(6);
        userChinaBankUSD.setName("userChinaBankUSD");
        userChinaBankUSD.setSalary(3000);
        //System.out.println(userChinaBankUSD);


        //top level of abstraction, we run all methods throught it
        BankSystem bankSystem = new BankSystemImpl(); //better
        //BankSystemImpl bankSystem1 = new BankSystemImpl();

        System.out.println("withdrawOfUser");
        bankSystem.withdrawOfUser(userUSBankEUR, 100);
        System.out.println(userUSBankEUR);
        bankSystem.withdrawOfUser(userUSBankUSD, 200);
        System.out.println(userUSBankUSD);
        bankSystem.withdrawOfUser(userEUBankEUR, 300);
        System.out.println(userEUBankEUR);
        bankSystem.withdrawOfUser(userEUBankUSD, 400);
        System.out.println(userEUBankUSD);
        bankSystem.withdrawOfUser(userChinaBankEUR, 500);
        System.out.println(userChinaBankEUR);
        bankSystem.withdrawOfUser(userChinaBankUSD, 600);
        System.out.println(userChinaBankUSD);

        System.out.println("fundUser");
        bankSystem.fundUser(userUSBankEUR, 200);
        System.out.println(userUSBankEUR);
        bankSystem.fundUser(userUSBankUSD, 300);
        System.out.println(userUSBankUSD);
        bankSystem.fundUser(userEUBankEUR, 400);
        System.out.println(userEUBankEUR);
        bankSystem.fundUser(userEUBankUSD, 500);
        System.out.println(userEUBankUSD);
        bankSystem.fundUser(userChinaBankEUR, 600);
        System.out.println(userChinaBankEUR);
        bankSystem.fundUser(userChinaBankUSD, 700);
        System.out.println(userChinaBankUSD);

        System.out.println("transferMoney");
        bankSystem.transferMoney(userUSBankEUR, userUSBankUSD, 200);
        System.out.println(userUSBankEUR);
        bankSystem.transferMoney(userUSBankUSD, userUSBankEUR, 300);
        System.out.println(userUSBankUSD);
        bankSystem.transferMoney(userEUBankEUR, userEUBankUSD, 400);
        System.out.println(userEUBankEUR);
        bankSystem.transferMoney(userEUBankUSD, userUSBankEUR, 500);
        System.out.println(userEUBankUSD);
        bankSystem.transferMoney(userChinaBankEUR, userChinaBankUSD, 600);
        System.out.println(userChinaBankEUR);
        bankSystem.transferMoney(userChinaBankUSD, userChinaBankEUR, 700);
        System.out.println(userChinaBankUSD);

        System.out.println("paySalary");
        bankSystem.paySalary(userUSBankEUR);
        System.out.println(userUSBankEUR);
        bankSystem.paySalary(userUSBankUSD);
        System.out.println(userUSBankUSD);
        bankSystem.paySalary(userEUBankEUR);
        System.out.println(userEUBankEUR);
        bankSystem.paySalary(userEUBankUSD);
        System.out.println(userEUBankUSD);
        bankSystem.paySalary(userChinaBankEUR);
        System.out.println(userChinaBankEUR);
        bankSystem.paySalary(userChinaBankUSD);
        System.out.println(userChinaBankUSD);


    }
}
