package HomeWork;
import java.util.Scanner;
public class H4HighestCommonFactor {

    public static void main(String[] args) {


            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number 1");
            int number1 = s.nextInt();
            System.out.println("Enter the number 2");
            int number2 = s.nextInt();

            int hcf = 1;

            for(int i = 1; i <= number1 && i <= number2; i++){

                    if(number1%i == 0 && number2%i == 0){
                        hcf = i;
                    }

                }
        System.out.println(hcf);

            }





        }


