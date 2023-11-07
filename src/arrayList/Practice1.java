package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {

        //create arrayList

        ArrayList fruits = new ArrayList(); // 1-way
        ArrayList<String> fruits1 = new ArrayList<>(); // 2-specify, that my fruits will be stored sa a String
        ArrayList<String> fruits2 = new ArrayList<String>();// i can specify also in the second part

        List fruits3 = new ArrayList(); // another way
        List<String> fruits4 = new ArrayList<>();// specify with String

        System.out.println(fruits1); // []
        System.out.println(fruits); // []
        System.out.println(fruits4); // []

        System.out.println(fruits.size()); //0 because nothing inserted in array list

        //store fruits into the ArrayList
        fruits1.add("Grape");
        fruits1.add("Orange"); // just one in the pack
        fruits1.add("Apple");
        fruits1.add("Melon");

        System.out.println(fruits1); //[Orange, Apple, Melon]



        //What is the difference between Array and ArrayList
        //size -> we didn't define the size from the start as soon as I put an object in the ArrayList -> accept it
        //index -> we didn't specify the index, it kept the insertion order (I put something in-> it gets started on the next position)

        fruits1.size(); //give how many elements stored in arrayList(count of elements)
        System.out.println( fruits1.size());//4

        int[] numbers = new int[4];
        System.out.println(numbers.length); //4

        //indexing, inserts element at that index and pushes the rest down
        fruits1.add(2, "Lemon"); //replace apple to Lemon
        System.out.println(fruits1);

        fruits1.add("kiwi"); //just will add it in the end
        System.out.println(fruits1);

        //how to rich out the orange
        System.out.println(fruits1.get(1)); //Orange

        /*
        add() -> add element
        get() -> get the element
        size()-> check the number of elements
        print the whole arrayList

        -print each element inside my arrayList one at a time

         */

        System.out.println("==============================");


        for(int i =0; i < fruits1.size(); i++){
            System.out.println(fruits1.get(i));

        }

        for(String fruit : fruits1){
            System.out.print(fruit+" ");
        }


    }
}
