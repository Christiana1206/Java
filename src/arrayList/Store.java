package arrayList;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        ArrayList<Computer> items = new ArrayList<>();

        Computer c1 = new Computer("apple", "mackbook pro", 1300, 13.5);
        Computer c2 = new Computer("apple", "mackbook pro", 2000, 16);
        Computer c3 = new Computer("HP", "Envy", 1100, 15.0);
        Computer c4 = new Computer("Lenovo", "ThinkPad", 400, 16);

        items.add(c1);
        items.add(c2);
        items.add(c3);
        items.add(c4);

        Computer.priceRange(items);

        System.out.println("-------------------------------");

        System.out.println(Computer.priceRange2(items));// ->HashCode , I should override toString method
                                                        // in the Computer class (right click + Ok

        System.out.println("-------------------------------");

       // System.out.println(Computer.priceRange3(items));




    }

}
