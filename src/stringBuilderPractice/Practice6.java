package stringBuilderPractice;

public class Practice6 {
    public static void main(String[] args) {


    /*
    StringBuilder -> "wdrgt247urtgher&*%34"
    find the sum of all the numbers from the given StringBuilder
    use isDigits(); Character.isDigit();
     */

        StringBuilder str = new StringBuilder("wdrgt247urtgher&*%34");
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum+= Integer.parseInt(String.valueOf(str.charAt(i)));

            }
        }
        System.out.println(sum);


    }

}
