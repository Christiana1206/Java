package arrayList;

import java.util.ArrayList;

public class Practice2 {


    /*
    Task1:
    create a method that will print out names of drinks from an ArrayList
    the method will print out the drink's name as uppercase
    ex:
    water -> WATER
    coke -> COKE
     */

    public void drinkPrinter(ArrayList<String>drinks) {


        for (String drink : drinks){
            System.out.println(drink.toUpperCase());
    }
    }
                   // other way
    public void drinkPrinter1(ArrayList<String>drinks) {


        for (int i = 0; i < drinks.size(); i++){
            System.out.println(drinks.get(i).toUpperCase());
        }
    }

    //Task2: create a method to print out drinks with names that has 5 or more letters


    public void letterCounter(ArrayList<String>drinks){
        /*
         for(String drink : drinks){
             if(drink.length() >= 5){
                 System.out.println(drink);
             }
             */

        for (int i = 0; i < drinks.size(); i++){
            if(drinks.get(i).length() >= 5){
                System.out.println(drinks.get(i));
            }
        }



         }





    public static void main(String[] args) {

        Practice2 practice2 = new Practice2(); // we need to create an object, because the method is not static

        ArrayList<String> beverages = new ArrayList<>();

        beverages.add("water");
        beverages.add("water"); // ArrayList can store duplicate
        beverages.add("coke");
        beverages.add("tea");

        practice2.drinkPrinter(beverages);

        System.out.println("---------------");

        practice2.drinkPrinter1(beverages);

        System.out.println("================");

        practice2.letterCounter(beverages);


    }

}
