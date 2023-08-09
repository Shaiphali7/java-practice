package arrays;

public class ArraysDemo
{
    public static void main(String[] args) {
        //Array declaration
        int a[];
        int[] b;
        String studentName[];
        int x[] = {10, 20, 30, 40, 50};
        System.out.println(x[4]);
        for (int i = 0; i<x.length; i++)
        {
            System.out.println(x[i]);

        }
        //Approach 2
        int z [] = new int[5];
        z[0] =10;
        z[1] =11;
        z[2] =12;
        z[3] =13;
        z[4] =14;
        System.out.println(z[2]);
        String names[]= {"Java", "C++","Python"};
        System.out.println(names[1]);
    }

}
