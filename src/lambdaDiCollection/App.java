package lambdaDiCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

        List<String> names = List.of("a", "b", "c");
        names.forEach(name -> System.out.println(name));
        System.out.println("\n ====================================");
        // mengunakan lambda
        names.forEach(System.out::println);
        // mengunakan reference
        System.out.println("\n =====================================");






        // ¥ TANPA MENGUNAKAN LAMBDA
       List<String> list = List.of("d", "e", "f");
       for (var value:list){
           System.out.println(value);
       }
        System.out.println("\n =======================================");
       list.forEach(new Consumer<String>() {
           @Override
           public void accept(String string) {
               System.out.println(string);
           }
       });
        System.out.println("\n ========================================");

      // ¥ REMOVE LIST
      List<String> namess = new ArrayList<>();
      namess.addAll(List.of("f","g","h","jfgh"));
      namess.removeIf(new Predicate<String>() {
          @Override
          public boolean test(String value) {
              return value.length() > 3;
          }
      });
      System.out.println(namess);
      // lambda version removeIf
        namess.removeIf(nm -> nm.length() > 5);



    }
}
