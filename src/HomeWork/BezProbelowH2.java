package HomeWork;
import java.util.Scanner;
public class BezProbelowH2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message");
        String str = scanner.nextLine();

        str = str.replace(" ", "");
        System.out.println(str);
        if (str.length()%2 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}



