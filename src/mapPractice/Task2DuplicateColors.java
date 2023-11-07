package mapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2DuplicateColors {

    /*
    create a method to find the duplicate color and print them out
     */


    public static void duplicateFilter(String[] array) {

        Map<String, Integer> colorCountMap = new LinkedHashMap<>();

        for (String color : array) {
            if (colorCountMap.containsKey(color)) {
                colorCountMap.put(color, colorCountMap.get(color) + 1);
            } else {
                colorCountMap.put(color, 1);
            }
        }
        System.out.println(colorCountMap); // {blue=3, red=1, white=2, black=1}
       // System.out.println(colorCountMap.entrySet());

    }

    public static void main(String[] args) {

        String[] arr = {"blue", "blue", "blue", "red", "white", "white", "black"};

        duplicateFilter(arr);
    }
}
