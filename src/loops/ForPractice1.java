package loops;

public class ForPractice1 {
    public static void main(String[] args) {
        /*
        Print "Hello John" -- for 5 times
        ex:
        1 Hello John
        2 Hello John
        3 Hello John
        4 Hello John
        5 Hello John
         */

        // using while loop
        int number = 5, c = 1;
        while(number>0){
            System.out.println(c +". Hello John");
            c++;
            number--;
        }

        System.out.println("============USE FOR LOOP==========");

                for (int num = 5, count = 1; num > 0 ; num--, count++) {
            System.out.println(count + ". Hello Marry");

        }
       // System.out.println(count); --> local variable, can't use this outside of the loop, we need to make it Global variable

    }
}
