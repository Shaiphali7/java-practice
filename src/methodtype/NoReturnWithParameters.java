package methodtype;

public class NoReturnWithParameters {

    public static void main(String[] args) {
        NoReturnWithParameters obj= new NoReturnWithParameters();
        obj.addition(10,5);
        obj.addition(12,15);
        courseName("Software testing");
        NoReturnWithParameters.courseName("java");

    }
//No return type-void
    public void addition(int a,int b){
        int ans=a+b;
        System.out.println(ans);

    }
    public static void courseName(String course){
        System.out.println(course);

    }
}
