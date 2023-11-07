package mapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {


    /*
    create a method to find the duplicate color and print them out
     */



























    public static void duplicateFilter(String[] array) {

        Map<String, Integer> colorCountMap = new LinkedHashMap<>();

        for (String color : array) {
            if(colorCountMap.containsKey(color)){
                colorCountMap.put(color,colorCountMap.get(color)+1);
            }else{
                colorCountMap.put(color,1);
            }
        }
        System.out.println(colorCountMap); // {blue=3, red=1, white=2, black=1}
        System.out.println(colorCountMap.entrySet()); //  [blue=3, red=1, white=2, black=1]


        for(Map.Entry<String, Integer> pair:colorCountMap.entrySet()){ // one pair from pairs
            if(pair.getValue() > 1){
                System.out.println("Duplicate Element: "+pair); //Duplicate Element: blue=3
                                                              //  Duplicate Element: white=2

            }
        }

    }
    public static void main(String[] args) {

        String[] arr = {"blue", "blue", "blue", "red", "white", "white", "black"};

        duplicateFilter(arr);


    }
}








