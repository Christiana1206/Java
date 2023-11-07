package stringBuilderPractice;

public class Practice1 {

    public static void main(String[] args) {

        String str = "Coffee";
        str.concat("is hot");
        System.out.println(str);
        str = str.concat(" is hot");
        System.out.println(str);

        System.out.println("-----------------------");
        StringBuilder builder = new StringBuilder();
        System.out.println(builder);

        //one way to give value to the StringBuilder
        StringBuilder builder1 = new StringBuilder("Food");
        System.out.println(builder1); //Food

        //Second way to give value to the StringBuilder
        StringBuilder builder2 = new StringBuilder();
        builder2.append("Food");
        System.out.println(builder2);

        builder2.append(" is tasty");
        System.out.println(builder2);

        StringBuilder builder3 = new StringBuilder();
        builder3.append("Drink");
        builder3.append(" is cold");
        System.out.println(builder3);
        builder3.append(builder2);
        System.out.println(builder3);
        System.out.println(builder2);
        System.out.println("=============================");
        builder3 = new StringBuilder();
        System.out.println(builder3); // empty
        System.out.println("=============================");

        // write a java code to print lowercase alphabet as a single String


        String str2 = "";
        for(char ch = 'a'; ch <= 'z'; ch++){
            str2+=ch;
        }
        System.out.println(str2);


    }
}
