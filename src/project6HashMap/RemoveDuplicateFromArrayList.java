package project6HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        System.out.println(numbers); // [1, 2, 3, 2, 4, 1]

        // way 1
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println(uniqueNumbers);

        //way 2

        HashSet set = new HashSet();

        for(Integer num : numbers){
            set.add(num);
        }
        System.out.println(set);





    }
}
