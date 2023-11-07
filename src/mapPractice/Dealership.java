package mapPractice;

import java.util.HashMap;

import static mapPractice.Car.maintenance;

public class Dealership {
    public static void main(String[] args) {

        Car car1 = new Car("white","Nissan", "altima", "123DC", 2023);
        Car car2 = new Car("black", "Lexus", "L", "234KF", 2012);
        Car car3 = new Car("red", "Mustang","M", "345PA", 2014);
        Car car4 = new Car("silver", "Cadillac", "G", "567RN", 2022 );


        HashMap<String, Car> cars = new HashMap<>();

        cars.put(car1.VIN, car1);
        cars.put(car2.VIN, car2);
        cars.put(car3.VIN, car3);
        cars.put(car4.VIN, car4);

        maintenance(cars);


    }
}
