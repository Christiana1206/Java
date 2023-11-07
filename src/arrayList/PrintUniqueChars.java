package arrayList;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueChars {


    // Given string.
    //Method should return string where string should
    //contain only unique chars

    //String result = method(str) {}
    //sout(result)

    //Input: "I am the happiest person in the world!"
    //Output: "I am the hpis ron wld!"
    //Set<Character> chars = new HashSet<>();
    //chars.add(ch) -> return boolean


    public static String unique(String str) {
        String result = "";
        String[] words = str.split(" ");
        Set<Character> chars = new HashSet<>();
        for (String word : words) { //String[] -> String
            for (int i = 0; i < word.length(); i++) { ////String -> Character
                if (chars.add(word.charAt(i))) {
                    result += word.charAt(i);


                }

            }
            result += " ";
        }
        return result;
    }
        public static void main (String[] args){

        String str = "I am the happiest person in the world!";
        String result = unique(str);
            System.out.println(result);




         //   Set<Character> chars = new HashSet<>();
          //  System.out.println(chars.add('A'));

        }


    }


