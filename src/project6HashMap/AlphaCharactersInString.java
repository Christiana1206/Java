package project6HashMap;

public class AlphaCharactersInString {
    public static void main(String[] args) {
        // alpha characters in a string

        String given = "1950:#98&mnlK08&v$x#@;?g56";

        String replaced = given.replaceAll("[^A-Za-z]", "");
        System.out.println(replaced.length());
    }
}
