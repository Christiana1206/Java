package projectDayElmar;

import java.util.Stack;

public class Brackets {
    /*
    Given string with brackets.Check if string is completed
    Example: "{}[]()" -> completed string
    "()" -> completed string
    "()}{[]" ->is not completed string

    Stack-> stack.pop() -> deleting last pushed element
            stack.push() -> adding element
            Example: stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.pop(); -> remove"3"
            stack.pop(); -> remove"2"
     */

    public static boolean isCompletedString(String str) {
        //Use a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        //Loop through each character in the string
        for(char ch: str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                // if the stack is empty, there's no matching opening bracket
                if(stack.isEmpty()) return false;

                //Pop the top of the stack (should be the matching opening bracket)
                char open = stack.pop();

                //Check if the popped bracket matches the current closing bracket
                if(ch == ')' && open != '(') return false;
                if(ch == '}' && open != '{') return false;
                if(ch == ']' && open != '[') return false;

            }
        } // {}()
        //If the stack is not empty, there are unmatched opening brackets
        return stack.isEmpty();


    }

    public static void main(String[] args) {
        String str = "{}()[]";
        String str2 = "[])({}";
        String str3 = "{}[){}";

        System.out.println(Brackets.isCompletedString(str));
        System.out.println(Brackets.isCompletedString(str2));
        System.out.println(Brackets.isCompletedString(str3));



    }
}
