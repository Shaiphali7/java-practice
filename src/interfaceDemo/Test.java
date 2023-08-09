package interfaceDemo;

public class Test implements InterfaceDemo,InterfaceDemo2
{
    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m2() {
        System.out.println("m2 method");
    }
    public void m3(){
        System.out.println("m3 method");
    }

    public static void main(String[] args) {
        Test obj=new Test();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
