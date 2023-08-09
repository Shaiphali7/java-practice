package encapsulation;

public class Test
{
    public static void main(String[] args) {
        EncapsulationDemo eD=new EncapsulationDemo();
        eD.setId(123);
        eD.setName("Prime");
        System.out.println(eD.getId());
        System.out.println(eD.getName());
    }
}
