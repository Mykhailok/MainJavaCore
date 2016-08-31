package offline_now.task3;

public class Main {



    public static void main(String[] args) {

        Employee first = new Employee(true,"Ann","One",25,"Kyiv",1);
        Employee second = new Employee(true,"Jane","Second",26,"Lviv",2);
        Employee third = new Employee(true,"Bridgit","Third",27,"Cheernigiv",3);
        Employee fourth = new Employee(false,"Bob","Fourth",28,"Odessa",4);
        Employee fifth = new Employee(false,"Jack","Fifth",29,"Vinnitsya",5);
        Employee sixth = new Employee(true,"Jill","Sixth",30,"Kyiv",6);
        Employee seventh = new Employee(true,"Olga","Seventh",31,"Cherkassy",7);
        Employee eighth = new Employee(true,"Elena","Eighth",32,"Kyiv",8);
        Employee nineth = new Employee(false,"Mike","Nineth",33,"Cherkassy",9);
        Employee tenth = new Employee(true,"Masha","Tenth",34,"Kyiv",10);

        Employee[] array = {first, second, third, fourth, fifth, sixth, seventh, eighth, nineth, tenth };
        int sum = 0;
        for (int i = 0; i < array.length; i++){

            sum += array[i].salary;

        }
        System.out.println("Сумма зарплат = " + sum);

    }

}
