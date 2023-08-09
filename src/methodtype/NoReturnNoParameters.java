package methodtype;

public class NoReturnNoParameters {

    public static void main(String[] args) {
        addition();
        NoReturnNoParameters n1 = new NoReturnNoParameters();
        n1.subtract();
        n1.multiplication();
        NoReturnNoParameters.calculation();


    }

    //No return type(void) no params
    public static void addition() {

        int a = 5;
        int b = 10;
        int ans = a + b;
        //Concatenation
        System.out.println("Addition of two number " + a + " and " + b + " is " + ans);

    }

    public void subtract() {

        int a = 10;
        int b = 5;
        int ans = a - b;
        //Concatenation
        System.out.println("Subtraction of two number " + a + " and " + b + " is " + ans);


    }
    public void multiplication(){

        System.out.println("This is multipication method");
    }
    public static void calculation(){

        System.out.println("Calculation method");
    }
}
