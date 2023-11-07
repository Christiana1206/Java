package loops;

public class DeleteMe {
    public static void main(String[] args) {
        String city = "chicago";

        for (int i = 0; i < city.length(); i++) {
            System.out.println(i + 1 + ". " + city.charAt(i));
        }


        String str = "There is no BBQ today, it was yesterday";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println("I found letter E");


            String str2 = "I like to do these questions by myself";
            //replace every letter 'o' with a '*'
            //replace every letter 'e' with a '-'

            for (int i = 0; i < str2.length(); i++) {
                if (str2.toLowerCase().charAt(i) == 'o') {
                    str2 = str2.replace('o', '*');

                } else if (str2.toLowerCase().charAt(i) == 'e') {
                    str2 = str2.replace('e', '-');
                }
            }
            System.out.println(str2);


            String name = "Pentagon";

            for(int i=0; i<name.length(); i++){
                System.out.println(i+". "+name.charAt(i));
            }

        }
    }



