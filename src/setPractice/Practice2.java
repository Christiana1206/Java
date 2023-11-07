package setPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        hashSet.add("apple");               linkedHashSet.add("apple");                 treeSet.add("apple");
        hashSet.add("orange");              linkedHashSet.add("orange");                treeSet.add("orange");
        hashSet.add("grape");               linkedHashSet.add("grape");                 treeSet.add("grape");
        hashSet.add("kiwi");                linkedHashSet.add("kiwi");                  treeSet.add("kiwi");
        hashSet.add("melon");               linkedHashSet.add("melon");                 treeSet.add("melon");

        System.out.println("H"+hashSet);    System.out.println("L"+linkedHashSet);      System.out.println("T"+treeSet);

        System.out.println("-----------------------------------------------------------------------------------------");

        hashSet.add(null);                  linkedHashSet.add(null);                    //treeSet.add(null);
        System.out.println("H"+hashSet);    System.out.println("L"+linkedHashSet);      System.out.println("T"+treeSet);

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println(treeSet.descendingSet());

        System.out.println(treeSet); // the opposite

        treeSet.pollFirst(); //removes the first element in treeSet
        System.out.println(treeSet);

        treeSet.pollLast(); //removes the last element in treeSet
        System.out.println(treeSet);


    }
}
