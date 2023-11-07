package loops;

public class NestedLoop4 {
    public static void main(String[] args) {

        /*
print out months for the years between 2023 and 2025(inclusive)
2023 --> 1-Jan, 2-Feb, 3-Mar, 4-Apr, 5-May,6-Jun........12-Dec
2024 --> 1-Jan, 2-Feb, 3-Mar, 4-Apr, 5-May,6-Jun........12-Dec
...
 */
       for (int year = 2023; year <= 2025; year++) {
           System.out.print(year + " -->");

           for(int month = 1; month <= 12; month++) {

               switch (month) {
                   case 1: System.out.print(month+" -Jan, ");break;
                   case 2: System.out.print(month+" -Feb, ");break;
                   case 3: System.out.print(month+" -Mar, ");break;
                   case 4: System.out.print(month+" -Apr, ");break;
                   case 5: System.out.print(month+" -May, ");break;
                   case 6: System.out.print(month+" -Jun, ");break;
                   case 7: System.out.print(month+" -Jul, ");break;
                   case 8: System.out.print(month+" -Aug, ");break;
                   case 9: System.out.print(month+" -Sep, ");break;
                   case 10: System.out.print(month+" -Oct, ");break;
                   case 11: System.out.print(month+" -Nov, ");break;
                   case 12: System.out.println(month+" -Dec");break;

               }
           }
       }







    }
}
