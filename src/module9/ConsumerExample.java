package module9;

import module3.offline_now.task3.Person;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;

        consumer.accept("Jeremy");
        System.out.println("test" + consumer.toString());


    }
}
