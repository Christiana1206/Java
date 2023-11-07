package loops;

public class BreakPractice {
    public static void main(String[] args) {


        PARENT:
        for(int i = 0; i<20; i++){
            System.out.println("i >"+i);
            if (i>10)break;



           // if (i>1) ; break;

       CHILD:
            for(int m = 0; m < 30; m++){
               // if(m>15)break;

                System.out.print("m >>"+m);
            }
           if (i>10)break; // CHILD --> you can't reach out to  inner loop out of inner loop
           System.out.println();



        }



    }
}

