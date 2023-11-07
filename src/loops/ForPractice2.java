package loops;

public class ForPractice2 {
    public static void main(String[] args) {
        /*
        using for loop, print out numbers between 0 and 5
         */

        for (int num = 0; num <= 5; num++) {
            System.out.println(num);
        }
        System.out.println("========leaving variable section blank=============");

        int num = 0;

        for (   ; num <= 5 ; num++) {
            System.out.println(num);
        }


        System.out.println("========reassigning variable in the variable section==");

        int a = 20; // --> now it's grey colour , because it's reassigned value

        for (a = 2; a <= 5; a++) { // now value of "a" is from the loop, because is the last value that we checked
            System.out.println(a);
        }
        System.out.println(a+ " value of a (last version) outside loop"); //6

        System.out.println("====creating new String variable in the variable section=================");

        int num1 = 0;

        for ( String str = "test" ; num1 <= 5 ; num1++) {
            System.out.println(num1);
        }

        System.out.println("====can't have different data types in the for loop variable section=====");
        /*

        int num1 = 0;

        for ( String str = "test" , int count = 5 ; num1 <= 5 ; num1++) {
            System.out.println(num1);
        }

         */


        System.out.println("====Creating new variable in the variable section to use in our code======");

        int c = 10; //

        for (double d = 500, e = 8.5 ; c <= 15; c++) {
            System.out.println(c);
           System.out.println(d);
        }

        System.out.println("========leaving update section blank=============");


        for (   int i = 0 ; i <= 5 ; ) {
            System.out.println(i); // infinite times
            i++;
        }
        System.out.println("=====leaving variable&update section blank=============");

        int i = 0;
        for (  ; i <= 5 ; ) {
            System.out.println(i); // infinite times
            i++;
        }

        /*
        System.out.println("=======INFINITE LOOP==============");

        int i1 = 0;
        for (  ;  ; ) {
            System.out.println(i1); // infinite times
            i1++;
        }



        System.out.println("=======INFINITE LOOP==============");

        for ( int i1 = 0;   ; i1++) {
            System.out.println(i1);

        }

         */







    }
}

