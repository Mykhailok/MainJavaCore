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
        System.out.println(userUSBankEUR);

        User userUSBankUSD = new User();
        userUSBankUSD.setBalance(2000);
        userUSBankUSD.setBank(usBankUSD);
        userUSBankUSD.setId(002);
        userUSBankUSD.setCompanyName("Company2");
        userUSBankUSD.setMonthsOfEmployment(2);
        userUSBankUSD.setName("userUSBankUSD");
        userUSBankUSD.setSalary(1000);
        System.out.println(userUSBankUSD);

        User userEUBankEUR = new User();
        userEUBankEUR.setBalance(3000);
        userEUBankEUR.setBank(euBankEUR);
        userEUBankEUR.setId(003);
        userEUBankEUR.setCompanyName("Company3");
        userEUBankEUR.setMonthsOfEmployment(3);
        userEUBankEUR.setName("userEUBankEUR");
        userEUBankEUR.setSalary(1500);
        System.out.println(userEUBankEUR);

        User userEUBankUSD = new User();
        userEUBankUSD.setBalance(4000);
        userEUBankUSD.setBank(euBankUSD);
        userEUBankUSD.setId(004);
        userEUBankUSD.setCompanyName("Company4");
        userEUBankUSD.setMonthsOfEmployment(4);
        userEUBankUSD.setName("userEUBankUSD");
        userEUBankUSD.setSalary(2000);
        System.out.println(userEUBankUSD);

        User userChinaBankEUR = new User();
        userChinaBankEUR.setBalance(5000);
        userChinaBankEUR.setBank(chinaBankEUR);
        userChinaBankEUR.setId(005);
        userChinaBankEUR.setCompanyName("Company5");
        userChinaBankEUR.setMonthsOfEmployment(5);
        userChinaBankEUR.setName("userChinaBankEUR");
        userChinaBankEUR.setSalary(2500);
        System.out.println(userChinaBankEUR);

        User userChinaBankUSD = new User();
        userChinaBankUSD.setBalance(6000);
        userChinaBankUSD.setBank(chinaBankEUR);
        userChinaBankUSD.setId(006);
        userChinaBankUSD.setCompanyName("Company6");
        userChinaBankUSD.setMonthsOfEmployment(6);
        userChinaBankUSD.setName("userChinaBankUSD");
        userChinaBankUSD.setSalary(3000);
        System.out.println(userChinaBankUSD);


        //top level of abstraction, we run all methods throught it
        BankSystem bankSystem = new BankSystemImpl(); //better
        //BankSystemImpl bankSystem1 = new BankSystemImpl();
        bankSystem.withdrawOfUser(userUSBankEUR, 1100);

        System.out.println(userUSBankEUR);
    }
}
