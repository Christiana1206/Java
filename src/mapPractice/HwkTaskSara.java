package mapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class HwkTaskSara {
    public static void main(String[] args) {


        String str = "a1b2C3w6";
//output --> abbCCCwwwwww

        Map<String,String> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i+=2){
            map.put(str.charAt(i)+"" ,str.charAt(i+1)+"");
        }
        System.out.println(map); // {a=1, b=2, C=3, w=6}

        String result = "";
        for (Map.Entry<String,String> pair:map.entrySet()){             //get each pair
            for (int i = 0; i<Integer.parseInt(pair.getValue());i++){   //for 1 pair like a=1 -> i<1
                result+=pair.getKey();                                   //then store the key inside result
            }
        }
        System.out.println(result);

 /*
 for (int i = 0; i < Integer.parseInt(pair.getValue()); i++):
 This inner loop is used to repeat the current character (the pair.getKey()) a number of times
 equal to the count specified by pair.getValue(). pair.getValue() retrieves the value associated
 with the current character from the map and converts it to an integer using Integer.parseInt().
  */
    }
}
