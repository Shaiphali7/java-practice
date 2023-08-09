package methodtype;

public class WithReturnTypeWithParameters
{
    public static void main(String[] args)
    {
        WithReturnTypeWithParameters obj= new WithReturnTypeWithParameters();
        int sum =obj.addition(5,6);
        int sum1 =obj.addition(5,7);
        System.out.println(sum);
        System.out.println(sum1);
        String MyNameresult=obj.Myname("Shaiphali");
        System.out.println(MyNameresult);
    }
public int addition(int a, int b)
{
    int result = a+b;
    return result;
}
public String Myname(String name)
{
    return name;
}

}
