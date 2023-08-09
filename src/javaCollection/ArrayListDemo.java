package javaCollection;

import java.util.ArrayList;

public class ArrayListDemo {
    //Array
    int[] a = new int[5];

    public static void main(String[] args) {
        //Arraylist for generic object

        ArrayList list = new ArrayList();
        // ArrayList list<String>=new ArrayList();
        list.add("Java");
        list.add("Python");
        //list.add(20);
        list.add(0);
        list.add('H');
        list.add(true);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //Remove value from list
        list.remove(1);
        System.out.println("After removing values");
        for (Object name : list) {
            System.out.println(name);
        }
        ArrayList<String> carList = new ArrayList();
        carList.add("Audi");
        carList.add("Honda");
        //carList.add(String.valueOf(50));
        ArrayList<Integer> number = new ArrayList();
        number.add(10);
        number.add(20);
        try {
            number.add(Integer.valueOf("50"));
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } finally {
        }
        System.out.println(number);

    }
}
