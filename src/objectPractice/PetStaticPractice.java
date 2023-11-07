package objectPractice;

public class PetStaticPractice {

    String name;
    int age;
     static int foodAmount = 20;

    //create a constructor to initialize only the name and age of the pet


    public PetStaticPractice(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //create the method to feed these animals, if one pet eats it decreases foodAmount by 1 pound

    public static void eat(){
            foodAmount = foodAmount - 1;
        //System.out.println(name+" is eating. New food Amount is: "+foodAmount);
        System.out.println("is eating. New food Amount is: "+foodAmount);
        //non-static cannot come into a static field without the help of an object
        }

    }


