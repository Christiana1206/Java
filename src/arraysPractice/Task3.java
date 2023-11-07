package arraysPractice;

public class Task3 {
    public static void main(String[] args) {

        char[] letters = {'t', 'R', '5', '1', '&', 'A', '8', '*'};

        //print out only the digits from above array

        for(int i = 0; i < letters.length; i++){

            char digits = letters[i]; // or we can sample use letters[i]

            if(digits >= '0' && digits <= '9') {
                System.out.println("digits are"+ digits);
            }
            else if (!(letters[i] >= 'A' && letters[i] <= 'Z' || letters[i] >= 'a' && letters[i] <= 'z')) {
                System.out.println("symbols are" + letters[i]);
            }


        }


    }
}

/*
        else if (letter >= 'A' && letter <= 'Z'){
        System.out.println("letters are"+ letter);
        }else if (!(letters[i] == digits && letters[i] == letter)) {
        System.out.println("symbols are"+ letters);
        }else{
        System.out.println();
        }

 */