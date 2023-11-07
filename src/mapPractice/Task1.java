package mapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
/*
        you are given one String. The goal is to take a letter and count how many of each character i have in the string.
        I need to record them and show it. So needs to show:
        String str= “I am Happy”;
        I = 1;
        a = 2;
        m = 1;
        H = 1;
        p = 2;
        y = 1;






 */
        String str = "I am Happy"; //most common interview
        str = str.replace(" ", "");

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1); // I=1
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        System.out.println(map);

        String str2 = "I am Happy";
        str2 = str2.replace(" ", "");

        LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map2.containsKey(str2.charAt(i))) {
                map2.put(str2.charAt(i), map2.get(str2.charAt(i)) + 1); // I=1
            } else {
                map2.put(str2.charAt(i), 1);
            }
        }
        System.out.println(map2); // {I=1, a=2, m=1, H=1, p=2, y=1}

        //find more than one and print it

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            if (pair.getValue() > 1) {
                System.out.println(pair.getKey());
            }
        }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    System.out.println(entry);

                }


            }
        }


