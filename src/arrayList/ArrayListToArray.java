package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {

        //toArray()

        ArrayList<String> food = new ArrayList();
        food.add("Burger");
        food.add("Pizza");
        food.add("Baklava");
        food.add("Pilov");

        food.toArray(); //toArray() method returns us an Object array

        Object[] foodAsArray = food.toArray();
        System.out.println(Arrays.toString(foodAsArray)); //[Burger, Pizza, Baklava, Pilov]
        System.out.println(foodAsArray[2]);   //Baklava

    }
}
