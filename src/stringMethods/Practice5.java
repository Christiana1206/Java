package stringMethods;

public class Practice5 {

    public static void main(String[] args) {

        // replace()
        String str = "java";
        str.replace('a', '$');
        System.out.println(str); // we didn't re-assign it


        str = str.replace("j", "k");
        System.out.println(str); // kava


      str = "do whatever it takes";
        str = str.replace(" g ", "");


        // Task: change all 't' 's to '*'

        System.out.println(str.replace('t', '*'));



        str = str.replace(" ", "-*-");
        System.out.println(str); // do-*-whatever-*-it-*-takes -- > every space will replace by this symbol -*-



        // trim(); -- > removes leading and ending spaces from string from string
        // ex: " Thursday is tomorrow ";
        String string = "    Thursday is tomorrow     ";
        System.out.println(string);

        string = string.trim();
        System.out.println(string);


    }
}
