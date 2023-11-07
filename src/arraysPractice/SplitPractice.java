package arraysPractice;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {


        String str = "Java is getting easier. So that, I start to like it!";

        String[] parts = str.split(" ");
        System.out.println(Arrays.toString(parts)); //[Java, is, getting, easier., So, that,, I, start, to, like, it!]

        // I want to cut from somewhere else --> cut from every single letter 'a'

        String[] aSplit = str.split("a");
        System.out.println(Arrays.toString(aSplit));


        System.out.println("=======================================");

        /*
        09-17-2023
        09.17.2023
        09/17/2023
        I want to check if today is the 17th -> use split
         */

        String date = "09-17-2023";
        String dateDat = "09.17.2023";
        String dateSl = "09/17/2023";

        String[] dep = date.split("-");
        System.out.println(Arrays.toString(dep));

        String[] dat = dateDat.split("\\."); // split method doesn't recognize "."
        System.out.println(Arrays.toString(dat));

        String[] slash =  dateSl.split("/");
        System.out.println(Arrays.toString(slash));

        boolean dayToday = dep.equals(dat) && dep.equals(slash) && dat.equals(slash);

        System.out.println(dayToday);






    }
}
