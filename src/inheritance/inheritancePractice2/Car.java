package inheritance.inheritancePractice2;

public class Car extends Vehicle{
    /*
    -Vehicle
  Variables:
  	protected model;
  	default year;
  	public brand;
  Methods:
  	public drive(); --> vehicle is moving
  	public stop();  --> return true, vehicle is stopping
  	protected start(); --> return true, vehicle is starting
  	default accelerate(); --> return <OneOfObject-Vehicle_Car>
-Car
  *extends Vehicle
  Variables:
   	model;
   	engineType;
  Methods:
  	Override drive(); --> Car is moving
  	Override accelerate(); --> return COVARIANT-TYPE and calls model from parent class
     */

    String model;
    String engineType;

    @Override
    public void drive(){
        System.out.println("Car is moving");
    }

    @Override
    public Car accelerate(){
        System.out.println("Car is getting faster");
        System.out.println(super.model);
        System.out.println(model);
        return new Car();
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(); // --> create a Vehicle object
        vehicle.drive(); // vehicle is moving
        vehicle.accelerate(); //vehicle is getting faster

        Car car = new Car();  // --> create a Car object
        car.drive(); // Car is moving
        car.accelerate(); // Car is getting faster

        car.model = "Prius";
        car.accelerate();
    }



}
