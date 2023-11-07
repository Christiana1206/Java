package loops;

public class ContinuePractice {
    public static void main(String[] args) {



        LABEL1: // name for Loop
        for (int i = 0; i <= 20; i++) {
            //continue;
            if(i>5 && i<8 ||i==11)continue; // skips the 6-7 iteration and also 11
            System.out.println("------------i-----------" + i);

            lABEL2:
            for (int k = 0; k <= 20; k++) {
               if(k<10)continue; // can't effect the LABEL1: if(k<10)continue LABEL1; //--> skip the first 10 iteration of inner loop
                System.out.println("K - " + k);



            }
        }
    }
}