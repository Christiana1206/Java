package primitives;

public class BooleanPractice {
    public static void main(String[] args) {
        boolean isCoffeCold = false;
        boolean isLightOn = true;

        //Whatever you say it will take it as is
        //! --> you can use ! to make opposite value for boolean

        System.out.println(isCoffeCold); // false
        System.out.println(isLightOn); // true

        int age = 55;
        String str = (age < 5) ? "toddler" :
                (age > 5 && age < 10) ? "child" :
                        (age > 10 && age < 16) ? "teenager" : "adult";

        System.out.println(str);


    }
}
