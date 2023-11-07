package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class Car {
    /*
    create a ‘Car’ class
-instance variables: VIN, color, year, make, model
-constructor to intialize all instance variables
create ‘Dealership’ class
-create 4 car object and store them in a MAP
-while storing cars in the map, use their VIN as key for the map
-create a method to find out if a car in dealership needs maintenance
	->parameter for this method should be HashMap<String,Car> cars
	->if the car is 2015 or less
	->this method will show “Your car needs maintenance ....Honda..Accord”
	-> otherwise of it is newer than 2015 show “Your car is still new”
     */


    String color, make, model, VIN;
    int year;

    public Car(String color, String make, String model, String VIN, int year) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.VIN = VIN;
        this.year = year;
    }


    public static void maintenance(HashMap<String,Car> cars){
        for(Map.Entry<String, Car> entry:cars.entrySet()){
            Car car = entry.getValue();
            if(car.year < 2015){
                System.out.println("Your car needs maintenance "+car.make+" "+car.model);
            }else{
                System.out.println("your car is still new "+car.make+" "+car.model);
            }


        }
    }
}


