package loops;

public class WhilePractice6 {
    public static void main(String[] args) {


        // >> print out every single character from the given string (S, a, t, u, r, d, a, y)

/*
        int index = 0;
       // int numLetter = str.indexOf(str.charAt(index));

        char letter = str.charAt(index);

        while(index<str.length()){
            System.out.println(letter);
            index++;
        }

*/     String str = "Saturday";

       int index = 0;

       while(index < str.length()) {
           if(index != str.length()-1) {
               System.out.print(str.charAt(index)+", ");
           } else {
               System.out.print(str.charAt(index));
           }
           index++;

       }
/*
           if (index == str.length() - 1) {
               System.out.print(str.charAt(index));

           } else {
               System.out.print(str.charAt(index) + ", ");
           }

           index++;

 */



       /*

       System.out.print(str.charAt(index)); // print - will print in one line
           index++;

       System.out.print(str.charAt(index)+ ", "); S, a, t, u, r, d, a, y,


       without last comma and space:

       if(index == str.lenght()-1){
       sout(str.charAt(index)):

       } else {
       sout(str.charAt(index)+", ");

       }
       index++;


        */









        }

    }

