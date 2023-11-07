package exceptions;

import abstraction.abstraction2.Fish;

public class Practice2 {

    //create a run method that takes a String array as a parameter
    //this method will concat "***" for each String in the array
    //use try and catch to handle the exceptions present:


    /*
    public static void run(String[] items) {
        for (String item : items) {
            System.out.println(item.concat("***"));
        }catch(NullPointerException) {


        }
    }


     */

    public static void main(String[] args) {

        String[] items = {"Phone", "Ipad", null, "Microphone"};
       // run(items);

        Fish fish = new Fish();
        fish.swim();
        fish.dive();

    }
}
