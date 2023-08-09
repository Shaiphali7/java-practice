package exceptionalHandlingDemo;

public class ExceptionDemo {
public static void division() {
    int a = 10;
    int b = 2;
    try {
        System.out.println(a / b);
    } catch (ArithmeticException e)
    {
        System.out.println(e.getMessage());
        System.out.println("Divided by 0 is not possible");
    }
    finally {
        System.out.println("Finally block");

    }
    System.out.println("Hi");
}

    public static void main(String[] args) {

    division();
    }






}
