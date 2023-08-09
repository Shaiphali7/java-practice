package revision;

public class Main extends Employee{
    String companyName;
    public Main(String eName, int eId,String companyName) {
        super(eName, eId);
        this.companyName=companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public static void main(String[] args) {

        //Employee employee=new Employee("Shaif",101);
        Main main=new Main("saif",101,"Prime");
        System.out.println(main.geteName());
        System.out.println(main.getCompanyName());
    }
}
