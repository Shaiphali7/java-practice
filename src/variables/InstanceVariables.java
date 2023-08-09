package variables;

public class InstanceVariables {
    // Instance with object
    /** Scope- with in the class
     * Memory allocation - when object is created
     * Memory-heap
     */
    int a = 10; // a is Instance or Global variable
    String name = "Prime Testing";

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(obj.name);

    }

    public void myMethod() {
        InstanceVariables t = new InstanceVariables();
        System.out.println(t.a);

    }


}
