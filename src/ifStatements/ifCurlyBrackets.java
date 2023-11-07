package ifStatements;

public class ifCurlyBrackets {
    public static void main(String[] args) {

        if(5>4) {
            System.out.println("Hello");
            System.out.println("This");
            System.out.println("");
        }
        /* block without curly brackets - if statement is true --> both lines are printed,
        but when the statement is false - only the second one is printed, because it is out of the if statement.
        Only first line is getting affected (acting as is inside in the brackets.
        */
        if(6>3)
            System.out.println("****");
            System.out.println("!!!!!!!");

        int capacity = 30, studentNumber = 25;

        if(capacity>studentNumber)
            System.out.println(" bbb ");









    }
}
