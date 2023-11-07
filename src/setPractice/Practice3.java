package setPractice;

import java.util.HashSet;

public class Practice3 {
    /*
    create a method that will take a set of String as a parameter
    this method will find out the flower type
    if the flower type is rose --> it is going to print --> "roses are the best flowers"
     */

















    public static void roseFinder(HashSet<String> flowers) {
        for (String flower : flowers) {
            if (flower.equalsIgnoreCase("rose")) {
                System.out.println("roses are the best flowers");
            }
        }
    }
    /*
    create a method to
    create a message for each flower and return those messages in a HashSet
    " .rose... smells good"
     */

    public static HashSet<String>flowerMessageCreator(HashSet<String> flowers) {
        HashSet<String> messages = new HashSet<>();
        for(String flower : flowers) {
            messages.add(flower + " smells good");
        }

                return messages;
            }

    public static void main(String[] args) {
        HashSet<String> vase = new HashSet<>();
        vase.add("lily");
        vase.add("rose");
        vase.add("sunFlower");
        roseFinder(vase);

        System.out.println(flowerMessageCreator(vase));

    }


    }



