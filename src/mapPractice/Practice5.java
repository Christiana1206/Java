package mapPractice;

import javax.print.attribute.IntegerSyntax;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice5 {
    public static void main(String[] args) {


        //entrySet()

        HashMap<String, Integer> map = new HashMap<>();
        map.put("IT", 100);
        map.put("HR", 200);
        map.put("Admin",300);
        map.put("Sales", 400);

        System.out.println(map); // {Sales=400, HR=200, IT=100, Admin=300} --> Map is in curly brackets

        System.out.println(map.entrySet()); //[Sales=400, HR=200, IT=100, Admin=300] --> collections brackets,
                                            // --> print it out directly


            Set<Map.Entry<String, Integer>> pairs = map.entrySet(); //--> stores it, than print it out
            System.out.println(pairs); //[Sales=400, HR=200, IT=100, Admin=300] --> print out the same thing

        for(Map.Entry<String, Integer> pair : pairs) {
            System.out.println(pair); // Sales=400
                                       //HR=200
                                      // IT=100
                                      // Admin=300
        }
        // Example by analogy:
        /*
        one thing of this:

        int[] arr = {1,2,3,4}; --> is int data type
        for(int ....)

        Set<Map.Entry<String, Integer>> pairs = map.entrySet();
        for(Map.Entry<String, Integer> ....) --> is data type




         */







        }
    }
