package loops;

public class TaskForLoopPractice {
    public static void main(String[] args) {
        /*

        "Today is the sixteenth day of our Java class, i am not new to JAVA"
        from given string print out only letters 'a' and 'A'
         */


        String str = "Today is the sixteenth day of our Java class, i am not new to JAVA";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                System.out.print(str.charAt(i) + ", ");

            }
        }
        System.out.println("=============================");

        // find out the number of both 'a' and 'A' in the string and print the count

        String str1 = "Today is the sixteenth day of our Java class, i am not new to JAVA";

        int count = 0;
        for (int i = 0 ; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'A') {
                count++; //1
                System.out.println(str.charAt(i));
            }
            }
            System.out.println("There are total of " + count + " a/A in the string");
        }
    }

