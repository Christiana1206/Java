package stringMethods;

public class Practice3 {
    public static void main(String[] args) {

        // toUpperCase(); --> will modify your string, every single letter will be converted to upper/lower case letters
        // toLowerCase();


        String str = "SElenium";
        str = str.toLowerCase();
        System.out.println(str);


        str = "SElenium";
        str = str.toUpperCase();
        System.out.println(str);


      // indexOf(); --> will take the char or string as a parameter and will return the index number of the first matching char

        int positionOfLetterS = str.indexOf('S');

        System.out.println(positionOfLetterS); //0


     // if there are multiple matching chars, but we are looking for the second matching char's indexNumber


        String str1 = "Together";
      int num = (str1.indexOf('e', 2));
      System.out.println(num); // 3
         System.out.println(str1.indexOf('e', 4)); // 6

        System.out.println(str1.indexOf("eth")); // e - only the first one letter




      /*
 Task: Please create a new class called Task1 under stringMethods
 get a String from user via scanner and print out:
- first char
- last char
- indexOf second matching letter 'c'
- length of string
- index of x
- middle char
  */

String name = "capital";

char firstCh = name.charAt(0);
        System.out.println(firstCh);

        char lastCh = name.charAt(name.length()-1);
        System.out.println(lastCh);

        int indSecondA= name.indexOf('a', name.indexOf('a')+1);
        System.out.println(indSecondA);

        System.out.println(name.length());

        int indexOfL = name.indexOf("l");
        System.out.println(indexOfL);

        char middleCh = name.charAt(name.length()/2);
        System.out.println(middleCh);




    }
}
