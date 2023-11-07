package switchStatement;
import java.util.Scanner;
public class nestedSwPr1 {
    public static void main(String[] args) {


        /*
        REPRESENT FOLLOWING WITH NESTED SWITCH:
        You made a call and were given the following EXTENSIONS FOR WHICH DEPARTMENTS you want to talk with
        -Once department is chosen ->You have a choice on who to speak with
        HR          →   1   --> Alex / David
        IT          →   2   --> Sam/Jenny
        ADMIN       →   3
        RECEPTION   →   4
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the following EXTENSIONS FOR WHICH DEPARTMENTS you want to talk with: " +
                "\nHR - 1 \nIT - 2 \nADMIN - 3 \nRECEPTION - 4");
        int department = scanner.nextInt();

        switch (department){
            case 1:
                System.out.println("you  are talking with HR departmet, choose a person to speak with" + " \n - Alex \n - David");
                String name = scanner.next().toLowerCase();
                switch (name) {
                    case "alex":
                        System.out.println("You are speaking with " + name);
                        break;
                    case "david":
                        System.out.println("You are speaking with " + name);
                        break;
                    default:
                        System.out.println("there is no such person");
                        break;
                }
                break;

            case 2:
                System.out.println("This is IT, who are you choosing to talk with" + " \n- Sam \n - Jenny");

                String name1 = scanner.next().toUpperCase();
                switch (name1) {
                    case "SAM":
                        System.out.println("You are speaking with " + name1);
                        break;
                    case "JENNY":
                        System.out.println("You are speaking with " + name1);
                        break;
                    default:
                        System.out.println("there is no such person in IT");
                        break;
                }
                break;

            case 3:
                System.out.println("you  are talking to ADMIN departmet");
                break;
            case 4:
                System.out.println("You are speaking with Reception");
                break;
            default:
                System.out.println("ppp");
                break;


        }

    }
}
