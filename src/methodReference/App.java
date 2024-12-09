package methodReference;

import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

        // ¥ STATIC METHOD REFERENCE
        // Predicate<String> predicate1 = value -> StringUtil.isLowerCase(value); // dengan lambda
        Predicate<String> predicate = StringUtil::isLowerCase;
        System.out.println(predicate.test("Assep"));      // false
        System.out.println(predicate.test("asseppp"));    // true
        System.out.println("\n==========================================");

        // ¥ NON STATIC METHOD REFERENCE
        // Membuat instance dari App untuk digunakan pada referensi method non-static
        App app = new App();
        Predicate<String> predicate2 = app::isLowerCase;
        System.out.println(predicate2.test("Anjeng"));    // false
        System.out.println(predicate2.test("anjing"));    // true
        System.out.println("\n==========================================");

        // Menjalankan method run
        app.run();

        // Menjalankan method run2
        app.run2();
    }

    public void run(){
        Predicate<String> predicate = this::isLowerCase;
        System.out.println(predicate.test("Anjeng"));    // false
        System.out.println(predicate.test("anjing"));    // true
    }

    public void run2(){
        App app = new App();
        Predicate<String> predicate = app::isLowerCase;
        System.out.println(predicate.test("Anjeng"));    // false
        System.out.println(predicate.test("anjing"));    // true
    }

    private boolean isLowerCase(String value) {
        for (char c : value.toCharArray()){
            if (!Character.isLowerCase(c)) return false;
        }
        return true;
    }

}


