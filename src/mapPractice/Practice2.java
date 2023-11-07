package mapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice2 {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap= new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        hashMap.put("IL", 2);                linkedHashMap.put("IL", 2);              treeMap.put("IL", 2);
        hashMap.put("OH", 5);                linkedHashMap.put("OH", 5);              treeMap.put("OH", 5);
        hashMap.put("WI", 6);                linkedHashMap.put("WI", 6);              treeMap.put("WI", 6);
        hashMap.put("IN", 1);                linkedHashMap.put("IN", 1);              treeMap.put("IN", 1);
        System.out.println(hashMap);         System.out.println(linkedHashMap);       System.out.println(treeMap);
        //{WI=6, IL=2, IN=1, OH=5}           //{IL=2, OH=5, WI=6, IN=1}               //{IL=2, IN=1, OH=5, WI=6}

        System.out.println("===================================================================================");

        //null keys for each type of map

        hashMap.put(null,55);               linkedHashMap.put(null,55);                //treeMap.put(null,55);
        System.out.println(hashMap);        System.out.println(linkedHashMap);         System.out.println(treeMap);
        //{null=55, WI=6, IL=2, IN=1, OH=5} {IL=2, OH=5, WI=6, IN=1, null=55}          {IL=2, IN=1, OH=5, WI=6}


        System.out.println("====================================================================================");
        //null values for each type of map

        hashMap.put("FL", null);            linkedHashMap.put("FL", null);            treeMap.put("FL", null);
        hashMap.put("WA", null);            linkedHashMap.put("WA", null);            treeMap.put("WA", null);
        System.out.println(hashMap);        System.out.println(linkedHashMap);        System.out.println(treeMap);









    }
}
