package objectPractice;

import java.util.Arrays;

public class MethodPractice3 {

    /*
    create a method that will take name of students
    it will create "Happy Birthday..." birthday card messages for each of the students
    it will return all messages in another array
     */

    public String[] birthdayMessageGenerator(String[] studentNames) {
        String[] allMessage = new String[studentNames.length];
        for(int i = 0; i < studentNames.length; i++){
            String message = "Happy Birthday"+studentNames[i];
            allMessage[i] = message;
    }
        return allMessage;

    }
    public static void main(String[] args) {
        MethodPractice3 obj = new MethodPractice3();
        String[] b18 = {"jack", "billy", "monika", "tom", "K"};
        String[] resultWithMessage = obj.birthdayMessageGenerator(b18);
        System.out.println(Arrays.toString(resultWithMessage));
    }
}
