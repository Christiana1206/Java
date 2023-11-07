package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice4 {
    /*
    create a method that will take a map<Integer, String>
    this method will print all keys from map
     */



    public static void printKeys(Map<Integer, String> map) {
        System.out.println(map.keySet()); //[1, 2, 3]

        //print each key one by one

        for (Integer key : map.keySet()) { //because it will return us all  keys, Integer -> because store only objects
            System.out.println("---" + key + "---"); // 1
                                                     // 2
                                                     // 3
        }

    }

    // to make it return all the values as a list (we need to change our return type)
    public static List<String> printValues(Map<Integer, String> map) {
        List<String> valueAsList = new ArrayList<>();
        System.out.println(map.values()); // {1=corolla, 2=X7, 3=EX350}

        for (Integer key : map.keySet()) {
            System.out.println(map.get(key)); // map.get(key) - it gives me a set of individual value : [corolla, X7, EX350]
        }
            return valueAsList;

        }




        public static void main(String[] args){
            HashMap<Integer, String> cars = new HashMap<>();
            cars.put(1, "corolla");
            cars.put(2, "X7");
            cars.put(3, "EX350");
            printKeys(cars); //[1, 2, 3]
            System.out.println(cars); //{1=corolla, 2=X7, 3=EX350}

           System.out.println(printValues(cars));
        }


    }







