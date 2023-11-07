package ifStatements;
import java.util.Scanner;
public class NestedPractice4 {
    public static void main(String[] args) {
        /*
Let's say there is a candidate for a job interview and s/he will be asked about Java, Selenium, API, SQL knowledge
first ask candidate if s/he knows Java
 if s/he says 'yes' --> ask about Selenium knowledge
   if s/he says 'yes' --> ask about API knowledge
     if s/he says 'yes' --> ask about SQL knowledge
      "Congrats! You are hired"
     if s/he says 'no' --> we need SQL knowledge
   if s/he says 'no' --> we need API knowledge
 if s/he says 'no' --> C
if s/he says 'no' --> "please learn java and try again
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("do you know Java? (yes/no) ");
        String knowledgeJava = scanner.nextLine();

        if(knowledgeJava.equalsIgnoreCase("yes")) {
            System.out.println("Do you know Selenium? (yes/no)");
            String knowledgeSelenium = scanner.nextLine();
            if (knowledgeSelenium.equalsIgnoreCase("yes")) {
                System.out.println("Do you know API knowledge? ");
                String knowledgeAPI = scanner.nextLine();
                if (knowledgeAPI.equalsIgnoreCase("yes")) {
                    System.out.println("Do you know SQL? ");
                    String knowledgeSQL = scanner.nextLine();
                    if (knowledgeSQL.equalsIgnoreCase("yes")) {
                        System.out.println("Congrats! You are hired");
                    } else {
                        System.out.println(" we need SQL knowledge");
                    }
                } else {
                System.out.println("we need API knowledge");
            }


        }  else {
                System.out.println("we need Selenium knowledge");

            }
        } else {
            System.out.println("please learn java and try again");
        }

    }
}
