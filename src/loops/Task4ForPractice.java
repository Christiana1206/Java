package loops;

public class Task4ForPractice {
    public static void main(String[] args) {
        /*
count how many letters are in the string >>> "There are ..4.. letters in the String"
count how many digits are in the string >>> "There are ..4.. digits in the String"
count how many other symbols are in the string >>> "There are ..2.. other symbols in the String"
 */


        String str = "345sfhA#*1";

        int symbolCounter = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(ch >= '0' && ch <= '9') && !(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')) {
                symbolCounter++;

            }
        }
        System.out.println("There are " + symbolCounter + " other symbols in the String");



    }
}
