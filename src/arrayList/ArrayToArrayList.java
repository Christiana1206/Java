package arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] cities = {"Chicago", "LA", "Denver", "Dallas", "Houston"};
        System.out.println(Arrays.toString(cities));  //[Chicago, LA, Denver, Dallas, Houston]

        //cities[5] = "Seoul";  --> Array has fixed size, because we can't add => ArrayIndexOutOfBoundsException

        //asList

        List<String> list = Arrays.asList(cities); // instead of List<String> list = new ArrayList<>();
        System.out.println(list); // [] => [Chicago, LA, Denver, Dallas, Houston]

        //list.add("Seoul"); //UnsupportedOperationException
        //list.remove("LA"); //UnsupportedOperationException






    }
}
