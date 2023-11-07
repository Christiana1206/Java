package switchStatement;
import java.util.Scanner;
public class nestedSwitchPractice {
    public static void main(String[] args) {
        /*
REPRESENT FOLLOWING WITH NESTED SWITCH:
You made a call and were given the following EXTENSIONS FOR WHICH DEPARTMENTS you want to talk with
-Once department is chosen ->You have a choice on who to speak with

HR          →   1   --> Alex / David
IT          →   2
ADMIN       →   3
RECEPTION   →   4
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please select from the following options: " + "\nHR - 1 \nIT - 2 \nADMIN - 3 \nRECEPTION - 4");
        int department = scanner.nextInt();

        switch (department) {


            case 1:
                System.out.println("This is HR, who do you want to speak with? \nAlex \nDavid" );
                String name = scanner.next().toLowerCase();
                switch (name) {
                    case "alex":
                        System.out.println("You are speaking with " + name);
                        break;
                    case "david":
                        System.out.println("You are speaking with " + name);
                        break;
                    default:
                        System.out.println("There is no such person in HR");
                }
                break;


            case 2:
                System.out.println("This is IT, who do you want to speak with? \nSam \nJenny");
                String name1 = scanner.next().toLowerCase();
                switch (name1) {
                    case "sam":
                        System.out.println("You are speaking with " + name1);
                        break;
                    case "jenny":
                        System.out.println("You are speaking with " + name1);
                        break;
                    default:
                        System.out.println("There is no such person in IT");
                }
                break;

            case 3:
                System.out.println("ADMIN");
                break;

            case 4:
                System.out.println("RECEPTION");
                break;

            default:
                System.out.println("There is no such department");
                break;
        }
        }


    }

