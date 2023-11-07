package loops;

public class Task2ForLoopPractice {
    public static void main(String[] args) {
        /*
        using char in 'for loop' print out upper case letters from alphabet -->
        A-B-C-D........
         */


        for(char firstCh = 'A'; firstCh <='Z'; firstCh++ ){
            if(firstCh == 'Z') {
                System.out.print(firstCh);
            }else{
                System.out.print(firstCh+", ");
            }

        }

















        /*
        for (char firstChar = 'A'; firstChar <= 'Z'; firstChar++) {
            if(firstChar == 'Z') {
                System.out.print(firstChar);
            } else {
                System.out.print(firstChar +"- ");
            }

}

         */

    }
}
