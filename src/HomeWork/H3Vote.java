package HomeWork;

import java.util.Scanner;

public class H3Vote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = s.nextLine();
        System.out.println("Enter your state code");
        String stateCode = s.next();
        System.out.println("Enter your city");
        String city = s.next();
        System.out.println("Enter your gender");
        String gender = s.next();
        System.out.println("Enter your age");
        int age = s.nextInt();

        fullName = fullName.toUpperCase();
        stateCode = stateCode.toUpperCase();
        gender = gender.toUpperCase();

        boolean conditionToVote = age >= 18 && fullName.charAt(0) == 'A' && fullName.charAt(fullName.length()-1) == 'V' && stateCode.charAt(0) == 'I'
                && stateCode.charAt(stateCode.length()-1) == 'L' && city.length() < 10 && gender.equalsIgnoreCase("F");

        System.out.println(conditionToVote);



    }
}
