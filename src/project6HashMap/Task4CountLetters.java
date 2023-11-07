package project6HashMap;

import java.util.HashMap;
import java.util.Map;

public class Task4CountLetters {
    public static void main(String[] args) {

        /*
        Count the letters from string of arrays and print out, also
// print out the largest value with the key. For ex: codeee -> e:3

         */

        String[] strArray = {"aa", "bbb", "cccc"};

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < strArray.length; i++){

            for(int j = 0; j < strArray[i].length(); j++){

                if(!map.containsKey(strArray[i].charAt(j))){
                    map.put(strArray[i].charAt(j), 1);
                }else{
                    map.put(strArray[i].charAt(j), map.get(strArray[i].charAt(j))+1);
                }
            }
        }
        System.out.println("map ="+map);


        HashMap<String, Integer> map1 = new HashMap<>();

         int max = 0;
         String keyMax = "";

        for(Map.Entry<String, Integer> entry : map1.entrySet()){
            if(entry.getValue() > max){ // ==> update max
                max = entry.getValue();
                keyMax = String.valueOf(entry.getKey());
            }
        }
        map1.put(keyMax, max);
        System.out.println(map1); // nepravilno!!!
    }
}
