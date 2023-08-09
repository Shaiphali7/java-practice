package javaCollection;

import java.util.Iterator;
import java.util.Map;

public class HashMap
{
    public static void main(String[] args) {
        Map<Integer, String> carMap=new java.util.HashMap<>();
        carMap.put(1,"BMW");
        carMap.put(6,"Audi");
        carMap.put(4,"Honda");
       // for(Map.Entry<Integer, String> car:carMap.entrySet()){
         //   System.out.println(car.getKey()+""+car.getValue());
        //}
        Iterator<Map.Entry<Integer,String>>carList=carMap.entrySet().iterator();
        while (carList.hasNext())
        {

            System.out.println(carList.next());
        }
    }

}
