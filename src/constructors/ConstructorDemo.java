package constructors;

public class ConstructorDemo
{
    public ConstructorDemo()
    {

        System.out.println("Zero args constructors");
    }

    public ConstructorDemo(int a)
    {

        System.out.println("One args constructors "+a);
    }
    public ConstructorDemo(String name)
    {

        System.out.println("One args constructors "+name);
    }
    public ConstructorDemo(int a, int b)
    {

        System.out.println("One args constructors "+(a+b));
    }
    //Method
    public void addition(){

        System.out.println("This is a method");
    }

    public static void main(String[] args)
    {
        ConstructorDemo obj =new ConstructorDemo();
        //ConstructorDemo obj =new ConstructorDemo(10,20);
        ConstructorDemo obj1 =new ConstructorDemo(10);
        ConstructorDemo obj2= new ConstructorDemo("Prime");
        ConstructorDemo obj3= new ConstructorDemo(3,4);
        obj.addition();

    }


}
