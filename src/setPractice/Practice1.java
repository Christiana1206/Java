package setPractice;

import java.util.HashSet;

public class Practice1 {
    public static void main(String[] args) {

        HashSet set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();



        set2.add("Alex");
        set2.add("Sharik");
        set2.add("David");
        set2.add("Vlad");
        System.out.println(set2); //[Alex, Sharik, Vlad, David]

        //hashset will not have duplicate values
        set2.add("Alex");
        System.out.println(set2);

        set2.add(null);
        System.out.println(set2); //[null, Alex, Sharik, Vlad, David]

        set2.add(null);
        System.out.println(set2); //[null, Alex, Sharik, Vlad, David] -> duplicate no

        //size()
        System.out.println(set2.size()); //5

        //reach out every elements one by one and say hi to each of them> Hi Alex


        for (String name : set2) {
            System.out.println("Hi " + name);
        }

        //Alex@school by using concat method
        // for (String name : set2) {
        //.out.println(name.concat("@school"));
        //}

        //I still want to create Alex@school by using concat method for other students besides the null
        for (String name : set2) {
            if (name != null) {
                System.out.println(name.concat("@school"));
            }
        }
        System.out.println("===================================");



        //I want to say everyone is @school but David is @home
        for (String name : set2) {
            if (name != null && name != "David") {
                System.out.println(name.concat("@school"));
            } else if (name == "David") {
                System.out.println(name.concat("@home"));
            }
        }
        System.out.println("===================================");

        //nested loop
        for (String name : set2) {
            if (name != null) {
                if (name != "David") {
                    System.out.println(name.concat("@school"));
                } else {
                    System.out.println(name.concat("@home"));

                }
            }
        }
        System.out.println("====================================");
        System.out.println(set2); //[null, Alex, Sharik, Vlad, David]
        set2.remove(null);
        System.out.println(set2); //[Alex, Sharik, Vlad, David]

        set2.remove("Alex");
        System.out.println(set2); //[Sharik, Vlad, David]
    }
}


