package stringExamples;

public class StringDemo
{
    public static void main(String[] args)
    {
    String s1="This is my first string";
    String s2="This is my second string";
    String s3="";
    int l= s1.length();
    int l2=s2.length();
    int l1=s3.length();
        System.out.println(l);
        System.out.println(l2);
        System.out.println(s1.contains("First"));
        System.out.println(s2.contains("second"));
        System.out.println(s2.toLowerCase());
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s3.isEmpty());
        System.out.println(s1.charAt(9));//index start at 0

    }
}
