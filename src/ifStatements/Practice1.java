package ifStatements;

public class Practice1 {
    public static void main(String[] args) {

        int apples = 4;
        int oranges = 9;

        // "Hi" only if the last number of apples are less than the number of oranges
        System.out.println("Hi"); // Hi

        if (apples < oranges) {

            System.out.println("Hi");
        }
        System.out.println("This is before the if condition");

        // Task: print "there are same number of fruits" when apples and oranges are the same amount

        if (apples == oranges) {
            System.out.println("there are same number of fruits");


        }

    }
}
