package revision;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(10);
        list.add("Prime");
        list.add(null);
        list.add(true);
        list.add(true);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(101);
        for (Object objects1 : list) {
            System.out.println(objects1);
        }
        System.out.println("--------------------------------");
        HashSet set = new HashSet();
        set.add("Prime");
        set.add("Prime");
        set.add(2);
        set.add(null);
        set.add(true);
        List list2= new ArrayList<>();
        Set set1=new HashSet();
        for (Object object : set) {
            System.out.println(object);
        }
        System.out.println("--------------------------------");
        HashMap<Integer, String> map = new HashMap<>();
Map<Integer,String> map1=new HashMap();
    map.put(1,"Red");
    map.put(2,"Green");
    map.put(3,"Blue");
    map.put(4,"Blue");
    map.put(4,"null");


   Set colour= map.entrySet();
   for(Object o: colour)
   {
       System.out.println(o);
   }

    }
}