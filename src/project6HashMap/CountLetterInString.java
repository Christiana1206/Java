package project6HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetterInString {
    public static void main(String[] args) {

        String str = "concatenation";

        Map<Character, Integer> map = new LinkedHashMap<>();
             for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                if(map.containsKey(ch)){
                    int count = map.get(ch);
                    map.replace(ch, ++count);
                }else{
                    map.put(ch, 1);
                }
        }
        System.out.println(map);
    }
}
