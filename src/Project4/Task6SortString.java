package Project4;

public class Task6SortString {
    public static void main(String[] args) {

/*
        String unsorted = "EedcbaA";
        String sorted = "";

        for (char c = 'a', d = 'A'; c <= 'z' ||  d <= 'Z'; d++, c++) {
            for (int i = 0; i < unsorted.length(); i++) {

                if(unsorted.charAt(i) == c || unsorted.charAt(i) == d){
                sorted += unsorted.charAt(i);

            }
        }
    }
        System.out.println(sorted);

 */

        String unsorted = "HBmvxRbcFJM";
        String sorted = "";

        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < unsorted.length(); i++) {

                if(unsorted.charAt(i) == c || unsorted.charAt(i) == c - 'a' + 'A'){ // look Ascii table
                    sorted += unsorted.charAt(i);

                }
            }
        }
        System.out.println(sorted);
}

    }
