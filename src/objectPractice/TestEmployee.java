package objectPractice;

public class TestEmployee {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        System.out.println(e1);


        System.out.println("=========================");
        Employee e2 = new Employee(200);
        Employee e3 = new Employee(200);
        Employee e4 = new Employee(200);
        Employee e5 = new Employee(200);

        System.out.println(e1 == e2); //false
        System.out.println(e1.equals(e2));//false

        System.out.println(e3 == e4);//false
        System.out.println(e3.equals(e4));//false


        String str = "text";
        String str2 = new String("text");
        String str3 = new String("text");
        System.out.println(str.equals(str2));//true
        System.out.println(str2.equals(str3));//true


        Employee e6 = e5; // i has assigned it, e6 is the same object that e5, it has to be true
        System.out.println(e5 == e6);//true
        System.out.println(e5.equals(e6));//true

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        e4 = null;
        e3 = null;
        System.gc();//forces garbage collector to run, it happens behind the scene

        //To check if the garbage collector is running or not we can override the finalize method










    }
}
