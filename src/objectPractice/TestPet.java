package objectPractice;

public class TestPet {
    public static void main(String[] args) {

        PetStaticPractice pet1 = new PetStaticPractice("King", 10);
        PetStaticPractice pet2 = new PetStaticPractice("Sharik", 3);


        System.out.println(pet1.name);
        System.out.println(pet1.age);
        System.out.println(pet1.foodAmount);
        pet1.eat();
        pet1.eat();



        System.out.println("--------------------");


        System.out.println(pet2.name);
        System.out.println(pet2.age);
        System.out.println(pet2.foodAmount);
        pet2.eat();

        //I want to call the eat method
        PetStaticPractice pet3 = new PetStaticPractice("Orange", 5);
        pet3.eat();

        // i can make my eat method static, I should be able to call it here without the help of the Object

        PetStaticPractice.eat();





    }
}
