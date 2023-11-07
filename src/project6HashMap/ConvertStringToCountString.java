package project6HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConvertStringToCountString {
    public static void main(String[] args) {
        /*
        7. Convert aaabbbccddeeee into a3b3c2d2e3, use Maps and StringBuilder
         */

        String chars = "aaabbbccddeeee";

        Map<Character, Integer> map = new LinkedHashMap<>();


        for (int i = 0; i < chars.length(); i++) {

            if (map.containsKey(chars.charAt(i))) {
                map.put(chars.charAt(i), map.get(chars.charAt(i)) + 1);
            } else {
                map.put(chars.charAt(i), 1);
            }

        }
            System.out.println(map); //{a=3, b=3, c=2, d=2, e=4}

            StringBuilder stringBuilder = new StringBuilder();

            for(Map.Entry<Character, Integer> entry : map.entrySet()){

            stringBuilder.append(entry.getKey());
            stringBuilder.append(entry.getValue());

        }
        System.out.println(stringBuilder);

    }
}
