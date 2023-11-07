package mapPractice;

import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args) {

        Hashtable<String,Integer> table = new Hashtable<>();

        table.put("Alex", 25);
        table.put("David", 30);
        table.put("Tom", 22);

        System.out.println(table); // {Alex=25, Tom=22, David=30}

       // table.put(null, 45); // NullPointerException
        // table.put("Sharik", null); // NullPointerException

        System.out.println(table.values()); // [25, 22, 30]
        System.out.println(table.keySet()); // [Alex, Tom, David]


    }
}
