package lambdaLazyParameter;

import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {

        // testScore(80, "arif");
        // testScore(40, getName());
        // ¥ LAMBDA EXPRESSION
        testScore(70, () ->getName());

    }

    public static void testScore(int value, Supplier<String> name){
        if (value > 80){
            System.out.println("SELAMAT " + name.get() + ", ANDA LULUS");
        } else {
            System.out.println("COBA LAGI TAHUN DEPAN");
        }
    }

    public static String getName(){
        System.out.println("getName() dipanggil");
        return "arif";
    }

}
