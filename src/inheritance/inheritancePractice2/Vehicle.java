package inheritance.inheritancePractice2;

public class Vehicle {
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
    protected String model = "Corolla";
    int year;
    public String brand;

    public void drive(){

        System.out.println("vehicle is moving");
    }

    public boolean stop(){
        System.out.println("vehicle is stopping");
        return true;
    }

    protected boolean start(){
        System.out.println("vehicle is starting");
        return true;
    }

    Vehicle accelerate(){
        System.out.println("vehicle is getting faster");
        return new  Vehicle();
    }
}
