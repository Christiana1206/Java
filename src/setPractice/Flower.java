package setPractice;

import java.util.HashSet;

public class Flower {

    String type, color, size; //(small, medium, large)
    Double price;

    public Flower(String type, String color, String size, Double price) {
        this.type = type;
        this.color = color;
        this.price = price;

        if (this.size != null && (this.size.equalsIgnoreCase("small")
                || this.size.equalsIgnoreCase("medium")
                || this.size.equalsIgnoreCase("Large"))) {
            this.size = size;
        } else {
            this.size = "SMALL";


        }


    }
}















