package ifStatements;

public class ElsePractice {
    public static void main(String[] args) {

        int capasity = 20, studentNumber = 19;

        // we have a spot for you " when studentNumber is less than capasity
        // we do not have a spot for you, you may want to wait for the next batch

        int a = 25*5, b = a+100;
        System.out.println("the number b: " +b);

        if(capasity>studentNumber) {
            System.out.println("we have a spot for you");
        } else {
            System.out.println("we do not have a spot for you");
        }
        System.out.println("This is after the first if-else practice");

        if(b>150){
            System.out.println("the number b is greater than 150");
        } else {
            System.out.println("the number b is less than 150");
        }
// I can have else statement if do not have curly-brackets
        if(4>5)
            System.out.println("IF");
         //   System.out.println("boo");
        else {  // now the Else is confused because the second sout blockets it, it happens without curly-brackets
            System.out.println("ELSE");
            // can I have multiply Else-s ?
                System.out.println("boo");
            }

        }

    }

