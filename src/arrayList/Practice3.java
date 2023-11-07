package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        list1.add(12);
        list1.add("Number");
        list1.add(true);
        System.out.println(list1); //[12, Number, true]

        list1.add(0, "word");
        list1.add(0, "blueberry");
        System.out.println(list1); //[blueberry, word, 12, Number, true] -> not replace, but add new one to the index 0

        List list2 = new ArrayList<>();
        list2.add("Alex");
        list2.add(5.5);
        list2.add('T');
        System.out.println(list2);

        //print out each item in list2 one at a time
        for(int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
            for(Object item : list1){
                System.out.println(item);

            }
            
            //print out alex from list2 with the uppercase version >>ALEX
        // My version
        System.out.println(list2.get(0).toString().toUpperCase());

        for(Object item : list2){
            String eachItem = item.toString();
            if(eachItem.equals("Alex")){
                eachItem.toUpperCase();
                System.out.println(eachItem);
            }

        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(100);
        list3.add(200);
        list3.add(1, 500);
        System.out.println(list3); //[100, 500, 200]


        //list3.add(5, 777);
       // System.out.println(list3); //IndexOutOfBoundsException , nothing at index 5

        list3.add(3, 555);
        System.out.println(list3); //[100, 500, 200, 555]

        list3.add(null);
        System.out.println(list3);

        
        
        }


    }

