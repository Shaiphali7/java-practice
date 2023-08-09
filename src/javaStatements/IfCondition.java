package javaStatements;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter your age");
        int age = s.nextInt();
        isEligible(age);

    }

    public static void isEligible(int age) {
        if (age >= 18) {
            System.out.println("Eligible for vote");
        }
        System.out.println("Hello");


    }
}
