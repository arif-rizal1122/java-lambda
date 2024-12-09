package utilFunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {

        // Interface Consumer
        Consumer<String> consumer = value -> System.out.println(value);
        consumer.accept("arif rizal");

        System.out.println("\n ======================================");
        // Interface Function
        Function<String, Integer> funtionLenght = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return string.length();
            }
        };
        System.out.println(funtionLenght.apply("arifin"));

        System.out.println("\n ======================================");
        // Interface Predicate
        Predicate<String> predicate = value -> value.isBlank();
        boolean blank = predicate.test("ajeng");
        boolean blankz = predicate.test("");
        System.out.println("hmmkk : " + blank);
        System.out.println("hmkkkz : " + blankz);


        System.out.println("\n =======================================");
        // Interface Supplier
        Supplier<String> supplier = ()->"arifzz";
        String name = supplier.get();
        System.out.println("my name : "+ name);

    }
}
