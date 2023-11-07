package objectPractice;

public class Animal {

        // this is the template
        String name;
        String color = "red";
        int age;

        double calories;


        // above variables are called instances(features/properties of my object)

        //local variables -> variables located in a block

        // Methods -> representing the behaviours of the objects(same actions)

        public void sleep(){
                System.out.println("Animal is sleeping");
                System.out.println(name+" is sleeping");

        }
        public void eat(){
                calories += 500;
                System.out.println(color+" "+name+" is eating it's calories are increasing to "+calories);



        }





}
