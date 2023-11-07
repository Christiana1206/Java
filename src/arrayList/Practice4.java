package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice4 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("White");
        colors.add("Red");
        colors.add("Black");
        System.out.println(colors);

        // remove()
        colors.remove("Blue");
        System.out.println(colors);

        colors.remove("Red");
        System.out.println(colors); // remove firs red  [White, Red, Black]
        colors.remove(1); // overloading
        System.out.println(colors); //[White, Black]

        Boolean b = colors.remove("BLACK");
        System.out.println(b); //false

       // Boolean b1 = colors.remove(5); doesn't work



        //set()
        String str = colors.set(1, "ORANGE");
        System.out.println(colors); //[White, ORANGE]
        System.out.println(str); //Black --> because we replaced the black --> ? from Java: so what str do we replace - Black !!

        String str1 = colors.set(0, "pink");
        System.out.println(str1); // white
        System.out.println(colors);// [pink, ORANGE]
        System.out.println(colors.get(0)); //pink

        //clear

        colors.clear();
        System.out.println(colors); //[]

        //isEmpty()
        System.out.println(colors.isEmpty()); //true

        colors.add(null);
        colors.add(null);
        System.out.println(colors.isEmpty()); //false

        //contains()
        System.out.println(colors.contains("Purple")); //false

        colors.add("Violet");
        System.out.println(colors.contains("Violet")); //true

        ArrayList<String> cars = new ArrayList<>();
        cars.add("KIA");
        cars.add("BMW");
        cars.add("Volga");

        System.out.println(cars); // [KIA, BMW, Volga]

        //addAll() -> if you have one list and want to combine it with another list

        cars.addAll(colors);
        System.out.println(cars); //[KIA, BMW, Volga, null, null, Violet]
        System.out.println(colors); //[null, null, Violet]

        ArrayList<Integer> plateNumbers = new ArrayList<>();
        plateNumbers.add(12);
        plateNumbers.add(23);
        plateNumbers.add(41);

        //cars.addAll(plateNumbers); -> data types do not match








    }
}
