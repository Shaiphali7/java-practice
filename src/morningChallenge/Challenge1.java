package morningChallenge;

import java.util.Scanner;

public class Challenge1
{
    public static void main(String[] args)
    {
        //String name="Shaiphali";
        String message="Good Morning";
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=s.next();
        System.out.println("Hi "+name);
        System.out.println(message);
        s.close();
    }
}
