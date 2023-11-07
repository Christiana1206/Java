package loops;

public class WhilePractice1 {
    public static void main(String[] args) {

        int numOfStudents = 1, limit = 10;

        while (numOfStudents <= 10) {
            System.out.println("Good morning students, take a seat!");
            numOfStudents++; //10
        }
        System.out.println("****************"); //runs once, it is out of loop
        System.out.println(numOfStudents); //11

        while (numOfStudents <= 10) {
            System.out.println("Good morning students, take a seat!");
            numOfStudents++;
        }
        numOfStudents = 5;
        while(numOfStudents<=10){
            System.out.println("+++++++Good morning students, take a seat!++++++++++++");
            numOfStudents++;


        }
    }
}
