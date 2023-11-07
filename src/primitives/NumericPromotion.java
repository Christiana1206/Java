package primitives;

public class NumericPromotion {
    public static void main(String[] args) {

    byte by1 = 3, by2 = 5;

    // byte by3 = by1 = by2; -> complining due to compile type, due to the data type
        // short by3 = by1 + by2;
         int result1 = by1 + by2;

        double result2 = by1 + by2; //8.8

        System.out.println(result2-result1); //0.0

       // int result3 = result1 - result2; // cant do because result2 is double

        double result3 = result1 - result2;

        float fl = 3.4f;
        double dbl = .45;
       // float result4 = fl * dbl; /error because it wants to promote to double

        double result = fl * dbl ;
        System.out.println(fl*dbl); // no complaints because i am not trying to store theirs
        // just to want print the result out on the cod

        long l = 122344545566L;







    }
}
