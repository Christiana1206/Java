package mapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pr1Repeate {
    public static void main(String[] args) {


        HashMap map1 = new HashMap<>();

        HashMap<String, Integer> map2 = new HashMap<>();

        Map map3 = new HashMap<>();

        Map<String, String> map4= new HashMap<>();


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("toyota", "corolla");
        hashMap.put("lexus", "ES350");
        hashMap.put("bmw", "X7");
        hashMap.put("honda", "accord");

        System.out.println(hashMap.entrySet()); //[toyota=corolla, honda=accord, lexus=ES350, bmw=X7]

        Set<HashMap.Entry<String, String>> pairs = hashMap.entrySet();
        System.out.println(pairs); // [toyota=corolla, honda=accord, lexus=ES350, bmw=X7]

        for(HashMap.Entry<String, String> pair : pairs){
            System.out.println(pair); // toyota=corolla
                                      // honda=accord
                                      // lexus=ES350
                                      // bmw=X7
        }


        System.out.println(hashMap.put("toyota", "corolla")); //corolla - only value
        System.out.println(hashMap.put("bmw", "X7"));  // X7

        // the same

        System.out.println(hashMap.get("toyota")); //prints out only the value
        System.out.println(hashMap.get("bmw"));

        System.out.println(hashMap);   // {toyota=corolla, honda=accord, lexus=ES350, bmw=X7}

        System.out.println(hashMap.keySet()); // [toyota, honda, lexus, bmw] - set

       Set<String> keys = hashMap.keySet(); // right above
        for(String key : keys) {
             System.out.println(key); // toyota
            // honda
            // lexus
            // bmw
            //System.out.println(hashMap.get(key));    //corolla
            // accord
            // ES350
            // X7
            // System.out.println(hashMap.get(key+" - "+hashMap.get(key)));
        }


            Collection<String> values = hashMap.values();
           // for(String value : values){
                System.out.println(values); // [corolla, accord, ES350, X7]


                for(String value : values){
                    System.out.println(value); //corolla
                                              // accord
                                              // ES350
                                             //  X7
                }





            }



        }






