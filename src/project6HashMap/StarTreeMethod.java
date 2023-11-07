package project6HashMap;

public class StarTreeMethod {

    public static void printSpace(int space){

        if (space == 0)
            return;
        System.out.print(" ");

        printSpace(space - 1);

    }
    public static void printStar(int asterisk){

        if(asterisk == 0)
            return;
        System.out.print("*");

        printStar(asterisk - 1);

        }

        public static void pattern(int n, int num){

        if (n == 0)
            return;
        printSpace(n - 1);
        printStar(num - n + 1);
            System.out.println("");

            pattern(n - 1, num);

    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n, n);
    }
}
