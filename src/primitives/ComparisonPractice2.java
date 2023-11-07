package primitives;

public class ComparisonPractice2 {
    public static void main(String[] args) {

        /*
TASK:
there is an event in which you can attend If the age of the person is 18 or older
-represent this scenario with variable/s
-show/print a message like: "you can attend this event" --> t/f
 */

        int requireAge = 18, ageOfPerson = 22;
        boolean canAttend = ageOfPerson >= requireAge;
        System.out.println("You can attend this event " + canAttend);


        /*
if the child is 12 years old or younger they are invited to a birthday party
-show/print message like: "you are invited" --> t/f
 */

        int childRequireAge = 12, ageOfChild = 9;

        boolean areInvited = ageOfChild <= childRequireAge;

        System.out.println("You are invited " + areInvited);

        /*
event for kids
only if the kid is 8 years old to 15 years old are allowed
-show/print message like: "you are okay to come >> " --> t/f
 */

        int kidAge = 10, minAllowedAge = 8, maxAllowedAge = 15;
        boolean okayToCome = kidAge <= maxAllowedAge;
        boolean okayToCome1 = kidAge >= minAllowedAge;
        boolean youAreOkeyToCome = okayToCome == okayToCome1;

        System.out.println("You are okay to come " + youAreOkeyToCome);


        int ageOfKid = 11, requiredMinAgeOfChild = 8, requiredMaxAgeOfChild = 15;
        boolean minAllowed = ageOfKid >= requiredMinAgeOfChild;
        boolean maxAllowed = ageOfKid <= requiredMaxAgeOfChild;
        boolean allowedToAttendEvent = maxAllowed == minAllowed;

        System.out.println("you are okay to come " + allowedToAttendEvent);




                /* event for teens only teens 13-19 yo are allowed - show print message " You are grow enough to come"
                my teen is 11 now
                */

        int ageOfMyTeen = 11, minAllTeenAge = 13, maxAllTeenAge = 19;
        boolean minRequireAllowTeen = ageOfMyTeen >= minAllTeenAge;
        boolean maxRequireAlloowTeen = ageOfMyTeen <= maxAllTeenAge;
        boolean canComeTeens = maxRequireAlloowTeen == minRequireAllowTeen;
         System.out.println("You are grow enough to come " + canComeTeens);




         /*
The hotel is only for people from 21 to 54 yo. My aunt is 61 yo. Outprint "You are wellcome to hotel", if person suits.
          */

        int auntAge = 54, minHotelAge = 21, maxHotelAge = 54;
        boolean minAllowedHotelAge = auntAge >= minHotelAge;
        boolean maxAllowedHotelAge = auntAge <= maxHotelAge;
        boolean wellComeToHotel = (minAllowedHotelAge == maxAllowedHotelAge);

        System.out.println("You are wellcome to hotel " + wellComeToHotel) ;

    }
    }
