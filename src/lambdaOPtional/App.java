package lambdaOPtional;

import java.util.Optional;

public class App {
    public static void main(String[] args) {

        sayHello("Eko");
        String name = null;
        sayHello(name);
        // lambda optional


    }
    public static void sayHello(String name){
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> upperName = optionalName.map(value -> value.toUpperCase());

       upperName.ifPresent(value -> System.out.println("Hello " + value));
    }
}
