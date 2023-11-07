package primitives;

public class LogicalOperatorPractice2 {
    public static void main(String[] args) {

        /*
        you can attend to a master program if:
        your average of 3 scores are 90 or above and your GPA is greater than 3.5
        "you are accepted to the program" + ...
         */

        int requireGradeAverage = 90;
        double minRequireGPA = 3.5, myGPA = 3.7;
        int myTest1 = 82, myTest2 = 91, myTest3 = 97;

        int averageOfMyTestScores = (myTest1+myTest2+myTest3)/3;

        boolean canAttendMastersProgram = averageOfMyTestScores >= requireGradeAverage && myGPA > minRequireGPA;

        System.out.println("You are accepted to this program " + canAttendMastersProgram);

        /*
to graduate your average attendance should be 85% or more
first and second quiz results should be more than 8 points
 */

        int firstAverageAttendance = 85, myFirstAverageAtt = 87;
        int secondAverageAttendance = 8, mySecondAtt = 10;

        boolean requireResult = myFirstAverageAtt >= firstAverageAttendance && mySecondAtt >= secondAverageAttendance;

        System.out.println("Yua are accepted " + requireResult);

int requiredAttendance = 85, myAttendance = 85;
int myFirstQuiz = 10, mySecondQuiz = 9;
int expectedFirstQuizResult = 8, expectedSecondQuizResult = 8;

boolean graduatinf = myAttendance >= requiredAttendance && myFirstQuiz>expectedFirstQuizResult;

System.out.println("You are attendenced " + graduatinf);

/*
to travel to Europe
you need to have passport, valid visa, ticket
if you do not have a visa, you should be citizen of the USA
"I can go to Europe "+ t/f
 */

        boolean myPassport = true, myVisa = false, myTicket = true, myUSACitizenship = true;

        boolean visaReg = myVisa || myUSACitizenship;
        boolean canTravelToEurope = myPassport && myTicket && visaReg;

        System.out.println("You can go to Europe " + canTravelToEurope);


    }
}
