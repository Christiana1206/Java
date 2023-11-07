package project6HashMap;

import java.util.HashMap;
import java.util.Map;

public class LetterMap {
    public static void main(String[] args) {

        // Count the letters from string using Map/HashMap

        String str = "CodingFisherCool";

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }else{
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }

        }
        System.out.println(map); // {r=1, C=2, s=1, d=1, e=1, F=1, g=1, h=1, i=2, l=1, n=1, o=3}



        for(Map.Entry<Character, Integer> pairs : map.entrySet()){
            if(pairs.getValue() > 1){
                System.out.println(pairs.getKey());
                System.out.println(pairs);
            }


        }


    }
}
