package primitives;

public class LogicalOperatorPractice {
public static void main(String[] args) {

    //registration to school
    // requirements for a kid to enroll into kindergarden:
    // require in the area


    int kidAge = 4, requireAge = 5;

    boolean liveInArea = true;

     boolean ageResult = kidAge == requireAge;

     boolean successfulEnrollmentInTheSchool = ageResult && liveInArea; // used logical operator

    System.out.println("Your kid is enrolled " + successfulEnrollmentInTheSchool);


    /*
    in ordre for kids to ride a game at the carnival they must be either:
    1. be age t or up
    2. height of the kid is 42" or more
    3. have a parent accompany them
     */


    int ageOfKid = 4, ageMinimum = 7;
    int heightOfKid = 43, heightMinimum = 42;
    boolean withParents = false;
      boolean canRideGame = ageOfKid >= ageMinimum || heightOfKid >= heightMinimum || withParents;

      System.out.println("the kid can ride this game " + canRideGame);

}



}
