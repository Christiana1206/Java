package stringMethods;

public class Practice1 {
    public static void main(String[] args){
        String str = "Test";

        str+="Sunday";
        str = "Sunday";
        System.out.println(str); // Sunday


        System.out.println(str + "Test"); // SundayTest


        str.concat("Afternoon");
        System.out.println(str); // still !  Sunday

        str =  str.concat("Afternoon");
        System.out.println(str); // SundayAfternoon

        System.out.println(str.concat(" is here ")); // SundayAfternoon is here
        System.out.println(str); // SundayAfternoon --> print just origin str




    }
}
