package revision;

import java.util.ArrayList;

public class JavaRevision {
    String name;
    int value;

    public JavaRevision() {

    }

    public JavaRevision(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void printName() {
        System.out.println("My name is " + name);
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        JavaRevision obj = new JavaRevision();
        obj.printName();
        JavaRevision javaRevision = new JavaRevision("Prime", 102);
        javaRevision.printName();
        JavaRevision obj1 = new JavaRevision("Testing", 103);
        String name = obj1.getName();
        System.out.println(name);
        obj1.getInstance().printName();
    }

    public JavaRevision getInstance() {
        //JavaRevision javaRevision = new JavaRevision();
        //return javaRevision;
        return new JavaRevision();
    }

    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        return list;
    }

}
