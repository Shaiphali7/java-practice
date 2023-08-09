package exceptionalHandlingDemo;

public class ExceptionDemo1 {
    public static void division() throws ArithmeticException {
        int a = 10;
        int b = 0;

        System.out.println(a / b);

        System.out.println("Hi");
    }
public static void calculation() throws ArithmeticException {
        division();
}
    public static void main(String[] args) {

       // try
        {calculation();}
        //catch (Exception e){
          //  System.out.println(e.getMessage());
      // }
    }
}
