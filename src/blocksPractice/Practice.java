package blocksPractice;

public class Practice {

    static int number1;
    String name1;


    //instance block runs for every object

    {
        name1 = "Alex";
        // int number2 = 34;
        System.out.println("Instance Block"); // object block
    }

    //static block runs everytime you reach out the class
    //1- static block runs only oncetime
    //2-

    static{
        // name2 = "David"; //complains, because it's not static field variable
        number1 = 50;
        System.out.println("Static Block"); //class block
    }

    public static void main(String[] args) {
        // Static Block
    }
}
