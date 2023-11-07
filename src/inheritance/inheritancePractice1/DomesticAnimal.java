package inheritance.inheritancePractice1;

public class DomesticAnimal extends Animal{


    String size;

    public void hunt(){

        System.out.println("Domestic animal is hunting");
    }

    public void jump(){

        System.out.println("Domestic animal is jumping");
    }

    //return type has to be the same or covariant
    //primitive has no covariant
    //object/child type of that object
    public Number relax(){
        System.out.println("Domectic Animal is relaxing");
        return 0;

    }

    public WildAnimal takingNap(){
        System.out.println("Domestic Animal taking a nap");
        return new WildAnimal(); // --> must be an object
    }



}
