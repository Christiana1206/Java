package arrayList;

import java.util.ArrayList;

public class Computer {
    @Override
    public String toString() {
        return "Computer{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                '}';
    }

     /*
    create a Computer class
    -with make, model, price, and screenSize instance variables
    -constructor to initialize all instance variables
    -method that will find out computers that has price range in $500 - $1300
    create a Store class
    -have list of computers
    -call method to find out those computers
    make    model           price     screen
    apple   macbook pro     1300      13.5
    apple   macbook pro     2000      16
    HP      Envy            1100      15.0
    Lenovo  ThinkPad        400           16
     */

    String make, model;
    double price, screenSize;

    public Computer(String make, String model, double price, double screenSize) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }

    public static void priceRange(ArrayList<Computer> computers) {
        for (int i = 0; i < computers.size(); i++) {

            if (computers.get(i).price >= 500 && computers.get(i).price <= 1300) {
                System.out.println(computers.get(i).make + " " + computers.get(i).model + " is in your price range");
            }
        }
    }


    public static Computer priceRange2(ArrayList<Computer> computers) {

        Computer computer = null;   // instead of =>   String str = "";

        for (int i = 0; i < computers.size(); i++) {

            if (computers.get(i).price >= 500 && computers.get(i).price <= 1300) {
                computer = computers.get(i);
            }
        }
        return computer;

/*
        public static ArrayList<Computer> priceRange3(ArrayList<Computer> computers) {

            ArrayList<Computer> devices = new ArrayList<>();

            for (int i = 0; i < computers.size(); i++) {

                if (computers.get(i).price >= 500 && computers.get(i).price <= 1300) {
                    devices.add(computers.get(i));
                }
            }
            return devices;


        }

 */
    }
}





