package lambda;

public class App {
    public static void main(String[] args) {

        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action(String name) {
                return "arif";
            }
        };
        System.out.println("mengunakan anonimus class ================================");
        System.out.println(simpleAction.action("arifss"));
        System.out.println("dengan lambada ===========================================");

        SimpleAction simpleAction1 = (String name) -> {
            return "rizal";
        };
        System.out.println(simpleAction1.action("rizal"));
        System.out.println("\n ================================");

        SimpleAction simpleAction2 = (String name) -> {
            return "hello " + name;
        };
        SimpleAction simpleAction3 = (name -> {
            return "Hello " + name;
        });
        SimpleAction simpleAction4 = (String name) -> "hello " + name;
        SimpleAction simpleAction5 = (name) -> "hello " + name;
        System.out.println(simpleAction2.action("ayah"));
        System.out.println(simpleAction3.action("bunda"));
        System.out.println(simpleAction4.action("mimi"));
        System.out.println(simpleAction5.action("pipi"));
    }
}
