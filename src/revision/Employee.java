package revision;

public class Employee {
    String eName;
    int eId;
    //public Employee(String eName,String eId)

    public Employee(String eName, int eId) {
        this.eName = eName;
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }
}
