package projectDayElmar;

public class LoopsPractice {
    public static void main(String[] args) {
        // Loops
        //For loop - it is the way iterates elements

        int range = 5;
        // Initialization/ Condition /Increment (Increment ++/ Decrement --)

        for (int i = 0; i <= range; i++) {
            System.out.println(i);
        }
        System.out.println("==================");

        // Descending // 4-> 3-> 2-> 1 ->0
        for (int j = range; j >= 0; j--) {
            System.out.println(j);
        }

        /* Task: Find all squares fir numbers from 1 to 7
        Output:
        1*1=1
        2*2=4
        ....
         */

        for(int num=1; num<=7; num++){
            System.out.println(num+" * "+ num+" = "+num*num);
        }

        int sum = 2;
        for(int n =2; n <= 10; n++){
            sum+=n;
        }
        System.out.println(sum); //+2+2+3....+10 = 56

        String cart = ""; //length = 0
        System.out.println(cart.length());
        cart = "Batch#18";


        String word = ""+'a'+'b';
        System.out.println(word); // ab

    }
}