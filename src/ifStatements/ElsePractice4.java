package ifStatements;
import java.util.Scanner;
public class ElsePractice4 {
    public static void main(String[] args) {
        /*
a student will have 3 test from a class
to pass the class, the student's average of those 3 tests have to be 70 or more
and student's attendance for the class also has to be 80 percent or more

- get those three test scores and their attendance rate from user
- Calculate average score and let student know what his/her final results were

"You are eligible to pass the class"
"try again next year"
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first exam score");
        int firstScore = scanner.nextInt();

        System.out.println("Enter your second exam score");
        int secondScore = scanner.nextInt();

        System.out.println("Enter your third exam score");
        int thirdScore = scanner.nextInt();

        System.out.println("Enter your attendance rate");
        int attendanceRate = scanner.nextInt();

        if ((firstScore+secondScore+thirdScore)/3 >= 70 && attendanceRate >=80) {
            System.out.println("You are eligible to pass the class");
        } else {
            System.out.println("try again next year");
        }






    }
}
