package mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice1 {
    public static  void main(String[] args) {

        //

        HashMap map1 = new HashMap<>();

        HashMap<String, Integer> map2 = new HashMap<>();

        Map map3 = new HashMap<>();

        Map<String, String> map4= new HashMap<>();

        //print out the map
        System.out.println(map2); //{}

        //add some values to the map

        map2.put("Alex", 100);
        System.out.println(map2); //{Alex=100}

        map2.put("Sam",90);
        map2.put("Diana",80);
        map2.put("Vlad",110);
        System.out.println(map2); //{Diana=80, Alex=100, Vlad=110, Sam=90} // Stored in random order like HashSet

        //check how many elements do I have on this map?

        System.out.println(map2.size()); //4, a pair is one element

        map2.put("Alex", 101);
        System.out.println(map2); //keys are unique, but changes value => {Diana=80, Alex=101, Vlad=110, Sam=90}

        map2.put("David", 90);
        System.out.println(map2); //values can be duplicate
        //{Diana=80, Alex=101, Vlad=110, David=90, Sam=90}

        System.out.println("****************************************");

        System.out.println(map2.put("David",90)); //print out value
        System.out.println(map2.put("Alex",101));

        System.out.println("===================================");
        //reach out to one element from map
        System.out.println(map2.get("David")); //prints out only the value =>90
        System.out.println(map2.get("Vlad")); //110

        //get method only accepts key -> because value is duplicate>> don't know which one
        Integer i = map2.get("Diana");
        System.out.println(i*100); //8000

        //The keys are unique, so i can get the values

        //reach out to the keys from map

        System.out.println(map2.keySet()); // [Diana, Alex, Vlad, David, Sam]
        System.out.println("=======================================");
        System.out.println("=======================================");

        //I want to reach out to every single value within the map one by one
        //{Diana=80, Alex=101, Vlad=110, David=90, Sam=90}

        //i need a key

        Set<String> keys = map2.keySet(); // [Diana, Alex, Vlad, David, Sam]
        for(String key : keys){
            System.out.println(key+" - "+map2.get(key)); //Diana - 80
                                                         //Alex - 101
                                                         //Vlad - 110
                                                         //David - 90
                                                         //Sam - 90
           // System.out.println(map2.get(key));


        }
        System.out.println("=============================================");

        //remove()
        map2.remove("Alex");
        System.out.println(map2); //{Diana=80, Vlad=110, David=90, Sam=90}

        System.out.println(map2.get("Alex")); //null
        System.out.println(map2.get("xyz")); //null

        //remove() 2:
        map2.remove("David", 90);
        System.out.println(map2); //{Diana=80, Vlad=110, Sam=90}











    }
}
