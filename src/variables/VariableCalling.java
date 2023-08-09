package variables;

public class VariableCalling {
    String name = "Prime";// Instance variable
    static int number = 100;// Static variable

    public static void main(String[] args) {
        VariableCalling obj = new VariableCalling();
        System.out.println(obj.name);
        obj.m1();
        System.out.println(number);
        System.out.println(VariableCalling.number);
    }

    public void m1() {
        int a = 10;//Local
        System.out.println(a);
        System.out.println(name);
        System.out.println(VariableCalling.number);
        System.out.println(number);
    }
}
