package project6HashMap;

import java.util.HashMap;
import java.util.Map;

public class LengthElementStringArr {
    public static void main(String[] args) {
        // 6. Find the length of each element from string array and return
// with key - value with Maps or Hashmaps.

        String[] strings = {"aa", "bbb", "ccc"};

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < strings.length; i++){
           // for(int j = 0; j < strings[i].length(); j++){
              //  map.put(strings[i].charAt(j), strings[i].length());  //{a=2, b=3, c=3}
            map.put(strings[i], strings[i].length());
            }

        System.out.println(map); //{aa=2, ccc=3, bbb=3}

/*
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry);
            Character ch = entry.getKey();
            int count = entry.getValue();
        }

 */





    }
}
