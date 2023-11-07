package mapPractice;

import java.util.*;

public class HwkTask {
    public static void main(String[] args) {

        String str = "a1b2C3w6";
        // output --> abbCCCwwwwww'

        //tip1: use i+2 to iterate
        //map

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i += 2) {

            int count = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
            map.put(str.charAt(i), count);
        }


        System.out.println(transformString(map));


    }

        public static String transformString(Map<Character, Integer> map) {
        StringBuilder str1 = new StringBuilder();


            for(Map.Entry<Character, Integer> pair : map.entrySet()){
                Character ch = pair.getKey();
                int count = pair.getValue();

                for(int i = 0; i < count; i++){
                    str1.append(ch);

                }

            }
            return str1.toString();

    }

    }



