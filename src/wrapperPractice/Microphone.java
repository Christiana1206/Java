package wrapperPractice;

public class Microphone {

        /*
        -Create 'Microphone' class with instance fields of brand, color, price all as string,
    -create a constructor to initialize all instance fields,
    -create a method that will find the microphone with price less than $50 and print >> "Found it! Price is: "
    -create 'Test' class,
    -create few microphone objects and store them in an array
    -pass the array to method call --> priceChecker(), to find cheapest product
         */

    String brand, color, price;

    public Microphone(String brand, String color, String price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public static void priceChecker(Microphone[] microphones){
        for(int i = 0; i < microphones.length; i++){
            double price = Double.parseDouble(microphones[i].price);
            if(price < 50){
                System.out.println("Found it! Price is: "+price);
                System.out.println("**info : brand "+microphones[i].brand);
                System.out.println("**info : color "+microphones[i].color);
            }

        }

    }
}
