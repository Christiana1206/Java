package exceptions;

public class Practice1 {
    public static void main(String[] args) {

        //once you divide a number by 0 ->

        System.out.println("THIS IS MY START");

        try {
            String str = "453A";
            int number = Integer.parseInt(str);
            System.out.println("number from string is>>"+(number+1));

            int result = 10 / 0;
            System.out.println(result); ///ArithmeticException: / by zero



        }catch (IllegalArgumentException illegalArgumentException){
            System.out.println("This is from the catch block");
            System.out.println(illegalArgumentException.getMessage());
        }catch (ArithmeticException arithmeticException){
            System.out.println("This is from the catch block2 - arithmetic");
        }

            System.out.println("THIS IS THE END");

        //handling Exception are not interrupting your flow and even your code has some exceptions/problems,
        // we are not shutting down everything
        }
    }

