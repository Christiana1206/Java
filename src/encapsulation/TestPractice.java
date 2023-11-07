package encapsulation;

public class TestPractice {
    public static void main(String[] args) {

        Practice john = new Practice();
        john.setAge(21);

        //how  can I print out a message like "I am 21 years old"

        System.out.println("I am "+ john.getAge()+" years old");

        System.out.println("===================================");

        //This Process of making a field private the using setters(initialize variables) and getters(returning variables)
        // is known as Encapsulation

        //for next 5 years print out john's age >> 22,23,23,25,26


        int age = john.getAge();

        for(int i = 0; i < 5; i++){

            System.out.println("I am "+ ++age + " years old");
        }

        /*

        Yes you can access the data with getters and setters
        but, you cannot access the inside of the code(implementation) which limits/restricts you
        they cannot manipulate your conditions/implementation

         */




    }
}
