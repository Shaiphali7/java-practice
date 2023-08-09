package variables;

public class StaticVariables {
    /**
     * Scope-within the class
     * Memory allocation- when class is loaded
     */
    static int a = 10;

    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(StaticVariables.a);
        a=50;//changing value
        System.out.println(a);

    }

    public void m1() {

        System.out.println(a);
        System.out.println(StaticVariables.a);
    }
}
