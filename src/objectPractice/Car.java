package objectPractice;

public class Car {
    /*
    TASK:
    -Create a Car Class
    -create instance field for a name of the car
    -create one move(), it will just print out "car is moving"
    -
    -create a constructor(initialize instance variable)
    -test this class by creating a few objects and somehow making some objects
    ready for garbage collector
    -call the gc()
    -make sure garbage collector works
    */


    String name;


    public void move() {
        System.out.println(name + " is moving");

    }

    public Car(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Collecting garbage");

    }

    public void move(String location) {
        System.out.println(name + " is speeding to the " + location);

    }
}




