package variables;

public class ReverseString {
    public static void main(String[] args) {
        String s="This is my string";
        ReverseString obj=new ReverseString();
        obj.reverseString(s);
    }
    public void reverseString(String text)
    {
        String reverse="";
        for(int i=text.length()-1;i>=0;i--)
        {
            reverse=reverse+text.charAt(i);

        }
        System.out.println(reverse);
    }
}
