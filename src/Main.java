//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action() {
                return "arif";
            }
        };
        System.out.println("mengunakan anonimus class ================================");
        System.out.println(simpleAction.action());
        System.out.println("dengan lambada ===========================================");

        SimpleAction simpleAction1 = () -> {
            return "rizal";
        };
        System.out.println(simpleAction1.action());
    }
}