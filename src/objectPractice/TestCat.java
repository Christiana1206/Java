package objectPractice;

public class TestCat {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "Tom";
        cat.run("Jerry's house");
        cat.foodAmount = 2;
        cat.run("class");



        System.out.println("=========================");
        System.out.println(cat.color);
        cat.color = "Gray";
        System.out.println(cat.color);

        cat.setColor("pink");
        System.out.println(cat.color);

        cat.setFoodAmount(5);
        System.out.println(cat.foodAmount);
        cat.setGender('M');
        System.out.println(cat.gender);
        //we created a method to assign a value


        System.out.println("+++++++++++++++");
        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println(cat.getGender());
        System.out.println(cat.getFoodAmount());





    }
}
