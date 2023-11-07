package inheritance.inheritancePractice1;

public class Dog extends DomesticAnimal{

    @Override
    public void jump(){

        System.out.println("Dog jumps on the sofa");
    }
    @Override
    public Integer relax(){
        System.out.println("Dog is relaxing");
        return 0;
    }
    @Override
    public Lion takingNap(){ // covariant
        System.out.println("Dog is taking a nap");
        return new Lion();  // for object should be new object return
    }

}
