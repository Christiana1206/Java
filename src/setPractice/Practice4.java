package setPractice;

import java.util.HashSet;

public class Practice4 {
    public static void main(String[] args) {
        /*
        use set into your solution to find out repeating elements from given array
        print out those repeating elements -> blue, black
        clue: try to add the given colors into a set
         */




        //Intervju Question
        String[] colors = {"red","blue", "blue", "blue", "yellow", "white", "black", "black", "purple"};

            HashSet<String> hashSet = new HashSet<>();
        for(String color : colors){
            if(!hashSet.add(color)){
                System.out.println(color);
            }

        }

    }
}
