package inheritance;

public class ChildClass extends ParentClass
{
  public void m3()
  {
      System.out.println("Child class m3 method");
}
    public void m4()
    {
        System.out.println("Child class m4 method");
    }

    public static void main(String[] args) {
        //Child class object
        ChildClass obj1=new ChildClass();
        obj1.m1();
        obj1.m2();
        obj1.m3();
        obj1.m4();
        //Parent class object
        ParentClass obj2=new ParentClass();
        obj2.m1();
        obj2.m2();
        int b= obj1.a;


    }
}
