package stringBuilderPractice;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Evening");
        builder.append(" Chicago");
        System.out.println(builder);


        //I want to insert something before Evening
        builder.insert(0, "Good ");
        System.out.println(builder);

        //I want to insert array to the StringBuilder

        String[] colors = {"red", "blue", "red", "orange"};
        builder.insert(5, Arrays.toString(colors));
        System.out.println(builder);

        System.out.println(builder.charAt(2));
    }
}
