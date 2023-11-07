package objectPractice;

public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Tesla");
        Car car3 = new Car("Audi");
        Car car4 = new Car("Lexus");
        Car car5 = new Car("BMW");


        car1.move();
        car4.move();


        car2 = null;
        car3 = null;
        System.gc();



       // car2.move(); --> NullPointerException


        //overload move method and call it in the test class
        //"Car is speeding to get to the "
        car1.move("office");
        car4.move("home");



    }
}
