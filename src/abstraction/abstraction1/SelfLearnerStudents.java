package abstraction.abstraction1;

public  abstract class SelfLearnerStudents extends Student{ // I made it abstract, so now I don't need to implement all abstract methods
    public SelfLearnerStudents(String name, int age){
        super(name, age);
    }

    public void attend(){
      System.out.println("SelfLearner students are studying from youtube");
    }
    public abstract void read();     //because it's abstract class, it can have also abstract methods



    }



