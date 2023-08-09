package constructors;

public class ConstructorsExamples
{
int empID;
String empName;
public ConstructorsExamples(int empID,String empName)
{
    this.empID=empID;
    this.empName=empName;

}

    public static void main(String[] args)
    {
    ConstructorsExamples obj= new ConstructorsExamples(10,"Raju");
    obj.demo();
    ConstructorsExamples obj1= new ConstructorsExamples(20,"Niraj");
    obj1.demo();

    }
    public void demo(){

        System.out.println(empID);
        System.out.println(empName);
    }
{


}


}
